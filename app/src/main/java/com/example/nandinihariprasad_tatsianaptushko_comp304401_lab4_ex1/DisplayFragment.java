package com.example.nandinihariprasad_tatsianaptushko_comp304401_lab4_ex1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.

 * create an instance of this fragment.
 */
public class DisplayFragment extends Fragment {

    private TextView TxtDisplay;
    private EditText InputId;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
         View view = inflater.inflate(R.layout.fragment_display, container, false);
        TxtDisplay = view.findViewById(R.id.txt_display);


        List<Applicant> applicants = UpdateInfoActivity.myAppDB.myDao().getapplicant(2);

        String info = "";

        for (Applicant appl:applicants) {

            int id = appl.getApplicantId();
            String firstname = appl.getFirstname();
            String lastname = appl.getLastname();
            String testcenter = appl.getTestcenter();
            int examid = appl.getExaminerId();


            info = info + "\n\n Id: " + id + "\n Name: " + firstname + " " + lastname +
                    "\n Test Center: " + testcenter + "\n Examiner Id: " + examid;
        }
        TxtDisplay.setText(info);
        return view;
    }
}