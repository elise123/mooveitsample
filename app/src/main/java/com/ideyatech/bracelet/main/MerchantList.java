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
public class MerchantList extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] merchants;
    private final Integer[] imageId;

    public MerchantList(Activity context, String[] merchants, Integer[] imageId){
        super(context, R.layout.list_merchant, merchants);
        this.context = context;
        this.merchants = merchants;
        this.imageId = imageId;
    }

    public View getView(int position, View view, ViewGroup parent){
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.list_rewards, null, true);
        TextView txtMerchants = (TextView) rowView.findViewById(R.id.txt);

        ImageView imageView = (ImageView) rowView.findViewById(R.id.img);
        txtMerchants.setText(Html.fromHtml(merchants[position]));

        imageView.setImageResource(imageId[position]);
        return rowView;
    }
}
