package com.kominfo.disabilityinformationsystem.dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.kominfo.disabilityinformationsystem.databinding.PpidDialogBinding

class PpidDialog: DialogFragment() {

    private val TAG = "PPIDDialog"

    private var _binding: PpidDialogBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = PpidDialogBinding.inflate(inflater,container,false)

        binding.ppiddialogPIPyaBtn.setOnClickListener{
            dismiss()
        }

        binding.ppiddialogPKyaBtn.setOnClickListener{
            dismiss()
        }

        binding.ppiddialogCloseBtn.setOnClickListener {
            dismiss()
        }

        return binding.root
    }
}