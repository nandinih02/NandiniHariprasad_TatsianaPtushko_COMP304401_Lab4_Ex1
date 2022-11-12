package com.example.nandinihariprasad_tatsianaptushko_comp304401_lab4_ex1;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.viewmodel.CreationExtras;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
public class ApplicantFragment extends Fragment implements View.OnClickListener {

    private Button btnEnterApplicant, btnViewApplicant;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view =  inflater.inflate(R.layout.fragment_applicant, container, false);

        btnEnterApplicant = view.findViewById(R.id.btn_enterApplicant);
        btnEnterApplicant.setOnClickListener(this);

        btnViewApplicant = view.findViewById(R.id.btn_viewApplicant);
        btnViewApplicant.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_enterApplicant:
                ApplicantActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new EnterApplicantFragment()).addToBackStack(null).commit();
                break;
            case R.id.btn_viewApplicant:
                ApplicantActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new ViewApplicantFragment()).addToBackStack(null).commit();
                break;
        }
    }

}