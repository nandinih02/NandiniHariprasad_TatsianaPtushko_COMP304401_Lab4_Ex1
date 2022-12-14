package com.example.nandinihariprasad_tatsianaptushko_comp304401_lab4_ex1;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface MyDao {

    @Insert
    public void addApplicant(Applicant applicant);

    @Query("select * from applicant")
    public List<Applicant> getapplicants();
    @Insert
    public void addTestData(TestData testData);

    @Query("select * from applicant where applicantId =:id")
    public List<Applicant> getapplicant(int id);


}
