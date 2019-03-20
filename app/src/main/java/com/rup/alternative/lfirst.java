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

public class lfirst extends AppCompatActivity {

    public ImageView img1,img2,img3,lr,ln;
    public int c=0;
    public PaintView2 lp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lfirst);

        img1 = (ImageView) findViewById(R.id.dot1);
        img2 = findViewById(R.id.dot2);
        img3 = findViewById(R.id.dot3);

        ln=findViewById(R.id.lnext);
        lp=(PaintView2)findViewById(R.id.lpaint);
        blink(img1);
        blink(img2);


        ln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(lfirst.this,lsecond.class);
                startActivity(intent);
            }
        });
    }


    public void blink(View v){
        ObjectAnimator anim=ObjectAnimator.ofInt(img1,"backgroundColor", Color.BLUE,Color.RED,Color.GREEN);

        anim.setEvaluator(new ArgbEvaluator());
        anim.setRepeatMode(ValueAnimator.REVERSE);
        anim.setRepeatCount(ValueAnimator.INFINITE);
        anim.start();
    }





}








