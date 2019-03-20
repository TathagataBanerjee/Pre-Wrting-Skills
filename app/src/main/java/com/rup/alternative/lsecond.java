package com.rup.alternative;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class lsecond extends AppCompatActivity {

    public ImageView img1a,img2a,img3a,rs,nxt;
    public PaintView2 pt;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lsecond);


        img1a = (ImageView) findViewById(R.id.dot11);
        img2a = findViewById(R.id.dot12);
        img3a= findViewById(R.id.dot13);
        rs=findViewById(R.id.lreset2);
        nxt=findViewById(R.id.lnext2);
        pt=(PaintView2)findViewById(R.id.lpaint2);
        blink(img1a);
        blink(img2a);


        nxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(lsecond.this,lthird.class);
                startActivity(intent);
            }
        });
    }


    public void blink(View v){
        ObjectAnimator anim=ObjectAnimator.ofInt(img1a,"backgroundColor", Color.BLUE,Color.RED,Color.GREEN);

        anim.setEvaluator(new ArgbEvaluator());
        anim.setRepeatMode(ValueAnimator.REVERSE);
        anim.setRepeatCount(ValueAnimator.INFINITE);
        anim.start();
    }





}




