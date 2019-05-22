package com.example.aluno.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_bem_vindo.*
import kotlinx.android.synthetic.main.activity_main.*

class BemVindo : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bem_vindo)

        val args:Bundle? = intent?.extras
        val nome:String? = args?.getString("login")
        txtBemVindo.setText(txtBemVindo.text.toString() + " " + nome)

    }
}
