package com.example.geeks_love_calculator_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    private Spinner dropdown_list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dropdown_list = findViewById(R.id.programming_languages_list);
    }

}