package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

        String[] quotes = {
                "YOUR TIME IS NOW!",
                "DIFFICULT ROADS LEAD TO BEAUTIFUL DESTINATION",
                "Dream big and take action",
                "Believe in your self",
                "Success is a journey, not a destination."
        };

        int[] images = {
                R.drawable.img_1,
                R.drawable.img_2,
                R.drawable.img,
                R.drawable.img_3,
                R.drawable.img_4
        };

        int currentIndex = 0;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            ImageView imageView = findViewById(R.id.motivational_image);
            TextView textView = findViewById(R.id.motivational_text);
            Button changeButton = findViewById(R.id.change_button);

            changeButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Change image and text
                    currentIndex = (currentIndex + 1) % quotes.length;
                    textView.setText(quotes[currentIndex]);
                    imageView.setImageResource(images[currentIndex]);

                    // Show Toast
                    Toast.makeText(MainActivity.this, "Keep going!", Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
