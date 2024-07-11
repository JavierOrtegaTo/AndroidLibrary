package com.plcoding.image_preview

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast

class ButtonBlue @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyle: Int = 0,
    defStyleRes: Int = 0,
) : LinearLayout(context, attrs, defStyle, defStyleRes){

    init {
        LayoutInflater.from(context).inflate(R.layout.component_button_blue, this, true)
        val btn = findViewById<Button>(R.id.btn_blue)
        btn.setOnClickListener {
            Toast.makeText(context, "wenas gente", Toast.LENGTH_SHORT).show()
        }
    }
}