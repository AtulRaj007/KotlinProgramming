package com.example.kotlinprogramming

import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initialise()
    }

    fun initialise() {
        btn_submit.setOnClickListener(View.OnClickListener {
            if (isValid()) {
                Toast.makeText(this, "Submit is clicked", Toast.LENGTH_SHORT).show()
                goToHomeScreen()
            }
        })
    }

    private fun isValid(): Boolean {
        if (TextUtils.isEmpty(et_username.text.toString().trim())) {
            showToast("Please enter userName.")
            return false;
        } else if (TextUtils.isEmpty(et_password.text.toString().trim())) {
            showToast("Please enter password.")
            return false;
        }
        return true;
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    private fun goToHomeScreen() {
        val intent: Intent = Intent(this,DashboardActivity::class.java)
        startActivity(intent)
    }
}
