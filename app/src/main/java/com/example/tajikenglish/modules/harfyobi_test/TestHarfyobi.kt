package com.example.tajikenglish.modules.harfyobi_test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.tajikenglish.R
import kotlinx.android.synthetic.main.activity_find_alphabet.*

class TestHarfyobi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_harfyobi)
        // To hide the status bar.
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        btn_start.setOnClickListener {



            val intent = Intent(this, HarfyobiTest::class.java)

            startActivity(intent)
            finish()

        }
    }
}