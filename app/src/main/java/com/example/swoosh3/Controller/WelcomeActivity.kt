package com.example.swoosh3.Controller

import android.content.Intent
import android.os.Bundle
import com.example.swoosh3.R
import kotlinx.android.synthetic.main.activity_welcome.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        GetStartedBtn.setOnClickListener {
            val leagueIntent = Intent(this, LeagueActivity::class.java)
            startActivity(leagueIntent)
        }
    }
}
