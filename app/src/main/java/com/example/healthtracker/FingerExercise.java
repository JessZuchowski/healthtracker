package com.example.healthtracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

public class FingerExercise extends AppCompatActivity {
    public int clickCounter = 0;
    public Button button;
    public TextView text_counter;

    CarouselView carouselView;
    public int[] carouselImageList = {
            R.drawable.begonia1,
            R.drawable.variegated2,
            R.drawable.magnolia3,
            R.drawable.moss4};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finger_exercise);

        carouselView = (CarouselView) findViewById(R.id.carouselView);
        carouselView.setPageCount(carouselImageList.length);

        carouselView.setImageListener(imageListener);

        text_counter = findViewById(R.id.text_counter);
        button = findViewById(R.id.button);

        text_counter.setText("0");

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickCounter = clickCounter + 1;
                text_counter.setText(String.valueOf(clickCounter));
            }
        });

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
}
