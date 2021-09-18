package com.info.bootcampweektwo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*

class SplashActivity : AppCompatActivity() {

    private val DELAY:Long=3*1000
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Timer().schedule(object :TimerTask(){
            override fun run() {
                val intent=Intent(applicationContext, WordTestActivity::class.java)
                finish()//Splash activity sayfasını back stackten kaldırabilmek adına kullandım.
                startActivity(intent)
            }
        },DELAY)
    }
}