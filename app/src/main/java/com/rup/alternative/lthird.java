package com.rup.alternative;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class lthird extends AppCompatActivity {
    public ImageView img1b,img2b,img3b,lr3;
    public PaintView2 lp3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lthird);

        img1b = (ImageView) findViewById(R.id.dot21);
        img2b = findViewById(R.id.dot22);
        img3b= findViewById(R.id.dot23);
        lr3=findViewById(R.id.lreset3);

        lp3=(PaintView2)findViewById(R.id.lpaint3);
        blink(img1b);
        blink(img2b);



    }


    public void blink(View v){
        ObjectAnimator anim=ObjectAnimator.ofInt(img1b,"backgroundColor", Color.BLUE,Color.RED,Color.GREEN);

        anim.setEvaluator(new ArgbEvaluator());
        anim.setRepeatMode(ValueAnimator.REVERSE);
        anim.setRepeatCount(ValueAnimator.INFINITE);
        anim.start();
    }





}


