package com.client.myplace.detail;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.text.Html;
import android.util.DisplayMetrics;
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
        TextView rent_text = (TextView) findViewById(R.id.rent_txt);
        rent_text.setText(Html.fromHtml("<b>\u20b9 500</b>/month"));
    }
}