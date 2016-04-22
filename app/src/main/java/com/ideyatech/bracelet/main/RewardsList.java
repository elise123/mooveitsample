package com.ideyatech.bracelet.main;

import android.app.Activity;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by kendeng on 4/21/2016.
 */
public class RewardsList extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] rewards;
//    private final String[] rewardscomp;
//    private final String[] rewardsdesc;
//    private final String[] rewardsexp;
    private final Integer[] imageId;

    //public RewardsList(Activity context, String[] web, String[] webcomp, String[] webdesc, String[] webexp, Integer[] imageId){
    public RewardsList(Activity context, String[] rewards, Integer[] imageId){
        super(context, R.layout.list_rewards, rewards);
        this.context = context;
        this.rewards = rewards;
//        this.rewardscomp = rewardscomp;
//        this.rewardsdesc = rewardsdesc;
//        this.rewardsexp = rewardsexp;
        this.imageId = imageId;
    }

    public View getView(int position, View view, ViewGroup parent){
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.list_rewards, null, true);
        TextView txtRewards = (TextView) rowView.findViewById(R.id.txt);
//        TextView txtRewardsComp = (TextView) rowView.findViewById(R.id.txt1);
//        TextView txtRewardsDesc = (TextView) rowView.findViewById(R.id.txt2);
//        TextView txtRewardsExp = (TextView) rowView.findViewById(R.id.txt3);

        ImageView imageView = (ImageView) rowView.findViewById(R.id.img);
        txtRewards.setText(Html.fromHtml(rewards[position]));
//        txtRewardsComp.setText(rewardscomp[position]);
//        txtRewardsDesc.setText(rewardsdesc[position]);
//        txtRewardsExp.setText(rewardsexp[position]);



        imageView.setImageResource(imageId[position]);
        return rowView;
    }
}
