package com.kominfo.disabilityinformationsystem.dukcapil

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.kominfo.disabilityinformationsystem.R
import com.kominfo.disabilityinformationsystem.databinding.FragmentAktifkanDataPendudukBinding


class AktifkanDataPendudukFragment : Fragment() {

    private var _binding: FragmentAktifkanDataPendudukBinding? = null
    private val binding get() = _binding!!

    override fun onResume() {
        super.onResume()
        val keperluan = resources.getStringArray(R.array.keperluan_pengaktifan)
        val arrayAdapter = ArrayAdapter(requireContext(), R.layout.dropdown_item, keperluan)
        binding.aktifkandataKeperluanAutocomplete.setAdapter(arrayAdapter)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentAktifkanDataPendudukBinding.inflate(inflater,container,false)

        return binding.root
    }


}