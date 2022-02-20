package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    private EditText num1;
    private TextView view1;
    private Button btn, btn2, btnTask2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second2);
        addListenerOnButton();
    }

    public void addListenerOnButton() {
        num1 = (EditText) findViewById(R.id.editTextNumber);
        view1 = (TextView) findViewById(R.id.textViewResult);
        btn = (Button) findViewById(R.id.button);
        btn2 = (Button) findViewById(R.id.button2);
        btnTask2 = findViewById(R.id.buttonTask2);
        btn.setOnClickListener(
                new View.OnClickListener() {
                    @SuppressLint("SetTextI18n")
                    @Override
                    public void onClick(View view) {
                        double length = Double.parseDouble(num1.getText().toString());
                        Cube cube = new Cube(length);
                        view1.setText(Double.toString(cube.getSurfaceArea()));
                    }
                }
        );
        btn2.setOnClickListener(
                new View.OnClickListener() {
                    @SuppressLint("SetTextI18n")
                    @Override
                    public void onClick(View view) {
                        double length = Double.parseDouble(num1.getText().toString());
                        Cube cube = new Cube(length);
                        view1.setText(Double.toString(cube.getVolume()));
                    }
                }
        );
        btnTask2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent("com.example.myapplication.MainActivity");
                startActivity(intent);
            }
        });
    }
}