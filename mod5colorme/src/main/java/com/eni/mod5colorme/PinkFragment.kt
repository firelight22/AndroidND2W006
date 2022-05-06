package com.eni.mod5colorme

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.eni.mod5colorme.databinding.FragmentPinkBinding


class PinkFragment : Fragment() {

   lateinit var fpb : FragmentPinkBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fpb = FragmentPinkBinding.inflate(inflater)
        return fpb.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fpb.buttonPink.setOnClickListener {
            if((0..2).random()>=1)
                Navigation.findNavController(view)
                    .navigate(R.id.pinkToGreenFrag)
            else
                Navigation.findNavController(view)
                    .navigate(R.id.pinkToYellowFrag)
        }
    }

}