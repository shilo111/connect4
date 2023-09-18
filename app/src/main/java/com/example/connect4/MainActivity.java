package com.example.connect4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener((view) -> {

            ImageView imageView = (ImageView) findViewById(R.id.button43);
            imageView.setBackgroundResource(R.drawable.peace);

        });
    }
}