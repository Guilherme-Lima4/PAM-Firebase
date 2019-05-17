package com.example.aluno.nuvem

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser

class MainActivity : AppCompatActivity() {

    lateinit var btnSignUp: Button
    lateinit var btnLogin: Button
    lateinit var lblEmailDoUsuarioLogado : TextView
    lateinit var fbAuth : FirebaseAuth
    lateinit var txtEmail: EditText
    lateinit var txtPass: EditText



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
