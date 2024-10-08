package com.example.s1

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.s1.databinding.ActMenuBinding
import com.example.s1.databinding.ActViolationHistoryBinding

class act_violation_history : AppCompatActivity() {
    private lateinit var binding: ActViolationHistoryBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActViolationHistoryBinding.inflate(layoutInflater)


        //to main activity
        binding.voilationHistoryBtn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        binding.navigationBar.setOnItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                //to notification activity
                R.id.NB_notification -> {
                    val intent = Intent(this, act_notifications::class.java)
                    startActivity(intent)
                }
                //to profile activity
                R.id.NB_profile -> {
                    val intent = Intent(this, act_profile::class.java)
                    startActivity(intent)
                }
                //to menu activity
                R.id.NB_menu -> {
                    val intent = Intent(this, act_menu::class.java)
                    startActivity(intent)
                }
                //to main activity
                R.id.home -> {
                    startActivity(Intent(this, MainActivity::class.java))
                }
            }
            true
        }

        setContentView(binding.root)
    }
}