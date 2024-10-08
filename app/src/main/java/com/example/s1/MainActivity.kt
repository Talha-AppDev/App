package com.example.s1

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.s1.databinding.ActMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActMainBinding.inflate(layoutInflater)

        binding.navigationBar.selectedItemId = R.id.home

        //to challan payment
        binding.challanPay.setOnClickListener {
            val intent = Intent(this, act_challan_payment::class.java)
            startActivity(intent)
        }

        //to license registration
        binding.licReg.setOnClickListener {
            val intent = Intent(this, act_license_reg::class.java)
            startActivity(intent)
        }

        //to traffic rules
        binding.trafRule.setOnClickListener {
            val intent = Intent(this, act_traffic_rules::class.java)
            startActivity(intent)
        }

        //to feedback
        binding.feedback.setOnClickListener {
            val intent = Intent(this, act_feedback::class.java)
            startActivity(intent)
        }

        //to vehicle registration
        binding.regVeh.setOnClickListener {

            val vehicleNo = binding.regVeh.toString()
            if (vehicleNo.isNotEmpty()) {
                try {
                    val intent = Intent(this, act_reg_vehicle::class.java)
                    startActivity(intent)
                } catch (e: Exception) {
                    Toast.makeText(this, "Error occurred: ${e.message}", Toast.LENGTH_SHORT).show()
                }

            }
        }

        //to license center
        binding.licCntr.setOnClickListener {
            val intent = Intent(this, act_lic_center::class.java)
            startActivity(intent)
        }

        //to notification profile & menu
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
            }
            true
        }

        setContentView(binding.root)
    }
}
