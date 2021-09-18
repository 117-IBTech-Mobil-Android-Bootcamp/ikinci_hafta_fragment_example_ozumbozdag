package com.info.bootcampweektwo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class WordTestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_word_test)

        supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer,WordTestFragment()).commit()
    }
}