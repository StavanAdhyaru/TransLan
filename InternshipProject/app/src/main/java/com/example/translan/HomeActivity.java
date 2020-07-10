package com.example.translan;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.LinearLayout;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AlphaAnimation animation = new AlphaAnimation(0.0f , 1.0f ) ;
        LinearLayout layout = (LinearLayout) findViewById(R.id.home_container);
        animation.setFillAfter(true);
        animation.setDuration(2000);
        layout.startAnimation(animation);
        Button bConversation = (Button) findViewById(R.id.start_new_conversation);
        Button bTranslation = (Button) findViewById(R.id.start_new_translation);
        Button bAbout = (Button) findViewById(R.id.about);
        bTranslation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, TranslationActivity.class);
                startActivity(intent);
            }
        });
        bConversation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, ConversationActivity.class);
                startActivity(intent);
            }
        });
        bAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, AboutActivity.class);
                startActivity(intent);
            }
        });
    }
}