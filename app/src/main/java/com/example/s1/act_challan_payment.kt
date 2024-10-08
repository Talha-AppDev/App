package com.example.s1

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.s1.databinding.ActChallanPaymentBinding

class act_challan_payment : AppCompatActivity() {
    private lateinit var binding: ActChallanPaymentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActChallanPaymentBinding.inflate(layoutInflater)

        //to main activity
        binding.challanPayBtn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }


        binding.navigationBar.setOnItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                //to notification activity
                R.id.NB_notification -> {
                    startActivity(Intent(this, act_notifications::class.java))
                }
                //to profile activity
                R.id.NB_profile -> {
                    startActivity(Intent(this, act_profile::class.java))
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