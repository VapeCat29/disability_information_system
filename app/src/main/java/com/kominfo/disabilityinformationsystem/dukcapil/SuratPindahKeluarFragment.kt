package com.kominfo.disabilityinformationsystem.dukcapil

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.kominfo.disabilityinformationsystem.R
import com.kominfo.disabilityinformationsystem.databinding.FragmentSuratPindahKeluarBinding

class SuratPindahKeluarFragment : Fragment() {

    private var _binding: FragmentSuratPindahKeluarBinding? = null
    private val binding get() = _binding!!

    override fun onResume() {
        super.onResume()
        val jenisperpindahan = resources.getStringArray(R.array.jenis_perpindahan)
        val arrayAdapter = ArrayAdapter(requireContext(), R.layout.dropdown_item, jenisperpindahan)
        binding.autocompleteDropdownJenispindahPindahkeluar.setAdapter(arrayAdapter)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentSuratPindahKeluarBinding.inflate(inflater,container,false)


        return binding.root

    }

}