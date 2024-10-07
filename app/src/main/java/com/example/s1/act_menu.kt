package com.example.s1

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.s1.databinding.ActMainBinding
import com.example.s1.databinding.ActMenuBinding

class act_menu : AppCompatActivity() {

    private lateinit var binding: ActMenuBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActMenuBinding.inflate(layoutInflater)

        binding.menuBtn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        binding.VH.setOnClickListener {
            val intent = Intent(this, act_violation_history::class.java)
            startActivity(intent)
        }

        binding.PM.setOnClickListener{
            val intent = Intent(this, act_challan_payment::class.java)
            startActivity(intent)
        }

        binding.VHTv.setOnClickListener {
            val intent = Intent(this, act_violation_history::class.java)
            startActivity(intent)
        }

        binding.navigationBar.setOnItemSelectedListener {
            menuItem ->
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