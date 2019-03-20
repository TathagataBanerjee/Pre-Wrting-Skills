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

public class fourth extends AppCompatActivity {
    public PaintView pv4;
    public ImageView r4,n4;
    public TextView txt4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        pv4=findViewById(R.id.paint4);
        r4=findViewById(R.id.reset4);
        n4=findViewById(R.id.next4);
        txt4=(TextView)findViewById(R.id.textview4);

        blink(txt4);


        r4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pv4.clearcanvas();
            }
        });

        n4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(fourth.this,fifth.class);
                startActivity(intent);
            }
        });

    }

    public void blink(View v){
        ObjectAnimator anim=ObjectAnimator.ofInt(txt4,"backgroundColor", Color.BLUE,Color.RED,Color.GREEN);
        anim.setDuration(800);
        anim.setEvaluator(new ArgbEvaluator());
        anim.setRepeatMode(ValueAnimator.REVERSE);
        anim.setRepeatCount(ValueAnimator.INFINITE);
        anim.start();
    }
}

