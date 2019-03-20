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

public class fifth extends AppCompatActivity {
    public PaintView pv5;
    public ImageView r5,n5;
    public TextView txt5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);
        pv5=findViewById(R.id.paint5);
        r5=findViewById(R.id.reset5);
        n5=findViewById(R.id.next5);
        txt5=(TextView)findViewById(R.id.textview5);

        blink(txt5);


        r5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pv5.clearcanvas();
            }
        });

        n5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(fifth.this,sixth.class);
                startActivity(intent);
            }
        });

    }

    public void blink(View v){
        ObjectAnimator anim=ObjectAnimator.ofInt(txt5,"backgroundColor", Color.BLUE,Color.RED,Color.GREEN);
        anim.setDuration(800);
        anim.setEvaluator(new ArgbEvaluator());
        anim.setRepeatMode(ValueAnimator.REVERSE);
        anim.setRepeatCount(ValueAnimator.INFINITE);
        anim.start();
    }
}


