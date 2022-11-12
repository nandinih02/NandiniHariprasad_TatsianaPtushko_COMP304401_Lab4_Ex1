package com.example.nandinihariprasad_tatsianaptushko_comp304401_lab4_ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Login();
        applicantView();
        enterTest();
        testView();
        updateInfo();
    }

    public void Login() {
        Button loginBtn = (Button) findViewById(R.id.LoginButton);
        loginBtn.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, LoginActivity.class);
            startActivity(intent);
        });
    }

    public void applicantView() {
        Button applicantBtn = (Button) findViewById(R.id.applicantButton);
        applicantBtn.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ApplicantActivity.class);
            startActivity(intent);
        });
    }

    public void enterTest() {
        Button testBtn = (Button) findViewById(R.id.testButton);
        testBtn.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this,TestActivity.class);
            startActivity(intent);
        });
    }

    public void testView() {
        Button viewTestBtn = (Button) findViewById(R.id.viewTestButton);
        viewTestBtn.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this,ViewTestInfoActivity.class);
            startActivity(intent);
        });
    }

    public void updateInfo() {
        Button updateBtn = (Button) findViewById(R.id.updateButton);
        updateBtn.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this,UpdateInfoActivity.class);
            startActivity(intent);
        });
    }

}