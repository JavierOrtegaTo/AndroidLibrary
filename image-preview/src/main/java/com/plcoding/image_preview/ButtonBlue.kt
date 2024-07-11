package com.plcoding.image_preview

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.Button
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout

class ButtonBlue @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyle: Int = 0,
    defStyleRes: Int = 0,
) : ConstraintLayout(context, attrs, defStyle, defStyleRes) {

    private val btn: Button

    init {
        LayoutInflater.from(context).inflate(R.layout.component_button_blue, this, true)
        btn = findViewById(R.id.btn_blue)
        btn.setOnClickListener {
            Toast.makeText(context, "wenas gente", Toast.LENGTH_SHORT).show()
        }
    }

    override fun setEnabled(enabled: Boolean) {
        btn.isEnabled = enabled
    }
}