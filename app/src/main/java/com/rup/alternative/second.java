package com.rup.alternative;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;

public class second extends AppCompatActivity {
    public PaintView pv2;
    public ImageView r2,n2;
    public TextView txt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        pv2=findViewById(R.id.paint2);
        r2=findViewById(R.id.reset2);
        n2=findViewById(R.id.next2);
        txt2=(TextView)findViewById(R.id.textview2);

        blink(txt2);


        r2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pv2.clearcanvas();
            }
        });

        n2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(second.this,third.class);
                startActivity(intent);
            }
        });

    }

    public void blink(View v){
        ObjectAnimator anim=ObjectAnimator.ofInt(txt2,"backgroundColor", Color.BLUE,Color.RED,Color.GREEN);
        anim.setDuration(800);
        anim.setEvaluator(new ArgbEvaluator());
        anim.setRepeatMode(ValueAnimator.REVERSE);
        anim.setRepeatCount(ValueAnimator.INFINITE);
        anim.start();
    }
}

