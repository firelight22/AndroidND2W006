package com.eni.mod5safeargs

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavDirections
import androidx.navigation.Navigation
import com.eni.mod5safeargs.databinding.FragmentFormBinding


class FormFragment : Fragment() {
    lateinit var ffb : FragmentFormBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        ffb = FragmentFormBinding.inflate(inflater)
        return ffb.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        ffb.buttonSeConnecter.setOnClickListener {
            val user = User(
                ffb.editTextEmail.text.toString(),
                ffb.editTextNom.text.toString(),
                ffb.editTextPrenom.text.toString(),
            )
                        //FragmentADirections->NomAction(arguments)
            val action = FormFragmentDirections.actionFormToHome(user)
            Navigation.findNavController(it).navigate(action)
        }
    }
}