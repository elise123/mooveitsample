package com.ideyatech.bracelet.main;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by kendeng on 4/21/2016.
 */
public class AzulMerchant extends AppCompatActivity {

    ListView list;

    String[] merchants = {"<font color=#FF9900 size=1dp>Toby's Sports</font><br /><a href=http://www.tobys.com>http://www.tobys.com</a>",
            "<font color=#FF9900>Adidas Philippines</font><br /><a href=http://shop.adidas.com.ph>http://shop.adidas.com.ph</a>",
            "<font color=#FF9900>Healthy Options</font><br /><a href=http://www.healthyoptions.com.ph>http://www.healthyoptions.com.ph</a>",
            "<font color=#FF9900>Gold's Gym Philippines</font><br /><a href=http://www.goldsgym.com.ph>http://www.goldsgym.com.ph</a>"};
    String[] link = {"http://www.tobys.com", "http://shop.adidas.com.ph", "http://www.healthyoptions.com.ph", "http://www.goldsgym.com.ph"};

    Integer[] imgId = {R.drawable.mer1, R.drawable.mer2, R.drawable.mer3, R.drawable.mer4};

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_azul_merchant);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_awesome_toolbar);
        setSupportActionBar(myToolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        //RewardsList adapter = new RewardsList(AzulRewards.this, web, webcomp, webdesc, webexp, imgId);
        RewardsList adapter = new RewardsList(AzulMerchant.this, merchants, imgId);
        list = (ListView) findViewById(R.id.listview);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(link[position]));
                startActivity(browserIntent);
            }
        });
    }

}
