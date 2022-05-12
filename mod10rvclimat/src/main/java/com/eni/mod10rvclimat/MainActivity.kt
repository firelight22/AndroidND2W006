package com.eni.mod10rvclimat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val alClim = arrayListOf(
            Climatisation("LG","321sdf",5.1f,"scroll","déporté"),
            Climatisation("LG","sd54eer",4.1f,"piston","fixe"),
            Climatisation("LG","321sdf",3.1f,"hélico","déporté"),
            Climatisation("Samsung","321sdf",3.1f,"hélico","fixe"),
            Climatisation("LG","ZAR45ds",3.1f,"hélico","déporté"),
            Climatisation("Samsung","321sdf",2.1f,"hélico","fixe"),
            Climatisation("Daikin","sd3f3",4.5f,"hélico","déporté"),
            Climatisation("Mitsubishi","321sdf",3.9f,"hélico","déporté"),
            Climatisation("Panasonic","zer5bv",4.3f,"piston","fixe"),
            Climatisation("Panasonic","3sd7z",2.3f,"piston","fixe"),
        )
        val rvClim = findViewById<RecyclerView>(R.id.rvClim)
        rvClim.layoutManager = LinearLayoutManager(this)
        rvClim.adapter = ClimatisationAdapter(
            alClim,
            ClimatisationAdapter.OnClimClickListener {
                //Pour créer le toast, utiliser le live template "toast"
                Toast.makeText(this,
                    "Vous avez appuyé sur la clim ${it.marque}",
                    Toast.LENGTH_SHORT).show()
            })
    }
}