package com.example.nandinihariprasad_tatsianaptushko_comp304401_lab4_ex1;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class TestData {
    @PrimaryKey
    private int testID;
    @ColumnInfo(name = "applicant_id")
    private int applicantID;
    @ColumnInfo(name = "examiner_id")
    private int examinerID;
    @ColumnInfo(name = "test_results")
    private String testResults;
    @ColumnInfo(name = "test_date")
    private String testDate;
    @ColumnInfo(name = "test_route")
    private String testRoute;

    public int getTestID() {
        return testID;
    }

    public void setTestID(int testID) {
        this.testID = testID;
    }

    public int getApplicantID() {
        return applicantID;
    }

    public void setApplicantID(int applicantID) {
        this.applicantID = applicantID;
    }

    public int getExaminerID() {
        return examinerID;
    }

    public void setExaminerID(int examinerID) {
        this.examinerID = examinerID;
    }

    public String getTestResults() {
        return testResults;
    }

    public void setTestResults(String testResults) {
        this.testResults = testResults;
    }

    public String getTestDate() {
        return testDate;
    }

    public void setTestDate(String testDate) {
        this.testDate = testDate;
    }

    public String getTestRoute() {
        return testRoute;
    }

    public void setTestRoute(String testRoute) {
        this.testRoute = testRoute;
    }
}
