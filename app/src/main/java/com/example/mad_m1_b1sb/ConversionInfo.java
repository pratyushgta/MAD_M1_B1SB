package com.example.mad_m1_b1sb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ConversionInfo extends AppCompatActivity {
    TextView desc;
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversion_info);

        desc = findViewById(R.id.description);
        desc.setText(R.string.desc);
        back = findViewById(R.id.backbtn);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent main = new Intent(ConversionInfo.this, MainActivity.class);
                startActivity(main);
            }
        });



    }
}