package com.eni.mod6intentimpl

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.ActivityCompat

const val REQUEST_CODE_CALL = 46
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Je demande la permission explicitement
        ActivityCompat.requestPermissions(
            this,
            arrayOf(Manifest.permission.CALL_PHONE),
            REQUEST_CODE_CALL
        )
        //var intentSms = Intent(
        //    Intent.ACTION_VIEW,
        //    Uri.parse("geo:46.316,-0.47428")
        //)
        //startActivity(intentSms)
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if(requestCode == REQUEST_CODE_CALL &&
            grantResults[0] == 0){
            var intentSms = Intent(
                Intent.ACTION_CALL,
                Uri.parse("tel:061234578")
            )
            startActivity(intentSms)
        }
    }
}