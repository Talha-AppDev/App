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
                    val intent = Intent(this, act_notifications::class.java)
                    startActivity(intent)
                }
                R.id.NB_profile -> {
                    val intent = Intent(this, act_profile::class.java)
                    startActivity(intent)
                }
            }
            true
        }

        setContentView(binding.root)
    }
}