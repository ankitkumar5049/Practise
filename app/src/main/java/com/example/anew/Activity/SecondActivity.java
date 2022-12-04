package com.example.anew.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.anew.R;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

    }

    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(),"Cannot go back", Toast.LENGTH_SHORT).show();
    }
}