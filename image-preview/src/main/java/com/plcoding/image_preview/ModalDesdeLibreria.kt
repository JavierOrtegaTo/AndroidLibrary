package com.plcoding.image_preview

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.DialogFragment

class ModalDesdeLibreria : DialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.modal_test_libreria, container, false)

        val title = view.findViewById<TextView>(R.id.textTitle)
        val message = view.findViewById<TextView>(R.id.textDescription)

        // Configura el botón de continuar
        val btnBlue = view.findViewById<Button>(R.id.btnContinue)
        btnBlue.setOnClickListener {
            title.text = "WOW esto funcion"
            message.text = "nos lo podemos tomar"
        }

        // Configura el botón de cierre
        val btnClose = view.findViewById<Button>(R.id.btnCancel)
        btnClose.setOnClickListener {
            dismiss()
        }

        return view
    }

    override fun onStart() {
        super.onStart()
        dialog?.window?.setLayout(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )
    }
}
