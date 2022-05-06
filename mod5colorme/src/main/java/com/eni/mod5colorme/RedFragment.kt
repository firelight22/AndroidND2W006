package com.eni.mod5colorme

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.eni.mod5colorme.databinding.FragmentRedBinding

class RedFragment : Fragment() {
    lateinit var frb : FragmentRedBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        frb = FragmentRedBinding.inflate(inflater)
        return frb.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        frb.buttonRed.setOnClickListener {
            if((0..2).random()>=1)
                Navigation.findNavController(view)
                    .navigate(R.id.redToBlueFrag)
            else
                Navigation.findNavController(view)
                    .navigate(R.id.redToOrangeFrag)
        }
    }

}