package com.example.przem.calculatorbmiwhr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton imageButton;
    ImageButton imageButton2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        //------------------------------------------------------------------------------------

        ImageButton imageButton2 = (ImageButton) findViewById(R.id.whrbutton2);
        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity3();
            }
        });


//------------------------------------------------------------------------------------

        ImageButton imageButton = (ImageButton) findViewById(R.id.bmibutton2);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
    }
    public void openActivity2() {
        Intent intent = new Intent(this, Main3Activity.class);
        startActivity(intent);
    }

        public void openActivity3() {
            Intent intent2 = new Intent(this, Main2Activity.class);
            startActivity(intent2);



    }
}