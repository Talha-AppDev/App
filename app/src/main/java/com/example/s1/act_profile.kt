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

        binding.navigationBar.selectedItemId = R.id.NB_profile

        //to top btn to main
        binding.profBtn.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

        binding.navigationBar.setOnItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                //to notification
                R.id.NB_notification -> {
                    startActivity( Intent(this, act_notifications::class.java))
                }
                //to menu
                R.id.NB_menu -> {
                    startActivity(Intent(this, act_menu::class.java))
                }
                //to home
                R.id.home -> {
                    startActivity(Intent(this, MainActivity::class.java))
                }
            }
            true
        }

        setContentView(binding.root)
    }
}