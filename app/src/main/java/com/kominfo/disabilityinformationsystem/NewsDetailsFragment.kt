package com.kominfo.disabilityinformationsystem

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.kominfo.disabilityinformationsystem.databinding.FragmentNewsDetailsBinding


class NewsDetailsFragment : Fragment() {
    //view binding
    private var _binding: FragmentNewsDetailsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentNewsDetailsBinding.inflate(inflater,container,false)

        BottomSheetBehavior.from(binding.newsdetailsbottomsheet).apply {
            //peekHeight = 850
            this.state = BottomSheetBehavior.STATE_COLLAPSED
            var height = view?.height
            peekHeight = height?.div(3)?.times(2)!!
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}