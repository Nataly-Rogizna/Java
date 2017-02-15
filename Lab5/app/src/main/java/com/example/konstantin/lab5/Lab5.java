package com.example.konstantin.lab5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Lab5 extends AppCompatActivity {
    Button clickMe;
    TextView justText;

    private android.view.View.OnClickListener clickMeButtonListener = new View.OnClickListener(){
        public void onClick(View v){
            justText.setText("Button is clicked!");
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab5);
        clickMe = (Button)findViewById(R.id.clickMeButton);
        justText = (TextView)findViewById(R.id.justTextField);
        clickMe.setOnClickListener(clickMeButtonListener);
    }
}
