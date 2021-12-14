package com.neppplus.imitate_login_logic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        btnLogin.setOnClickListener { 
            
            val id = edtId.text.toString()
            val pw = edtPassword.text.toString()
            
            if( id == "admin" && pw == "qwer") {

                Toast.makeText(this, "관리자님 환영합니다", Toast.LENGTH_SHORT).show()
                
            }
            else {

                Toast.makeText(this, "로그인에 실패했습니다", Toast.LENGTH_SHORT).show()
            }
            
        }
    }
}