package com.example.mad_m1_b1sb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button calc_spd, calc_time, nxtpg;
    EditText input_spd, input_time;
    TextView output_spd, output_time;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calc_spd = findViewById(R.id.speed_button);
        calc_time = findViewById(R.id.time_button);
        input_spd = findViewById(R.id.edit_speed);
        input_time = findViewById(R.id.edit_time);
        output_spd = findViewById(R.id.speed_res);
        output_time = findViewById(R.id.time_res);
        nxtpg = findViewById(R.id.nextbtn);

        calc_spd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float num = Float.parseFloat(input_spd.getText().toString());
                float result = num*0.28f;
                output_spd.setText(String.valueOf(result));
            }
        });

        calc_time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float num = Float.parseFloat(input_time.getText().toString());
                float result = num*60;
                output_time.setText(String.valueOf(result));
            }
        });

        nxtpg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent info = new Intent(MainActivity.this,ConversionInfo.class);
                startActivity(info);
            }
        });




    }
}