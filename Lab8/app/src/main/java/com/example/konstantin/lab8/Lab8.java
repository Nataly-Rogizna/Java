package com.example.konstantin.lab8;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

public class Lab8 extends AppCompatActivity implements View.OnTouchListener {
    private TextView valueTextView;
    private int upX;
    private int upY;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab8);
        valueTextView = (TextView)findViewById(R.id.valueTextView);
        valueTextView.setOnTouchListener(this);
        upX = 0;
        upY = 0;
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        int x = (int)event.getX();
        int y = (int)event.getY();
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN: {
                x = (int)event.getX();
                y = (int)event.getY();
                break;
            }
            case MotionEvent.ACTION_MOVE: {
                x = (int)event.getX();
                y = (int)event.getY();
                break;
            }
            case MotionEvent.ACTION_UP: {
                upX = (int)event.getX();
                upY = (int)event.getY();
                break;
            }
            case MotionEvent.ACTION_CANCEL: break;
        }
        valueTextView.setText("Down: " + Integer.toString(x) + ", " + Integer.toString(y) + "\n" +
                "Move: " + Integer.toString(upX) + ", " + Integer.toString(upY));
        return true;
    }
}
