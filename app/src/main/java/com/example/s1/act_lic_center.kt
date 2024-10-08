package com.example.s1

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.s1.databinding.ActLicCenterBinding
import com.example.s1.databinding.ActTrafficRulesBinding

class act_lic_center : AppCompatActivity() {
    private lateinit var binding: ActLicCenterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActLicCenterBinding.inflate(layoutInflater)

        //to top btn to main
        binding.licenseCenterBtn.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

        //to notification, profile & menu
        binding.navigationBar.setOnItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.NB_notification -> {
                    startActivity(Intent(this, act_notifications::class.java))
                }
                //to profile activity
                R.id.NB_profile -> {
                    startActivity( Intent(this, act_profile::class.java))
                }
                //to menu activity
                R.id.NB_menu -> {
                    startActivity(Intent(this, act_menu::class.java))
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