package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void spinTheBall(View view) {
        final ImageView myImageView;
        myImageView = findViewById(R.id.image_eightBall);
        final int[] ballArray = {R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5};
        Random myRandomNumberGenerator = new Random();
        int number = myRandomNumberGenerator.nextInt(5);
        myImageView.setImageResource(ballArray[number]);


    }
}
