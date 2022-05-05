package com.eni.mod5navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.eni.mod5navigation.databinding.FragmentSignInBinding


class SignInFragment : Fragment() {
    lateinit var fsib: FragmentSignInBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        //On récupère sous forme de Binding notre Layout de fragment
         fsib = FragmentSignInBinding.inflate(inflater)
        // on récupère du binding le constraint layout contenant les vues
        //pour que onCreateView puisse l'afficher à l'écran
        return fsib.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fsib.buttonSignIn.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.signInToHome)
        )
        //fsib.buttonSignIn.setOnClickListener {
        //    Navigation.findNavController(view).navigate(R.id.signInToHome)
        //}
    }

}