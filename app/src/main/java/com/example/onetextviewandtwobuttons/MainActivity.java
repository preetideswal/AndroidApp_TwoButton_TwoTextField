package com.example.onetextviewandtwobuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    TextView ttext1;
    TextView ttext2;
    Button bbutton1;
    Button bbutton2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ttext1=(TextView) findViewById(R.id.text1);
        ttext2=(TextView) findViewById(R.id.text2);
        bbutton1=(Button) findViewById(R.id.button1);
        bbutton2=(Button) findViewById(R.id.button2);
        bbutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ttext1.setText("Hello! im Preeti ");
            }
        });
        bbutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ttext2.setText("Roll.No: 154");
            }
        });
    }
}