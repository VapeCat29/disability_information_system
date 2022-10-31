package com.kominfo.disabilityinformationsystem.dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.kominfo.disabilityinformationsystem.databinding.CekpbbDialogBinding

class CekPbbDialog: DialogFragment() {

    private val TAG = "PBBDialog"

    private var _binding: CekpbbDialogBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = CekpbbDialogBinding.inflate(inflater,container,false)

        binding.cekpbbCekBtn.setOnClickListener{
            dismiss()
        }

        binding.cekpbbCloseBtn.setOnClickListener{
            dismiss()
        }

        return binding.root
    }
}