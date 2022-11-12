package com.example.nandinihariprasad_tatsianaptushko_comp304401_lab4_ex1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.room.Room;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class UpdateInfoActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnUpdate, btnDisplay;
    public static FragmentManager fragmentManager;
    public static MyAppDB myAppDB;
    private EditText InputId;
    private DisplayFragment displayFragment;
    private FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_info);

        myAppDB = Room.databaseBuilder(getApplicationContext(),MyAppDB.class, "applicantDB").allowMainThreadQueries().build();

        btnUpdate =findViewById(R.id.btnUpdate);
        btnUpdate.setOnClickListener(this);

        btnDisplay = findViewById(R.id.btnDisplay);
        btnDisplay.setOnClickListener(this);



        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        displayFragment = new DisplayFragment();
        InputId = findViewById(R.id.inputId);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
                case R.id.btnUpdate:
                    UpdateInfoActivity.fragmentManager.beginTransaction().replace(R.id.edit_fragment_container, new UpdateFragment()).addToBackStack(null).commit();
                    break;
                case R.id.btnDisplay:
                    UpdateInfoActivity.fragmentManager.beginTransaction().replace(R.id.edit_fragment_container, new DisplayFragment()).addToBackStack(null).commit();

                    Bundle b = new Bundle();
                    b.putString("inputId", InputId.getText().toString());
                    displayFragment.setArguments(b);
                    fragmentTransaction.add(R.id.edit_fragment_container, displayFragment).commit();

                    break;
            }
        }



}