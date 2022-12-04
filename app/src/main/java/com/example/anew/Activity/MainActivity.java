package com.example.anew.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.anew.R;

public class MainActivity extends AppCompatActivity {

    EditText et_email;
    EditText et_password;
    TextView tv_needHelp;
    Button btn_signIn;
    String myemail = "ankitkumar5049@gmail.com";
    String mypass = "123456";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_email = findViewById(R.id.et_signup_email);
        et_password = findViewById(R.id.et_signup_password);
        tv_needHelp = findViewById(R.id.tv_need_help);
        btn_signIn = findViewById(R.id.btn_signup);

        String email = et_email.getText().toString();
        String password = et_password.getText().toString();


        btn_signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!email.equals(myemail) | password.equals(password)){
                    Intent myIntent = new Intent(MainActivity.this, SecondActivity.class);
                    myIntent.putExtra("key", 10); //Optional parameters
                    MainActivity.this.startActivity(myIntent);
                }
                else{
                    Toast.makeText(
                            getApplicationContext(),
                            "Wrong email or password!",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}