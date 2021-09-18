package com.info.bootcampweektwo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_question.*
import java.util.logging.Handler

class QuestionActivity : AppCompatActivity() {

    var value = 20
    val handler = android.os.Handler()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)


        val mainWord = intent.getStringExtra("word")
        wordTextBox.text = mainWord
        val options = intent.getStringArrayExtra("options")
        first_word.text = options!![0]
        second_word.text = options!![1]
        third_word.text = options!![2]
        last_word.text = options!![3]

        updateProgressBar()

    }

    fun updateProgressBar() {

        circle_progress_bar.progress = 20
        Thread(Runnable {
            while (value >0) {

                value -= 1
                handler.post {
                    circle_progress_bar!!.progress = value
                    text_view_progress!!.text = value.toString()+"\n"+"sn"
                }
                try {
                    Thread.sleep(1000)
                } catch (e: InterruptedException) {
                    e.printStackTrace()
                }



            }
        }).start()

    }
}


