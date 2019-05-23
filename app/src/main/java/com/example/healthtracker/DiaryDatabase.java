package com.example.healthtracker;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Diary.class}, version = 0)
public abstract class DiaryDatabase extends RoomDatabase {
    public abstract DiaryDao diaryDao();
}
