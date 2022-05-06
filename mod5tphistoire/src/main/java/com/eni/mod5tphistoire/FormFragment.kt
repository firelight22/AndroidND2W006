package com.eni.mod5tphistoire

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.eni.mod5tphistoire.databinding.FragmentFormBinding


class FormFragment : Fragment() {
    lateinit var ffb : FragmentFormBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        ffb = FragmentFormBinding.inflate(inflater)
        return ffb.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        ffb.buttonComencerHistoire.setOnClickListener {
            var prenom = ffb.editTextPrenom.text.toString()
            var lieu = ffb.editTextLieu.text.toString()
            val histoire = Histoire(prenom,lieu)
            //formFragment -(histoire)-> HistoireFragment
            val action = FormFragmentDirections.actionFormToHistoire(histoire)
                                                  //R.id.actionFormTohistoire
            Navigation.findNavController(view).navigate(action)
        }
    }
}