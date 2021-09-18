package com.info.bootcampweektwo

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_word_test.*

class WordTestFragment:Fragment() {
    val options= arrayOf("Görselleştirmek","Altında","Bağış","Ensülin")
    val word:String="Visualize"
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_word_test,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        buttonStart.setOnClickListener {

            val intent=Intent(activity, QuestionActivity::class.java)
            intent.putExtra("word",word)//Ekranda soru olarak gösterilecek kelimeyi intent ile QuestionActivity'e iletiyor.
            intent.putExtra("options",options)
            startActivity(intent)
        }


    }
}