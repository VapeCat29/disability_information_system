package com.kominfo.disabilityinformationsystem

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.kominfo.disabilityinformationsystem.databinding.FragmentBerandaBinding
import com.kominfo.disabilityinformationsystem.dialog.CekPbbDialog
import com.kominfo.disabilityinformationsystem.dialog.PpidDialog


class BerandaFragment : Fragment() {

    private var _binding: FragmentBerandaBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentBerandaBinding.inflate(inflater,container,false)

        binding.berandaDukcapilCard.setOnClickListener {
            val action = BerandaFragmentDirections.actionBerandaFragmentToLayananDukcapilFragment()
            findNavController().navigate(action)
        }

        binding.berandaCekPBBCard.setOnClickListener {
            val dialog = CekPbbDialog()
            dialog.show(parentFragmentManager, "PBBDialog")

        }

        binding.berandaPPIDCard.setOnClickListener {
            val dialog = PpidDialog()
            dialog.show(parentFragmentManager, "PPIDDialog")
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}