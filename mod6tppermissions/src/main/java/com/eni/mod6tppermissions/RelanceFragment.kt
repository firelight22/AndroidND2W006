package com.eni.mod6tppermissions

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.app.ActivityCompat
import com.eni.mod6tppermissions.databinding.FragmentRelanceBinding

const val REQUEST_CODE_SEND_SMS = 123456
class RelanceFragment : Fragment() {
    lateinit var frb : FragmentRelanceBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        frb = FragmentRelanceBinding.inflate(inflater)
        return frb.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //Demander explicitement la permission d'envoyer des sms
        //On associe cette demande à REQUEST_CODE_SEND_SMS
        frb.button.setOnClickListener {
            requestPermissions(
                arrayOf(Manifest.permission.SEND_SMS),
                REQUEST_CODE_SEND_SMS
            )
        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if(requestCode == REQUEST_CODE_SEND_SMS &&
            grantResults[0] == 0){
            //Envoi de SMS via Intent
            val intentSms = Intent(
                Intent.ACTION_SENDTO,
                Uri.parse("smsto:${frb.editTextPhone.text.toString()}")
            )
            intentSms.putExtra("sms_body","le corps de mon message")
            startActivity(intentSms)
        }
    }
}