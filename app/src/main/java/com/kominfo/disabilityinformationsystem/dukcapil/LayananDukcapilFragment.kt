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

        binding.dukcapilAktahilangCV.setOnClickListener {
            val action = LayananDukcapilFragmentDirections.actionLayananDukcapilFragmentToAktaHilangFragment()
            findNavController().navigate(action)
        }

        binding.dukcapilAktifkandataCV.setOnClickListener {
            val action = LayananDukcapilFragmentDirections.actionLayananDukcapilFragmentToAktifkanDataPendudukFragment()
            findNavController().navigate(action)
        }

        binding.dukcapilUbahdataCV.setOnClickListener {
            val action = LayananDukcapilFragmentDirections.actionLayananDukcapilFragmentToUbahDataPendudukFragment()
            findNavController().navigate(action)
        }

        binding.dukcapilAktakematianCV.setOnClickListener {
            val action = LayananDukcapilFragmentDirections.actionLayananDukcapilFragmentToBuatAktaKematianFragment()
            findNavController().navigate(action)
        }

        binding.dukcapilSuratpindahdatangCV.setOnClickListener {
            val action = LayananDukcapilFragmentDirections.actionLayananDukcapilFragmentToSuratPindahDatangFragment()
            findNavController().navigate(action)
        }

        binding.dukcapilSuratpindahkeluarCV.setOnClickListener {
            val action = LayananDukcapilFragmentDirections.actionLayananDukcapilFragmentToSuratPindahKeluarFragment()
            findNavController().navigate(action)
        }

        binding.dukcapilCetakKKCV.setOnClickListener {
            val action = LayananDukcapilFragmentDirections.actionLayananDukcapilFragmentToCetakKartuKeluargaFragment()
            findNavController().navigate(action)
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}