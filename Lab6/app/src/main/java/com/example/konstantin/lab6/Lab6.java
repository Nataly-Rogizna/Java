package com.example.konstantin.lab6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Lab6 extends AppCompatActivity {
    private TextView X, Y, result;

    View.OnClickListener plusButtonClick = new View.OnClickListener(){
        public void onClick(View v){
            if((X.getText().length() > 0)&&(Y.getText().length() > 0)) {
                int x = Integer.parseInt(X.getText().toString());
                int y = Integer.parseInt(Y.getText().toString());
                result.setText(Integer.toString(x + y));
            }
        }
    };
    View.OnClickListener minusButtonClick = new View.OnClickListener(){
        public void onClick(View v){
            if((X.getText().length() > 0)&&(Y.getText().length() > 0)) {
                int x = Integer.parseInt(X.getText().toString());
                int y = Integer.parseInt(Y.getText().toString());
                result.setText(Integer.toString(x - y));
            }
        }
    };
    View.OnClickListener divButtonClick = new View.OnClickListener(){
        public void onClick(View v){
            if((X.getText().length() > 0)&&(Y.getText().length() > 0)) {
                int x = Integer.parseInt(X.getText().toString());
                int y = Integer.parseInt(Y.getText().toString());
                result.setText(Integer.toString(x / y));
            }
        }
    };
    View.OnClickListener mulButtonClick = new View.OnClickListener(){
        public void onClick(View v){
            if((X.getText().length() > 0)&&(Y.getText().length() > 0)) {
                int x = Integer.parseInt(X.getText().toString());
                int y = Integer.parseInt(Y.getText().toString());
                result.setText(Integer.toString(x * y));
            }
        }
    };
    View.OnClickListener modButtonClick = new View.OnClickListener(){
        public void onClick(View v){
            if((X.getText().length() > 0)&&(Y.getText().length() > 0)) {
                int x = Integer.parseInt(X.getText().toString());
                int y = Integer.parseInt(Y.getText().toString());
                result.setText(Integer.toString(x % y));
            }
        }
    };
    View.OnClickListener xorButtonClick = new View.OnClickListener(){
        public void onClick(View v){
            if((X.getText().length() > 0)&&(Y.getText().length() > 0)) {
                int x = Integer.parseInt(X.getText().toString());
                int y = Integer.parseInt(Y.getText().toString());
                result.setText(Integer.toString(x ^ y));
            }
        }
    };
    View.OnClickListener toBinaryButtonClick = new View.OnClickListener(){
        public void onClick(View v){
            if(X.getText().length() > 0) {
                int x = Integer.parseInt(X.getText().toString());
                result.setText(Integer.toBinaryString(x));
            }
        }
    };
    View.OnClickListener toXButtonClick = new View.OnClickListener(){
        public void onClick(View v){
            X.setText(result.getText().toString());
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab6);
        X = (TextView)findViewById(R.id.xField);
        Y = (TextView)findViewById(R.id.yField);
        result = (TextView)findViewById(R.id.resultField);

        Button plusButton = (Button) findViewById(R.id.plusButton);
        Button minusButton = (Button)findViewById(R.id.minusButton);
        Button mulButton = (Button)findViewById(R.id.mulButton);
        Button divButton = (Button)findViewById(R.id.divButton);
        Button modButton = (Button)findViewById(R.id.modButton);
        Button xorButton = (Button)findViewById(R.id.xorButton);
        Button toBinaryButton = (Button)findViewById(R.id.toBinaryButton);
        Button toXButton = (Button)findViewById(R.id.toXButton);

        plusButton.setOnClickListener(plusButtonClick);
        minusButton.setOnClickListener(minusButtonClick);
        mulButton.setOnClickListener(mulButtonClick);
        divButton.setOnClickListener(divButtonClick);
        modButton.setOnClickListener(modButtonClick);
        xorButton.setOnClickListener(xorButtonClick);
        toBinaryButton.setOnClickListener(toBinaryButtonClick);
        toXButton.setOnClickListener(toXButtonClick);
    }
}
