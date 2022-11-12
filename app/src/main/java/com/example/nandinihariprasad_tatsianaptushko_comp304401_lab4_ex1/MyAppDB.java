package com.example.nandinihariprasad_tatsianaptushko_comp304401_lab4_ex1;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Applicant.class}, version = 1)
    public abstract class MyAppDB extends RoomDatabase {
        public abstract MyDao myDao();
}
