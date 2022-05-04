package com.eni.mod5navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.eni.mod5navigation.databinding.FragmentSignInBinding


class SignInFragment : Fragment() {
    lateinit var fsib: FragmentSignInBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
         fsib = FragmentSignInBinding.inflate(
            inflater,
            container,
            false)
        return fsib.root
    }

}