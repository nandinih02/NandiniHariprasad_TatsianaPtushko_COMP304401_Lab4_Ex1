package com.example.nandinihariprasad_tatsianaptushko_comp304401_lab4_ex1;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Applicant {
    @PrimaryKey
    private int applicantId;

    @ColumnInfo(name = "applicant_first_name")
    private String firstname;

    @ColumnInfo(name = "applicant_last_name")
    private String lastname;

    @ColumnInfo(name = "test_center")
    private String testcenter;

    @ColumnInfo(name = "examiner_Id")
    private int examinerId;

    public int getApplicantId() {
        return applicantId;
    }

    public void setApplicantId(int applicantId) {
        this.applicantId = applicantId;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getTestcenter() {
        return testcenter;
    }

    public void setTestcenter(String testcenter) {
        this.testcenter = testcenter;
    }

    public int getExaminerId() {
        return examinerId;
    }

    public void setExaminerId(int examinerId) {
        this.examinerId = examinerId;
    }
}
