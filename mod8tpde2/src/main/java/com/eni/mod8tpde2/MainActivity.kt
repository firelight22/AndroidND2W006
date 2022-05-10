package com.eni.mod8tpde2

import android.Manifest
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.ActivityCompat
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.eni.mod8tpde2.databinding.ActivityMainBinding

const val REQUEST_CODE_SND_SMS = 345
class MainActivity : AppCompatActivity() {
    lateinit var amb : ActivityMainBinding
    lateinit var vm : LancerDeViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        amb = DataBindingUtil.setContentView(this,R.layout.activity_main)
        vm = ViewModelProvider(this)[LancerDeViewModel::class.java]
        //A chaque changement de valeur de notre dé
        //On affiche celle-ci dans notre TextView
        vm.valeurDe.observe(this,
            {amb.textViewValeurDe.text = it?.toString()}
        )

        amb.button6.setOnClickListener { vm.randomDice(6) }
        amb.button12.setOnClickListener { vm.randomDice(12) }
        amb.button16.setOnClickListener { vm.randomDice(16) }
        amb.button20.setOnClickListener { vm.randomDice(20) }
        amb.buttonSMS.setOnClickListener {
            ActivityCompat.requestPermissions(
                this,
                arrayOf(Manifest.permission.SEND_SMS),
                REQUEST_CODE_SND_SMS
            )
        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        //Si la réponse est OK et que la demande est bien celle d'envoi de SMS
        if(requestCode == REQUEST_CODE_SND_SMS && grantResults[0]== 0){
            val intentSms = Intent(Intent.ACTION_SENDTO,
                Uri.parse("smsto:061234678")
            )
            intentSms.putExtra(
                "sms_body",
                "J'ai lancé le dé et j'ai obtenu ${vm.valeurDe.value.toString()}")
            startActivity(intentSms)
        }
    }

}