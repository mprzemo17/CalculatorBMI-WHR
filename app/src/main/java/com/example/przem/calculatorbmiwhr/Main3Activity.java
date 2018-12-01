package com.example.przem.calculatorbmiwhr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    public Button button;
//xxx

    public EditText height;
    public EditText weight;
    public TextView result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        height = (EditText) findViewById(R.id.height);
        weight = (EditText) findViewById(R.id.weight);
        result = (TextView) findViewById(R.id.result);


        button = (Button) findViewById(R.id.whrbutton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });


    }

    public void  openActivity2() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }






        public void calculateBMI (View v){
            String heightStr = height.getText().toString();
            String weightStr = weight.getText().toString();

            if (heightStr != null && !"".equals(heightStr)
                    && weightStr != null && !"".equals(weightStr)) {
                float heightValue = Float.parseFloat(heightStr) / 100;
                float weightValue = Float.parseFloat(weightStr);

                float bmi = weightValue / (heightValue * heightValue);

                displayBMI(bmi);
            }
        }
        private void displayBMI (float bmi){
            String bmiLabel = "";

            if (Float.compare(bmi, 15f) <= 0) {
                bmiLabel = getString(R.string.very_severely_underweight);
            } else if (Float.compare(bmi, 15f) > 0 && Float.compare(bmi, 16f) <= 0) {
                bmiLabel = getString(R.string.severely_underweight);
            } else if (Float.compare(bmi, 16f) > 0 && Float.compare(bmi, 18.5f) <= 0) {
                bmiLabel = getString(R.string.severely_underweight);
            } else if (Float.compare(bmi, 18.5f) > 0 && Float.compare(bmi, 25f) <= 0) {
                bmiLabel = getString(R.string.underweight);
            } else if (Float.compare(bmi, 25f) > 0 && Float.compare(bmi, 30f) <= 0) {
                bmiLabel = getString(R.string.normal);
            } else if (Float.compare(bmi, 30f) > 0 && Float.compare(bmi, 35f) <= 0) {
                bmiLabel = getString(R.string.obese_class_1);
            } else if (Float.compare(bmi, 35f) > 0 && Float.compare(bmi, 40f) <= 0) {
                bmiLabel = getString(R.string.obese_class_2);
            } else {
                bmiLabel = getString(R.string.obese_class_3);

            }
            bmiLabel = bmi + "\n\n" + bmiLabel;
            result.setText(bmiLabel);


        }
    }

