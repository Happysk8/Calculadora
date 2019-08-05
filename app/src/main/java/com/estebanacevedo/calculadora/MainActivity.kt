package com.estebanacevedo.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var n1: Float = 0.0F
    private var n2: Float = 0.0F
    private var operator: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btclear.setOnClickListener {
            n1 = 0.0F
            n2 = 0.0F
            tvdisplay.text = n2.toString()
        }

        btcero.setOnClickListener {
            n2 = n2 * 10 + 0
            tvdisplay.text = n2.toString()
        }

        btuno.setOnClickListener {
            n2 = n2 * 10 + 1
            tvdisplay.text = n2.toString()
        }

        btdos.setOnClickListener {
            n2 = n2 * 10 + 2
            tvdisplay.text = n2.toString()
        }

        bttres.setOnClickListener {
            n2 = n2 * 10 + 3
            tvdisplay.text = n2.toString()
        }

        btcuatro.setOnClickListener {
            n2 = n2 * 10 + 4
            tvdisplay.text = n2.toString()
        }

        btcinco.setOnClickListener {
            n2 = n2 * 10 + 5
            tvdisplay.text = n2.toString()
        }

        btseis.setOnClickListener {
            n2 = n2 * 10 + 6
            tvdisplay.text = n2.toString()
        }

        btsiete.setOnClickListener {
            n2 = n2 * 10 + 7
            tvdisplay.text = n2.toString()
        }

        btocho.setOnClickListener {
            n2 = n2 * 10 + 8
            tvdisplay.text = n2.toString()
        }

        btnueve.setOnClickListener {
            n2 = n2 * 10 + 9
            tvdisplay.text = n2.toString()
        }

        btproducto.setOnClickListener {
            n1 = n2
            n2 = 0.0F
            operator = "*"
            tvdisplay.text = operator
        }

        btsuma.setOnClickListener {
            n1 = n2
            n2 = 0.0F
            operator = "+"
            tvdisplay.text = operator
        }

        btresta.setOnClickListener {
            n1 = n2
            n2 = 0.0F
            operator = "-"
            tvdisplay.text = operator
        }

        btcociente.setOnClickListener {
            n1 = n2
            n2 = 0.0F
            operator = "/"
            tvdisplay.text = operator
        }

        btigual.setOnClickListener {
            n2 = when (operator){
                "*" -> n1 * n2
                "+" -> n1 + n2
                "-" -> n1 - n2
                "/" -> n1 / n2
                else -> n2
            }
            operator = ""
            tvdisplay.text = n2.toString()
        }
    }
}
