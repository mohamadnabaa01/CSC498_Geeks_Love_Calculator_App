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

    public void calculate_love(View view){
        String language = dropdown_list.getContext().toString();
        ImageView image_language = (ImageView) findViewById(R.id.language_logo);
        TextView result = (TextView) findViewById(R.id.result);
        Random random = new Random();
        if(language.equals("C")){
            image_language.setImageResource(R.drawable.C);
        }
        if(language.equals("C++")){
            image_language.setImageResource(R.drawable.Cplusplus);
        }
        if(language.equals("C#")){
            image_language.setImageResource(R.drawable.Csharp);
        }
        if(language.equals("R")){
            image_language.setImageResource(R.drawable.R);
        }
        if(language.equals("php")){
            image_language.setImageResource(R.drawable.php);
        }
        if(language.equals("python")){
            image_language.setImageResource(R.drawable.pyhton);
        }
        if(language.equals("javascript")){
            image_language.setImageResource(R.drawable.js);
        }
        image_language.setVisibility(View.VISIBLE);
        result.setText("Love Percentage: "+ random.nextInt(100) + " %");
        result.setVisibility(View.VISIBLE);
    }

}