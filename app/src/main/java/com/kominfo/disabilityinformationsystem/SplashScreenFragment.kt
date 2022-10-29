package com.kominfo.disabilityinformationsystem

import android.content.Context
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.kominfo.disabilityinformationsystem.databinding.FragmentSplashScreenBinding

class SplashScreenFragment : Fragment() {

    private var _binding: FragmentSplashScreenBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentSplashScreenBinding.inflate(inflater,container,false)

        Handler(Looper.getMainLooper()).postDelayed({

            lifecycleScope.launchWhenResumed{
                if(onBoardingFinished()){
                    findNavController().navigate(R.id.action_splashScreenFragment_to_berandaFragment)
                }else{
                    findNavController().navigate(R.id.action_splashScreenFragment_to_onboardingFragment)
                }
            }
        }, 2000)

        return binding.root
    }

    private fun onBoardingFinished():Boolean{
        val sharedPref = requireActivity().getSharedPreferences("onBoarding", Context.MODE_PRIVATE)
        return sharedPref.getBoolean("Finished",false)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}