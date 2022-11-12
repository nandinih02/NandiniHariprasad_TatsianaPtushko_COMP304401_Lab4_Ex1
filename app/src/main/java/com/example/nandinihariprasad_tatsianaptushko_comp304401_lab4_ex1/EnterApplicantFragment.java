package com.example.nandinihariprasad_tatsianaptushko_comp304401_lab4_ex1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
public class EnterApplicantFragment extends Fragment {

    private EditText ApplicantId, FirstName, LastName, TestCenter, ExaminerId;
    private Button btnSave;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_enter_applicant, container, false);
        ApplicantId = view.findViewById(R.id.applicantID);
        FirstName = view.findViewById(R.id.applFirstName);
        LastName = view.findViewById(R.id.applLastName);
        TestCenter= view.findViewById(R.id.testCenter);
        ExaminerId= view.findViewById(R.id.examinerID);
        btnSave = view.findViewById(R.id.btn_saveApplicant);
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int applicantId = Integer.parseInt(ApplicantId.getText().toString());
                String applFirstname = FirstName.getText().toString();
                String applLastname = LastName.getText().toString();
                String testcenter = TestCenter.getText().toString();
                int examinerId = Integer.parseInt(ExaminerId.getText().toString());

                Applicant applicant = new Applicant();
                applicant.setApplicantId(applicantId);
                applicant.setFirstname(applFirstname);
                applicant.setLastname(applLastname);
                applicant.setTestcenter(testcenter);
                applicant.setExaminerId(examinerId);

                ApplicantActivity.myAppDB.myDao().addApplicant(applicant);

                Toast.makeText(getActivity(), "Applicant is added!", Toast.LENGTH_SHORT).show();

                ApplicantId.setText("");
                FirstName.setText("");
                LastName.setText("");
                TestCenter.setText("");
                ExaminerId.setText("");

            }
        });
        return view;
    }
}