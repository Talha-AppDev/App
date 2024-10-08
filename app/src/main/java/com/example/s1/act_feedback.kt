package com.example.s1

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.s1.databinding.ActFeedbackBinding

class act_feedback : AppCompatActivity() {

    private lateinit var binding: ActFeedbackBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActFeedbackBinding.inflate(layoutInflater)

        //to main
        binding.feedbackBtn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        //to notification and profile
        binding.navigationBar.setOnItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.NB_notification -> {
                    startActivity(Intent(this, act_notifications::class.java))
                }
                R.id.NB_profile -> {
                    startActivity(Intent(this, act_profile::class.java))
                }
                //to home activity
                R.id.home -> {
                    startActivity(Intent(this, MainActivity::class.java))
                }
            }
            true
        }

        setContentView(binding.root)
    }
}