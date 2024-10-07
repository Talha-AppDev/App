package com.example.s1

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.s1.databinding.ActNotificationsBinding
import com.example.s1.databinding.ActProfileBinding


class act_profile : AppCompatActivity() {

    private lateinit var binding: ActProfileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActProfileBinding.inflate(layoutInflater)

        //to top btn to main
        binding.profBtn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        //to notification & menu
        binding.navigationBar.setOnItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.NB_notification -> {
                    val intent = Intent(this, act_notifications::class.java)
                    startActivity(intent)
                }
                R.id.NB_menu -> {
                    val intent = Intent(this, act_menu::class.java)
                    startActivity(intent)
                }
            }
            true
        }

        setContentView(binding.root)
    }
}