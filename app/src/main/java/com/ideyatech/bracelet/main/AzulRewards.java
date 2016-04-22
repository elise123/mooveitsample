package com.ideyatech.bracelet.main;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by kendeng on 4/21/2016.
 */
public class AzulRewards extends AppCompatActivity {

    ListView list;

    String[] rewards = {"<b><font color=#00CCFF>GU Roctane Gels</font><br /><font color=#FF9900>Toby's Sports</font></b><br /><font color=#000000>Accumulate 20,000 moves to get this.</font><br /><i><font color=#00CCFF>Expires in 3-days</font></i>",
            "<b><font color=#00CCFF>Adidas Trainer's Shoes</font><br /><font color=#FF9900>Adidas Philippines</font></b><br /><font color=#000000>Burn 5,000 calories in the next 24hrs to win.</font><br /><font color=#00CCFF>Expires in 5-days</font>",
            "<b><font color=#00CCFF>Quest Bar Protein Bars</font><br /><font color=#FF9900>Healthy Options</font></b><br /><font color=#000000>Sleep at least 8hrs for 5 consecutive days to get this.</font><br /><font color=#00CCFF>Expires in 1-week</font>",
            "<b><font color=#00CCFF>Gold's Gym Membership</font><br /><font color=#FF9900>Gold's Gym Philippines</font></b><br /><font color=#000000>Be active for more than 30mins. to get this.</font><br /><i><font color=#00CCFF>Expires in 1-month</font></i><br />"};

    String[] reward = {"GU.class", "Adidas", "Health", "Gold"};

//    String[] rewards = {"GU Roctane Gels", "Adidas Trainer's Shoes", "Quest Bar Protein Bars", "Gold's Gym Membership"};
//    String[] rewardscomp = {"Toby's Sports", "Adidas Philippines", "Healthy Options", "Gold's Gym Philippines"};
//    String[] rewardsdesc = {"Accumulate 20,000 moves to get this.", "Burn 5,000 calories in the next 24hrs to win.",
//            "Sleep at least 8hrs for 5 consecutive days to get this.", "Be active for more than 30mins. to get this."};
//    String[] rewardsexp = {"Expires in 3-days", "Expires in 5-days", "Expires in 1-week", "Expires in 1-month"};

    Integer[] imgId = {R.drawable.rew1, R.drawable.rew2, R.drawable.rew3, R.drawable.rew4};

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_azul_rewards);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_awesome_toolbar);
        setSupportActionBar(myToolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        //RewardsList adapter = new RewardsList(AzulRewards.this, web, webcomp, webdesc, webexp, imgId);
        RewardsList adapter = new RewardsList(AzulRewards.this, rewards, imgId);
        list = (ListView) findViewById(R.id.listview);
            list.setAdapter(adapter);
            list.setOnItemClickListener(new AdapterView.OnItemClickListener(){

        public void onItemClick(AdapterView<?> parent, View view, int position, long id){
            Toast.makeText(AzulRewards.this, "Beep" + rewards[+position], Toast.LENGTH_SHORT).show();
            if(position == 0){
            Intent i = new Intent(getApplicationContext(),GU.class);
            startActivity(i);}

            }
        });
    }

}
