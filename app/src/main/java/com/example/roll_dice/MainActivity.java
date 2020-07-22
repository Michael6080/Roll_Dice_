package com.example.roll_dice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView imagedice;
    private Random rng = new Random();
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imagedice = findViewById(R.id.image_view_dice);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollDice();
            }
        });

    }

    private void rollDice() {
        int randomNumber = rng.nextInt(6) + 1;

        switch (randomNumber) {
            case 1:
                imagedice.setImageResource(R.drawable.dice1);
                break;
            case 2:
                imagedice.setImageResource(R.drawable.dice2);
                break;
            case 3:
                imagedice.setImageResource(R.drawable.dice3);
                break;
            case 4:
                imagedice.setImageResource(R.drawable.dice4);
                break;
            case 5:
                imagedice.setImageResource(R.drawable.dice5);
                break;
            case 6:
                imagedice.setImageResource(R.drawable.dice6);
                break;
        }

    }
}
