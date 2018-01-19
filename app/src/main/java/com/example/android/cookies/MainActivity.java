package com.example.android.cookies;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Called when the cookie should be eaten.
     */
    public void eatCookie(View View) {

        String yum;
        String isGone;
        yum = "I'm so full";
        isGone = "No more cookie";
        eat(yum, isGone);


    }

    private void eat(String eatTheCookie, String noMoreCookie){

        TextView eatCookie = findViewById(R.id.status_text_view);
        eatCookie.setText(eatTheCookie);
        ImageView cookieGone = findViewById(R.id.android_cookie_image_view);
        cookieGone.setImageResource(R.drawable.after_cookie);
        TextView cookieWasAte = findViewById(R.id.eat_cookie);
        cookieWasAte.setText(noMoreCookie);


    }

}