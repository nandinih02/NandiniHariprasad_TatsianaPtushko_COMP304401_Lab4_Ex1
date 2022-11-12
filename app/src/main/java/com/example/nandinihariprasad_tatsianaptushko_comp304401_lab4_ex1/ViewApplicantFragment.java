package com.example.nandinihariprasad_tatsianaptushko_comp304401_lab4_ex1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
  * create an instance of this fragment.
 */
public class ViewApplicantFragment extends Fragment {
    private TextView TxtInfo;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_view_applicant, container, false);
        TxtInfo = view.findViewById(R.id.applicantInfo);
        List<Applicant> applicants = ApplicantActivity.myAppDB.myDao().getapplicants();

        String info = "";

        for (Applicant appl:applicants) {

            int id = appl.getApplicantId();
            String firstname = appl.getFirstname();
            String lastname = appl.getLastname();
            String testcenter = appl.getTestcenter();
            int examid = appl.getExaminerId();


            info = info + "\n\n Id: " + id + "\n Name: " + firstname +" "+lastname+
                    "\n Test Center: " + testcenter +"\n Examiner Id: "+examid;
        }
        TxtInfo.setText(info);
        return view;
    }
}