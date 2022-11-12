package com.example.nandinihariprasad_tatsianaptushko_comp304401_lab4_ex1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class TestDataFragment extends Fragment {

    private EditText TestID, ApplicantID, ExaminerID, TestResults, TestDate, TestRoute;
    private Button btnSaved;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_test_data, container, false);
        TestID = view.findViewById(R.id.applicantID);
        ApplicantID = view.findViewById(R.id.applFirstName);
        ExaminerID = view.findViewById(R.id.applLastName);
        TestResults= view.findViewById(R.id.testCenter);
        TestDate= view.findViewById(R.id.examinerID);
        TestRoute = view.findViewById(R.id.testRoute);
        btnSaved = view.findViewById(R.id.btn_SaveTestData);
        btnSaved.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int testId = Integer.parseInt(TestID.getText().toString());
                int applicantId = Integer.parseInt(ApplicantID.getText().toString());
                int examinerId = Integer.parseInt(ExaminerID.getText().toString());
                String testResults = TestResults.getText().toString();
                String testDate = TestDate.getText().toString();
                String testRoute = TestRoute.getText().toString();

                TestData testData = new TestData();
                testData.setTestID(testId);
                testData.setApplicantID(applicantId);
                testData.setExaminerID(examinerId);
                testData.setTestResults(testResults);
                testData.setTestDate(testDate);
                testData.setTestRoute(testRoute);

                TestActivity.myAppDB.myDao().addTestData(testData);

                Toast.makeText(getActivity(), "Test Data is added!", Toast.LENGTH_SHORT).show();

                TestID.setText("");
                ApplicantID.setText("");
                ExaminerID.setText("");
                TestResults.setText("");
                TestDate.setText("");
                TestRoute.setText("");

            }
        });
        return view;
    }
}