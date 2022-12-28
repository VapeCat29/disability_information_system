package com.kominfo.disabilityinformationsystem.setting

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.kominfo.disabilityinformationsystem.R
import com.kominfo.disabilityinformationsystem.databinding.FragmentSettingTunaNetraBinding


class SettingTunaNetraFragment : Fragment() {

    private var _binding: FragmentSettingTunaNetraBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //findNavController().navigate(R.id.action_splashScreenFragment_to_onboardingFragment)
        _binding = FragmentSettingTunaNetraBinding.inflate(inflater,container,false)



        return binding.root
    }

    private fun onBoardingFinished(){
        val sharedPref = requireActivity().getSharedPreferences("onBoarding", Context.MODE_PRIVATE)
        val editor = sharedPref.edit()
        editor.putBoolean("Finished", true)
        editor.apply()
    }

}