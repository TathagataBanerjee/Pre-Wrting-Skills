package com.rup.alternative;

import android.content.ClipData;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.DragEvent;
import android.view.MotionEvent;
import android.view.View;

import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;



public class match extends AppCompatActivity {
    TextView dragtext, dragtext2, dragtext3, dragtext4;
    RelativeLayout dropbutton, dropbutton2, dropbutton3, dropbutton4;
    TextView textView, sucess;
    MediaPlayer correct, wrong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_match);
        dragtext = (TextView) findViewById(R.id.one);
        dragtext2 = (TextView) findViewById(R.id.two);
        dragtext3 = (TextView) findViewById(R.id.three);
        dragtext4 = (TextView) findViewById(R.id.four);
        dropbutton = (RelativeLayout) findViewById(R.id.drag_relative);
        dropbutton2 = (RelativeLayout) findViewById(R.id.drag_relative2);
        dropbutton3 = (RelativeLayout) findViewById(R.id.drag_relative3);
        dropbutton4 = (RelativeLayout) findViewById(R.id.drag_relative4);
        correct = MediaPlayer.create(match.this, R.raw.correct);
        wrong = MediaPlayer.create(match.this, R.raw.wrong);
        dropbutton.setOnDragListener(listener);
        dropbutton2.setOnDragListener(listener);
        dropbutton3.setOnDragListener(listener);
        dropbutton4.setOnDragListener(listener);
        dragtext.setOnTouchListener(touchListener);
        dragtext2.setOnTouchListener(touchListener);
        dragtext3.setOnTouchListener(touchListener);
        dragtext4.setOnTouchListener(touchListener);
    }
    View.OnDragListener listener = new View.OnDragListener() {
        @Override
        public boolean onDrag(View v, DragEvent event) {
            // TODO Auto-generated method stub
            final int action = event.getAction();
            View view = (View) event.getLocalState();

            switch (action) {
                case DragEvent.ACTION_DRAG_STARTED:
// Executed after startDrag() is called.
                    break;
                case DragEvent.ACTION_DRAG_EXITED:
                    break;
                case DragEvent.ACTION_DRAG_ENTERED:
                    // Executed after the Drag Shadow enters the drop area
                    break;
                case DragEvent.ACTION_DROP: {
                    if (view.getId() == R.id.one && v.getId() == R.id.drag_relative) {
                        correct.start();
                        Toast toast = Toast.makeText(getApplicationContext(), "SUCCESFULL", Toast.LENGTH_SHORT);
                        toast.show();
                    } else if (view.getId() == R.id.two && v.getId() == R.id.drag_relative2) {
                        correct.start();
                        Toast toast = Toast.makeText(getApplicationContext(), "SUCCESFULL", Toast.LENGTH_SHORT);
                        toast.show();
                    }
                    else if (view.getId() == R.id.three && v.getId() == R.id.drag_relative3) {
                            /*RelativeLayout oldparent=(RelativeLayout) view.getParent();
                            oldparent.removeView(view);
                            RelativeLayout newparent=(RelativeLayout)v;
                             dragtext3.setVisibility(View.INVISIBLE);
                            dropbutton3.setVisibility(View.INVISIBLE);*/
                        correct.start();
                        Toast toast = Toast.makeText(getApplicationContext(), "SUCCESFULL", Toast.LENGTH_SHORT);
                        toast.show();
                    }
                    else if (view.getId() == R.id.four && v.getId() == R.id.drag_relative4) {
                        correct.start();
                        Toast toast = Toast.makeText(getApplicationContext(), "SUCCESFULL", Toast.LENGTH_SHORT);
                        toast.show();
                    }
                    else  {
                        wrong.start();
                        Toast toast = Toast.makeText(getApplicationContext(), "UNSUCCESFULL", Toast.LENGTH_SHORT);
                        toast.show();
                    }
                    break;
                }
                case DragEvent.ACTION_DRAG_ENDED: {
                    break;

                }

            }


            return true;
        }
    };

    View.OnTouchListener touchListener = new View.OnTouchListener() {
        @Override
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if(motionEvent.getAction()==MotionEvent.ACTION_DOWN) {
                ClipData data = ClipData.newPlainText("", "");
                View.DragShadowBuilder shadow = new View.DragShadowBuilder(view);
                view.startDrag(data, shadow, view, 0);
                return true;
            }
            else{
                return false;
            }

        }
    };



}