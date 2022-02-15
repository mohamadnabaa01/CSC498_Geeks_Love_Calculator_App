package com.example.geeks_love_calculator_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    private Spinner dropdown_list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dropdown_list = findViewById(R.id.programming_languages_list);
        String[] text_languages = getResources().getStringArray(R.array.programming_languages);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, text_languages);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dropdown_list.setAdapter(adapter);
    }

    public static void calculate_love(View view){

    }

}