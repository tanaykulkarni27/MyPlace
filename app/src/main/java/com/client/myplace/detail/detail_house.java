package com.client.myplace.detail;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.text.Html;
import android.util.DisplayMetrics;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.client.myplace.R;

public class detail_house extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_house);
        if(getSupportActionBar() != null)
            getSupportActionBar().hide();
        DisplayMetrics metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);
        RelativeLayout img_layout = (RelativeLayout) findViewById(R.id.outer);
        img_layout.getLayoutParams().height = (int)(metrics.heightPixels  * 0.4);
        ViewPager pager = (ViewPager) findViewById(R.id.pager);
        ImageAdapter adapter = new ImageAdapter(getSupportFragmentManager());
        pager.setAdapter(adapter);
        // rent of house
        TextView rent_text = (TextView) findViewById(R.id.rent_txt);
        rent_text.setText(Html.fromHtml("<b>\u20b9 500</b>/month"));

        // beds

        // bath


        // description of house
        TextView tx = (TextView) findViewById(R.id.house_description);
        tx.setText("Cozy and homey house with the mot affordable price available in the marketplace. Beatifully designed by the world class architect and build with the best construction agency. with a direct view to one of the best beach in australia and sunset as a house.");
    }
}

/*
BED &#x1F6CF;
BATH : 🛁
LOCATE :
* */
