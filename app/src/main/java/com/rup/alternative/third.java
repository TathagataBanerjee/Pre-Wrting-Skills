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
import android.widget.TextView;

public class third extends AppCompatActivity {

    public PaintView pv3;
    public ImageView r3,n3;
    public TextView txt3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        pv3=findViewById(R.id.paint3);
        r3=findViewById(R.id.reset3);
        n3=findViewById(R.id.next3);
        txt3=(TextView)findViewById(R.id.textview3);

        blink(txt3);


        r3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pv3.clearcanvas();
            }
        });

        n3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(third.this,fourth.class);
                startActivity(intent);
            }
        });

    }

    public void blink(View v){
        ObjectAnimator anim=ObjectAnimator.ofInt(txt3,"backgroundColor", Color.BLUE,Color.RED,Color.GREEN);
        anim.setDuration(800);
        anim.setEvaluator(new ArgbEvaluator());
        anim.setRepeatMode(ValueAnimator.REVERSE);
        anim.setRepeatCount(ValueAnimator.INFINITE);
        anim.start();
    }
}

