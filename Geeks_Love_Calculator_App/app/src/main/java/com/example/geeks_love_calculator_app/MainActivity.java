package com.example.geeks_love_calculator_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private static Spinner dropdown_list;
    String[] text_languages;
    ArrayAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dropdown_list = findViewById(R.id.programming_languages_list);
        text_languages = getResources().getStringArray(R.array.programming_languages);
        adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, text_languages);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dropdown_list.setAdapter(adapter);
    }

    public void calculate_love(View view){
        String language = dropdown_list.getSelectedItem().toString();
        ImageView image_language = (ImageView) findViewById(R.id.language_logo);
        TextView result = (TextView) findViewById(R.id.result);
        Random random = new Random();
        if(language.equals("C")){
            image_language.setImageResource(R.drawable.c);
        }
        if(language.equals("C++")){
            image_language.setImageResource(R.drawable.cplusplus);
        }
        if(language.equals("C#")){
            image_language.setImageResource(R.drawable.csharp);
        }
        if(language.equals("R")){
            image_language.setImageResource(R.drawable.r);
        }
        if(language.equals("PHP")){
            image_language.setImageResource(R.drawable.php);
        }
        if(language.equals("Python")){
            image_language.setImageResource(R.drawable.pyhton);
        }
        if(language.equals("Javascript")){
            image_language.setImageResource(R.drawable.js);
        }
        if(language.equals("Java")){
            image_language.setImageResource(R.drawable.java);
        }
        image_language.setVisibility(View.VISIBLE);
        result.setText("Love Percentage: "+ random.nextInt(100) + " %");
        result.setVisibility(View.VISIBLE);
    }

}