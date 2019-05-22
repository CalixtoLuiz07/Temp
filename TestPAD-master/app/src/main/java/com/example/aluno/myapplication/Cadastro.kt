package com.example.aluno.myapplication

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_cadastro.*

class Cadastro : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)
        btnCadastrarUsuario.setOnClickListener {

            if (loginCadastro.text.toString() != "" && txtSenhaUsuario.text.toString() != "") {

                val intent = Intent()
                intent.putExtra("loginCadastro", loginCadastro.text.toString())
                intent.putExtra("senhaCadastro", txtSenhaUsuario.text.toString())
                setResult(Activity.RESULT_OK, intent)
                finish()
            } else {

                Toast.makeText(this, "Você precisa informar um login e senha", Toast.LENGTH_LONG).show()
            }


        }
    }
}
