package com.example.healthtracker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

import java.util.ArrayList;

public class DiaryActivity extends AppCompatActivity {

    CarouselView carouselView;
    public int[] carouselImageList = {
            R.drawable.begonia1,
            R.drawable.variegated2,
            R.drawable.magnolia3,
            R.drawable.moss4};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diary);

        carouselView = (CarouselView) findViewById(R.id.carouselView);
        carouselView.setPageCount(carouselImageList.length);

        carouselView.setImageListener(imageListener);

        DiaryDatabase db = Room.databaseBuilder(getApplicationContext(), DiaryDatabase.class, "diary-db")
                .allowMainThreadQueries()
                .fallbackToDestructiveMigration()
                .build();

//        Diary diary = new Diary("Dexterity", 10, "hand stretches", "1106");
//        db.diaryDao().add(diary);
//
//        Diary found = db.diaryDao().findByName("Dexterity");
        //refactor with RecyclerView
        ArrayList<Diary> diaries = new ArrayList<>();
        diaries.add(new Diary("Dexterity", 10, "stretches", "1115"));

        recyclerView = findViewById(R.id.recycler_main);
    }

    ImageListener imageListener = new ImageListener() {
        @Override
        public void setImageForPosition(int position, ImageView imageView) {
            imageView.setImageResource(carouselImageList[position]);
        }
    };

    public void onHomeButtonClick(View button) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void loadEntries() {

    }

    public void showEntries() {

    }

    public void onSubmitClick(View button) {
        TextView title = findViewById(R.id.diary_title);
        String results = title.getText().toString();

        Diary diary = new Diary(results, 3, "desc", "1420");

    }
}
