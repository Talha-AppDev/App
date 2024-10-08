package com.example.s1

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.s1.databinding.ActTrafficRulesBinding

class act_traffic_rules : AppCompatActivity() {

    private lateinit var binding: ActTrafficRulesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActTrafficRulesBinding.inflate(layoutInflater)

        //to top btn to main
        binding.rulesBtn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        //to notification, profile & menu
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
                    R.id.NB_menu -> {
                        val intent = Intent(this, act_menu::class.java)
                        startActivity(intent)
                    }
                    R.id.home ->
                    {
                        startActivity(Intent(this, MainActivity::class.java))
                    }
                }
                true
            }

        setContentView(binding.root)
    }
}