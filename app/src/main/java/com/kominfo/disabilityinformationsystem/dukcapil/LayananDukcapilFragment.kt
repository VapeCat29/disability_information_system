package com.kominfo.disabilityinformationsystem.dukcapil

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.kominfo.disabilityinformationsystem.databinding.FragmentLayananDukcapilBinding

class LayananDukcapilFragment : Fragment() {

    private var _binding: FragmentLayananDukcapilBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentLayananDukcapilBinding.inflate(inflater,container,false)

        binding.dukcapilAktakelahiranCV.setOnClickListener {
            val action = LayananDukcapilFragmentDirections.actionLayananDukcapilFragmentToAktaKelahiranFragment()
            findNavController().navigate(action)
        }

        binding.dukcapilGantinamaaktaCV.setOnClickListener {
            val action = LayananDukcapilFragmentDirections.actionLayananDukcapilFragmentToGantiNamaFragment()
            findNavController().navigate(action)
        }

        return binding.root
    }


}