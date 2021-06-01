package com.pap.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    /**
     * This function is auto created by Android when the Activity Class is created.
     */
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        btn_start.setOnClickListener {

            if (et_name.text.toString().isEmpty()) {

                Toast.makeText(this@MainActivity, "Por favor insira um nome", Toast.LENGTH_SHORT)
                    .show()
            } else {
                val intent = Intent(this@MainActivity, QuizQuestionActivity::class.java)
                intent.putExtra(Constants.USER_NAME, et_name.text.toString())
                startActivity(intent)
                finish()
            }
        }
    }
}