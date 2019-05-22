package com.example.healthtracker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    public int clickCounter = 0;
    public Button button;
    public TextView text_counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
}
