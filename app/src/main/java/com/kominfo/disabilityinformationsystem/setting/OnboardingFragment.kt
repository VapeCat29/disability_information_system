package com.kominfo.disabilityinformationsystem.setting

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.kominfo.disabilityinformationsystem.R
import com.kominfo.disabilityinformationsystem.databinding.FragmentOnboardingBinding


class OnboardingFragment : Fragment() {

    private var _binding: FragmentOnboardingBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentOnboardingBinding.inflate(inflater,container,false)

        binding.onboardingTunanetra.setOnClickListener {
            findNavController().navigate(R.id.action_onboardingFragment_to_settingTunaNetraFragment)
        }

        binding.onboardingTunarungu.setOnClickListener {
            findNavController().navigate(R.id.action_onboardingFragment_to_settingTunaRunguFragment)
        }

        binding.onboardingTunawicara.setOnClickListener {
            findNavController().navigate(R.id.action_onboardingFragment_to_settingTunaWicaraFragment)
        }

        binding.onboardingIcBeranda.setOnClickListener{
            findNavController().navigate(R.id.action_onboardingFragment_to_berandaFragment)
            onBoardingFinished()
        }

        binding.onboardingBerandaTxt.setOnClickListener {
            findNavController().navigate(R.id.action_onboardingFragment_to_berandaFragment)
            onBoardingFinished()
        }


        return binding.root
    }

    private fun onBoardingFinished(){
        val sharedPref = requireActivity().getSharedPreferences("onBoarding", Context.MODE_PRIVATE)
        val editor = sharedPref.edit()
        editor.putBoolean("Finished", true)
        editor.apply()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}