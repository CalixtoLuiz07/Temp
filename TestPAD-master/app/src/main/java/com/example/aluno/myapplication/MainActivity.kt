package com.example.aluno.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.aluno.myapplication.R.id.text
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val NEXT_ACTIVITY_CODE = 1
    private var tLogin: EditText? = null
    private var tSenha: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
                val intent = Intent(this, BemVindo::class.java)
        var buttonLogin : Button = findViewById<Button>(R.id.Login)
        tLogin = findViewById<EditText>(R.id.editTextLogin)
        tSenha = findViewById<EditText>(R.id.editTextSenha)

        buttonLogin.setOnClickListener {

            var login : String = tLogin?.text.toString()
            var senha : String = tSenha?.text.toString()

            if(login.toLowerCase()== "leac.calixto@gmail.com" && senha == "1234"){

                val intent = Intent (this, BemVindo::class.java)

                val params = Bundle()
                params.putString("Usuário", login)
                intent.putExtras(params)
                startActivity(intent)
            }
            else{
                Toast.makeText(this,  "Login e/ou senha incorretos!", Toast.LENGTH_LONG).show()
            }

        }

    }
}
