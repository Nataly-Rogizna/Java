package com.example.konstantin.lab10;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

public class Lab10 extends Activity implements View.OnTouchListener {
    Paint p;
    Draw mm;
    private int width = 0, height = 0;
    private int clickCount = 0;
    private int lastX, lastY;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mm = new Draw(this);
        setContentView(mm);
        mm.setOnTouchListener(this);
    }

    public boolean onTouch(View v, MotionEvent event) {
        lastX = (int)event.getX();
        lastY = (int)event.getY();
        switch (event.getAction()) {
            case MotionEvent.ACTION_UP: {
                clickCount++;
                mm.invalidate();
                break;
            }
            default: break;
        }
        return true;
    }

    class Draw extends View {
        public Draw(Context context) {
            super(context);
            p = new Paint();
        }

        @Override
        protected void onSizeChanged(int w, int h, int oldWidth, int oldHeight) {
            width = w;
            height = h;
            super.onSizeChanged(w, h, oldWidth, oldHeight);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            int areaSize;
            if(width > height){
                areaSize = (height - 50)/8;
            }
            else {
                areaSize = width/8;
            }
            canvas.drawColor(Color.WHITE);
            p.setColor(Color.BLACK);
            p.setTextSize(30);
            for(int i = 0; i < 8; i += 2) {
                for (int j = 0; j < 8; j += 2) {
                    canvas.drawRect(i*areaSize, j*areaSize, (i+1)*areaSize, (j+1)*areaSize, p);
                }
            }
            for(int i = 1; i < 8; i += 2) {
                for (int j = 1; j < 8; j += 2) {
                    canvas.drawRect(i*areaSize, j*areaSize, (i+1)*areaSize, (j+1)*areaSize, p);
                }
            }
            if(clickCount == 0) {
                canvas.drawText("Screen size: " + width + "," + height, 10, height - 10, p);
            }
            else {
                canvas.drawText(lastX + " " + lastY + " " + clickCount + " clicks", 10, height - 10, p);
            }
        }
    }
}

