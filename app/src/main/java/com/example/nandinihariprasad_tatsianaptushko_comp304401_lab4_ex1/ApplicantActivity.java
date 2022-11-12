package com.example.nandinihariprasad_tatsianaptushko_comp304401_lab4_ex1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.room.Room;

import android.os.Bundle;
import android.view.View;

public class ApplicantActivity extends AppCompatActivity {

    public static FragmentManager fragmentManager;
    public static MyAppDB myAppDB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_applicant);

        fragmentManager = getSupportFragmentManager();

        myAppDB = Room.databaseBuilder(getApplicationContext(),MyAppDB.class, "applicantDB").allowMainThreadQueries().build();

        View status = findViewById(R.id.fragment_container);

        if (status != null) {
            if (savedInstanceState != null) {
                return;
            }

            fragmentManager.beginTransaction().add(R.id.fragment_container,new ApplicantFragment()).commit();
        }

    }
}