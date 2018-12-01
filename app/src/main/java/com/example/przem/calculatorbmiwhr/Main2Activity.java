package com.example.przem.calculatorbmiwhr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    public Button button;


    public EditText hip;
    public EditText waist;
    public TextView result2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        hip = (EditText) findViewById(R.id.hip);
        waist = (EditText) findViewById(R.id.waist);
        result2 = (TextView) findViewById(R.id.result2);


        button = (Button) findViewById(R.id.bmibutton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity1();
            }
        });


    }

    public void  openActivity1() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }




    public void calculateWHR (View v){
        String hipStr = hip.getText().toString();
        String waistStr = waist.getText().toString();

        if (hipStr != null && !"".equals(hipStr)
                && waistStr != null && !"".equals(waistStr)) {
            float hipValue = Float.parseFloat(hipStr);
            float waistValue = Float.parseFloat(waistStr);

            float whr = waistValue / hipValue;

            displayWHR(whr);
        }
    }
    private void displayWHR (float whr) {
        String whrLabel = "";

        if (Float.compare(whr, 0.98f) <= 0) {  //gruszka
            whrLabel = getString(R.string.pear_type_obesity);
        } else if (Float.compare(whr, 0.99f) > 0 && Float.compare(whr, 1.01f) <= 0) {
            whrLabel = getString(R.string.normal2);

        } else if (Float.compare(whr, 1.02f) > 0 && Float.compare(whr, 99f) <= 0) {
            whrLabel = getString(R.string.apple_type_obesity);

        }
        whrLabel = whr + "\n\n" + whrLabel;
        result2.setText(whrLabel);


    }

}

