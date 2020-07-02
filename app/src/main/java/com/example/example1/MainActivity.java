package com.example.example1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick(View view)
    {
        switch (view.getId())
        {
            case R.id.imageButton:
                ImageButton imgbutt = findViewById(R.id.imageButton);
                final Animation animation = AnimationUtils.loadAnimation(this, R.anim.bounce);
                imgbutt.startAnimation(animation);
                break;

            case R.id.imageButton2:
                ImageButton imgbutt2 = findViewById(R.id.imageButton2);
                final Animation animation2 = AnimationUtils.loadAnimation(this, R.anim.bounce);
                imgbutt2.startAnimation(animation2);
                break;

            case R.id.imageButton3:
                ImageButton imgbutt3 = findViewById(R.id.imageButton3);
                final Animation animation3 = AnimationUtils.loadAnimation(this, R.anim.bounce);
                imgbutt3.startAnimation(animation3);
                break;

            case R.id.imageButton4:
                ImageButton imgbutt4 = findViewById(R.id.imageButton4);
                final Animation animation4 = AnimationUtils.loadAnimation(this, R.anim.bounce);
                imgbutt4.startAnimation(animation4);
                break;

            case R.id.imageButton5:
                ImageButton imgbutt5 = findViewById(R.id.imageButton5);
                final Animation animation5 = AnimationUtils.loadAnimation(this, R.anim.bounce);
                imgbutt5.startAnimation(animation5);
                break;


        }

    }

}