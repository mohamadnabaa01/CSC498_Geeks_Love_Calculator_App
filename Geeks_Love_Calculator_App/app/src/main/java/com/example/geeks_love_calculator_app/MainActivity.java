package com.example.geeks_love_calculator_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private static Spinner dropdown_list;
    TableLayout table;
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
        table = findViewById(R.id.tableLayout);
    }

    public void calculate_love(View view){
        String language = dropdown_list.getSelectedItem().toString();
        ImageView image_language = (ImageView) findViewById(R.id.language_logo);
        TextView result = (TextView) findViewById(R.id.result);
        Random random = new Random();
        int love_nb = random.nextInt(100);
        image_language.animate().setDuration(5000).rotation(720).scaleY(1).scaleX(2).alpha(1);
        image_language.setVisibility(View.VISIBLE);
        if(language.equals("C")){
            image_language.setImageResource(R.drawable.c);
            TextView language_name = (TextView) findViewById(R.id.language_c);
            String lang = "C";
            language_name.setText(lang);
            TextView love_percentage = (TextView) findViewById(R.id.love_percentage_c);
            love_percentage.setText(String.valueOf(love_nb));
            ImageView logo = (ImageView) findViewById(R.id.logo_c);
            logo.setImageResource(R.drawable.c);
            TableRow row = (TableRow) findViewById(R.id.row_c);
            row.setVisibility(View.VISIBLE);
        }
        if(language.equals("C++")){
            image_language.setImageResource(R.drawable.cplusplus);
            TextView language_name = (TextView) findViewById(R.id.language_cplusplus);
            String lang = "C++";
            language_name.setText(lang);
            TextView love_percentage = (TextView) findViewById(R.id.love_percentage_cplusplus);
            love_percentage.setText(String.valueOf(love_nb));
            ImageView logo = (ImageView) findViewById(R.id.logo_cplusplus);
            logo.setImageResource(R.drawable.cplusplus);
            TableRow row = (TableRow) findViewById(R.id.row_cplusplus);
            row.setVisibility(View.VISIBLE);
        }
        if(language.equals("C#")){
            image_language.setImageResource(R.drawable.csharp);
            TextView language_name = (TextView) findViewById(R.id.language_csharp);
            String lang = "C#";
            language_name.setText(lang);
            TextView love_percentage = (TextView) findViewById(R.id.love_percentage_csharp);
            love_percentage.setText(String.valueOf(love_nb));
            ImageView logo = (ImageView) findViewById(R.id.logo_csharp);
            logo.setImageResource(R.drawable.csharp);
            TableRow row = (TableRow) findViewById(R.id.row_csharp);
            row.setVisibility(View.VISIBLE);
        }
        if(language.equals("R")){
            image_language.setImageResource(R.drawable.r);
            TextView language_name = (TextView) findViewById(R.id.language_r);
            String lang = "R";
            language_name.setText(lang);
            TextView love_percentage = (TextView) findViewById(R.id.love_percentage_r);
            love_percentage.setText(String.valueOf(love_nb));
            ImageView logo = (ImageView) findViewById(R.id.logo_r);
            logo.setImageResource(R.drawable.r);
            TableRow row = (TableRow) findViewById(R.id.row_r);
            row.setVisibility(View.VISIBLE);
        }
        if(language.equals("PHP")){
            image_language.setImageResource(R.drawable.php);
            TextView language_name = (TextView) findViewById(R.id.language_php);
            String lang = "PHP";
            language_name.setText(lang);
            TextView love_percentage = (TextView) findViewById(R.id.love_percentage_php);
            love_percentage.setText(String.valueOf(love_nb));
            ImageView logo = (ImageView) findViewById(R.id.logo_php);
            logo.setImageResource(R.drawable.php);
            TableRow row = (TableRow) findViewById(R.id.row_php);
            row.setVisibility(View.VISIBLE);
        }
        if(language.equals("Python")){
            image_language.setImageResource(R.drawable.pyhton);
            TextView language_name = (TextView) findViewById(R.id.language_python);
            String lang = "Python";
            language_name.setText(lang);
            TextView love_percentage = (TextView) findViewById(R.id.love_percentage_python);
            love_percentage.setText(String.valueOf(love_nb));
            ImageView logo = (ImageView) findViewById(R.id.logo_python);
            logo.setImageResource(R.drawable.pyhton);
            TableRow row = (TableRow) findViewById(R.id.row_python);
            row.setVisibility(View.VISIBLE);
        }
        if(language.equals("Javascript")){
            image_language.setImageResource(R.drawable.js);
            TextView language_name = (TextView) findViewById(R.id.language_js);
            String lang = "Javascript";
            language_name.setText(lang);
            TextView love_percentage = (TextView) findViewById(R.id.love_percentage_js);
            love_percentage.setText(String.valueOf(love_nb));
            ImageView logo = (ImageView) findViewById(R.id.logo_js);
            logo.setImageResource(R.drawable.js);
            TableRow row = (TableRow) findViewById(R.id.row_js);
            row.setVisibility(View.VISIBLE);
        }
        if(language.equals("Java")) {
            image_language.setImageResource(R.drawable.java);
            TextView language_name = (TextView) findViewById(R.id.language_java);
            String lang = "Java";
            language_name.setText(lang);
            TextView love_percentage = (TextView) findViewById(R.id.love_percentage_java);
            love_percentage.setText(String.valueOf(love_nb));
            ImageView logo = (ImageView) findViewById(R.id.logo_java);
            logo.setImageResource(R.drawable.java);
            TableRow row = (TableRow) findViewById(R.id.row_java);
            row.setVisibility(View.VISIBLE);
        }
        String love_text = "Love Percentage: "+ love_nb + " %";
        result.setText(love_text);
        result.setVisibility(View.VISIBLE);
    }

}