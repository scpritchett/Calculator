package com.example.scpritchett.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private TextView screen;
    private String str,str2,str3,sign,result;
    private double a,b,c,d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        screen = (TextView)findViewById(R.id.result_text);
        str = "";
    }

    public void onClick(View v){
        Button button = (Button) v;
        str += button.getText().toString();
        screen.setText(str);
        a = Double.parseDouble(str);
    }

    public void onClickSign(View v){
        Button button = (Button) v;
        sign = button.getText().toString();
        screen.setText(sign);
        str = "";
    }

    public void calculate(View v){
        Button button = (Button) v;
        str2 = screen.getText().toString();
        screen.setText(str2);
        b = Double.parseDouble(str2);
        if(sign.equals("+")){
            result = a+b+"";
        }
        else if(sign.equals("-")){
            result = a-b+"";
        }
        else if(sign.equals("x")){
            result = a*b+"";
        }
        else if(sign.equals("÷")){
            result = a/b+"";
        }
        else{
            screen.setText("User error; restart app.");
        }
        screen.setText(result);
        str = "";
        str2 = "";
    }


    public void buttonACPressed(View view) {
        str = "";
        str2 = "";
        screen.setText("0");
    }

    public void buttonNegPressed(View view) {
        str = "-" + str;
        screen.setText(str);
    }

    public void buttonPercentPressed(View view) {
        c = Double.parseDouble(str);
        str = c * 0.01 + "";
        screen.setText(str);
    }

    /* public void buttonSevenPressed(View view) {
        TextView result = (TextView) findViewById(R.id.result_text);
        result.setText(R.string.seven);
    }

    public void buttonEightPressed(View view) {
        TextView result = (TextView) findViewById(R.id.result_text);
        result.setText(R.string.eight);
    }

    public void buttonNinePressed(View view) {
        TextView result = (TextView) findViewById(R.id.result_text);
        result.setText(R.string.nine);
    }

    public void buttonFourPressed(View view) {
        TextView result = (TextView) findViewById(R.id.result_text);
        result.setText(R.string.four);
    }

    public void buttonFivePressed(View view) {
        TextView result = (TextView) findViewById(R.id.result_text);
        result.setText(R.string.five);
    }

    public void buttonSixPressed(View view) {
        TextView result = (TextView) findViewById(R.id.result_text);
        result.setText(R.string.six);
    }

    public void buttonOnePressed(View view){
        TextView result = (TextView) findViewById(R.id.result_text);
        result.setText(R.string.one);
    }

    public void buttonTwoPressed(View view) {
        TextView result = (TextView) findViewById(R.id.result_text);
        result.setText(R.string.two);
    }

    public void buttonThreePressed(View view) {
        TextView result = (TextView) findViewById(R.id.result_text);
        result.setText(R.string.three);
    }

    public void buttonZeroPressed(View view) {
        TextView result = (TextView) findViewById(R.id.result_text);
        result.setText(R.string.zero);
    }

    public void buttonDecimalPressed(View view) {
        TextView result = (TextView) findViewById(R.id.result_text);
        result.setText(R.string.decimal);
    }

    public void buttonPlusPressed(View view) {
        TextView result = (TextView) findViewById(R.id.result_text);
        result.setText(R.string.plus);
    }

    public void buttonMinusPressed(View view) {
        TextView result = (TextView) findViewById(R.id.result_text);
        result.setText(R.string.minus);
    }

    public void buttonMultPressed(View view) {
        TextView result = (TextView) findViewById(R.id.result_text);
        result.setText(R.string.multiply);
    }

    public void buttonDividePressed(View view) {
        TextView result = (TextView) findViewById(R.id.result_text);
        result.setText(R.string.divide);
    } */
}
