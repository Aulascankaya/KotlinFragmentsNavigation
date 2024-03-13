package com.ulas.kotlinnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.ulas.kotlinnavigation.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {
    private  var binding : FragmentFirstBinding? = null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding= FragmentFirstBinding.inflate(inflater,container,false)
        val view = binding!!.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.button1?.setOnClickListener {
            val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment("ulas")
            Navigation.findNavController(it).navigate(action)
        }


    }


}