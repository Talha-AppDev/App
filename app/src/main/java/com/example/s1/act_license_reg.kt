package com.example.s1

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.s1.databinding.ActLicenseRegBinding

class act_license_reg : AppCompatActivity() {

    lateinit var binding: ActLicenseRegBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActLicenseRegBinding.inflate(layoutInflater)

        //to top btn to main
        binding.licRegBtn.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

        binding.navigationBar.setOnItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.NB_notification -> {
                    startActivity( Intent(this, act_notifications::class.java))
                }
                //to profile
                R.id.NB_profile -> {
                    startActivity(Intent(this, act_profile::class.java))
                }
                //to menu
                R.id.NB_menu -> {
                    val intent = Intent(this, act_menu::class.java)
                    startActivity(intent)
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