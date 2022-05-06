package com.eni.mod5colorme

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.eni.mod5colorme.databinding.FragmentWhiteBinding


class WhiteFragment : Fragment() {
    lateinit var fwb : FragmentWhiteBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fwb = FragmentWhiteBinding.inflate(inflater)
        return fwb.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fwb.buttonWhite.setOnClickListener {
            if((0..2).random()>=1)
                Navigation.findNavController(view)
                    .navigate(R.id.whiteToRedFrag)
            else
                Navigation.findNavController(view)
                    .navigate(R.id.whiteToPinkFrag)
        }
    }
}