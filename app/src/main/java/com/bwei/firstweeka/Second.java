package com.bwei.firstweeka;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Administrator on 2017/6/10.
 * time:
 * author:付智焱
 */
public class Second extends Activity{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);

        TextView text1 = (TextView) findViewById(R.id.text1);
        TextView text2 = (TextView) findViewById(R.id.text2);
        ImageView imageView = (ImageView) findViewById(R.id.imageView);

        Intent intent =  getIntent();

        String s1 = intent.getStringExtra("title");
        String s2 = intent.getStringExtra("text");

        text1.setText(s1);
        text2.setText(s2);


    }
}

