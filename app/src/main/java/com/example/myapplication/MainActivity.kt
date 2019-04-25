package com.example.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonRandom.setOnClickListener(this)
        textNumber.setOnClickListener(this)

        if (supportActionBar != null) {
            supportActionBar!!.hide()
        }

    }

    override fun onClick(v: View?) {

        val numeros = mutableListOf<Int>(1)
        val inicio = 0
        val fim = 59

        if (v?.id == R.id.buttonRandom) {
            for (value in inicio..fim) {
                if (value != 0) numeros.add(value + 1)
            }
            numeros.shuffle()

        }

        textNumber.text = numeros[0].toString()
        textNumber2.text = numeros[1].toString()
        textNumber3.text = numeros[2].toString()
        textNumber4.text = numeros[3].toString()
        textNumber5.text = numeros[4].toString()
        textNumber6.text = numeros[5].toString()

    }

}







