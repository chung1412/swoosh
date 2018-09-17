
package com.example.samliew.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import com.example.samliew.swoosh.R
import kotlinx.android.synthetic.main.activity_welcome.*

class WelcomeActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        getStartedButton.setOnClickListener{
            // two types of intent
            // 1. implicit intent -  communicate to android and gives you the option
            // 2. explicit intent -  communicate with specified java class
            val leagueIntent = Intent(this, LeagueActivity::class.java)
            startActivity(leagueIntent)
        }
    }
}
