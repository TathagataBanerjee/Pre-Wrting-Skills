package com.rup.alternative;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;

public class first extends AppCompatActivity {
public PaintView pv,tatha;
public ImageView r,n,tatha2;
public TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pv=findViewById(R.id.paint);
        tatha=findViewById(R.id.rup);
        r=findViewById(R.id.reset);
        tatha2=findViewById(R.id.rup2);
        n=findViewById(R.id.next);
        txt=(TextView)findViewById(R.id.textview);

        blink(txt);


        r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pv.clearcanvas();
            }
        });
        tatha2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tatha.clearcanvas();
            }
        });

        n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(first.this,second.class);
                startActivity(intent);
            }
        });

    }

    public void blink(View v){
        ObjectAnimator anim=ObjectAnimator.ofInt(txt,"backgroundColor", Color.BLUE,Color.RED,Color.GREEN);
        anim.setDuration(800);
        anim.setEvaluator(new ArgbEvaluator());
        anim.setRepeatMode(ValueAnimator.REVERSE);
        anim.setRepeatCount(ValueAnimator.INFINITE);
        anim.start();
    }
}
