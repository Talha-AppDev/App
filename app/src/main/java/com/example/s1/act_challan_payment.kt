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


        binding.navigationBar.setOnItemSelectedListener {
                menuItem ->
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
                R.id.NB_menu ->
                {
                    val intent = Intent(this, act_menu::class.java)
                    startActivity(intent)
                }
            }
            true
        }

        setContentView(binding.root)
    }
}