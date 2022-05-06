package com.eni.mod5tphistoire

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


class HistoireFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_histoire, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var args = arguments?.let { HistoireFragmentArgs.fromBundle(it) }
        val textView = view.findViewById<TextView>(R.id.textView)
        textView.text = "Il était une fois un être nommé ${args?.histoire?.prenom}"+
                "qui vivait dans un(e) ${args?.histoire?.lieu}"
    }
}