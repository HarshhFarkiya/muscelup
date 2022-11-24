package com.example.mucleup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    Button button1,button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




    }

    public void afterage18(View view) {
        Intent intent=new Intent(MainActivity.this,secondActivity2.class);
        startActivity(intent);
    }
    public void beforeage18(View view) {
        Intent intent=new Intent(MainActivity.this,secondActivity.class);
        startActivity(intent);
    }

    public void food(View view) {
        Intent intent=new Intent(MainActivity.this,foodActivity.class);
        startActivity(intent);
    }
}