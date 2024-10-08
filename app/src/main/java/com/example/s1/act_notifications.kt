package com.example.s1

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.s1.databinding.ActNotificationsBinding

class act_notifications : AppCompatActivity() {
    private lateinit var binding: ActNotificationsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActNotificationsBinding.inflate(layoutInflater)

        binding.navigationBar.selectedItemId = R.id.NB_notification


            //to top btn to main
        binding.notificationBtn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        //from NB notification and profile and menu
        binding.navigationBar.setOnItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                //to notification activity
                R.id.NB_profile -> {
                    val intent = Intent(this, act_profile::class.java)
                    startActivity(intent)
                }
                //to menu activity
                R.id.NB_menu -> {
                    val intent = Intent(this, act_menu::class.java)
                    startActivity(intent)
                }
                //to notification activity
                R.id.home -> {
                    startActivity(Intent(this, MainActivity::class.java))
                }
            }
            true
        }

        setContentView(binding.root)
    }
}