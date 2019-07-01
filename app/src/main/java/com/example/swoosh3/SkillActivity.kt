package com.example.swoosh3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    var selectedSkill = ""
    var league = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(EXTRA_LEAGUE)
    }

    fun onBeginnerClicked(view: View){
        ballerBtn.isChecked = false
        selectedSkill = "Beginner"
    }

    fun onBallerClicked(view: View){
        beginnerBtn.isChecked = false
        selectedSkill = "Baller"
    }
}
