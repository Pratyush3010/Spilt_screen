package com.example.slidinguppanel

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import com.google.android.material.bottomsheet.BottomSheetBehavior

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sheet : FrameLayout = findViewById(R.id.sheet)

        BottomSheetBehavior.from(sheet).apply {
            peekHeight = 150
            this.state = BottomSheetBehavior.STATE_COLLAPSED
        }
    }
}