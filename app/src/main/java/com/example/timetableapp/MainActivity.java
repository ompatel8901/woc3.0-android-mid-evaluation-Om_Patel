package com.example.timetableapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void monday(View view)
    {
        Intent intent = new Intent(this,Monday.class);
        startActivity(intent);
    }
    public void tuesday(View view)
    {
        Intent intent = new Intent(this,Tuesday.class);
        startActivity(intent);
    }
    public void wednesday(View view)
    {
        Intent intent = new Intent(this,Wednesday.class);
        startActivity(intent);
    }
    public void thursday(View view)
    {
        Intent intent = new Intent(this,Thursday.class);
        startActivity(intent);
    }
    public void friday(View view)
    {
        Intent intent = new Intent(this,Friday.class);
        startActivity(intent);
    }
    public void saturday(View view)
    {
        Intent intent = new Intent(this,Saturday.class);
        startActivity(intent);
    }


}
