package com.example.samliew.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.samliew.swoosh.Utilities.EXTRA_LEAGUE
import com.example.samliew.swoosh.R
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var selectedLeague = " ";

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun leagueNextStage(view:View){

        if(selectedLeague !=" "){
            val skillActivity  = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_LEAGUE,selectedLeague)
            startActivity(skillActivity)
        }else{
            Toast.makeText(this,"please select a league",Toast.LENGTH_SHORT).show()
        }
    }

    fun onMensClicked(view:View){
        womensLeagueToggle.isChecked = false
        coEdLeagueToggle.isChecked = false

        selectedLeague = "mens"
    }

    fun onWomensClicked(view:View){
        menLeagueToggle.isChecked = false
        coEdLeagueToggle.isChecked = false

        selectedLeague = "women"
    }

    fun onCoEdClicked(view:View){
        menLeagueToggle.isChecked = false
        womensLeagueToggle.isChecked = false

        selectedLeague = "co-ed"
    }
}
