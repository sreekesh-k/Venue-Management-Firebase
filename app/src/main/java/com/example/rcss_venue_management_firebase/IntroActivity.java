package com.example.rcss_venue_management_firebase;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;


public class IntroActivity extends AppCompatActivity {
    private ImageView hero;
    private LinearLayout heading;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        Animation topAnim = AnimationUtils.loadAnimation(this, R.anim.top_anim);

        hero = findViewById(R.id.imageView);
        heading = findViewById(R.id.heading);

        hero.setAnimation(topAnim);
        heading.setAnimation(topAnim);

        new Handler().postDelayed(() -> {
            Intent intent = new Intent(IntroActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        }, 4000);

    }
}