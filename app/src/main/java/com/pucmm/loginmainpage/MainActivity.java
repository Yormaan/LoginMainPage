package com.pucmm.loginmainpage;

import android.os.Looper;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;


public class MainActivity extends AppCompatActivity {

    private TextView ecommerce_splash_text;
    private ImageView cart_splash_welcome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ecommerce_splash_text = findViewById(R.id.ecommerce_splash_id);
        cart_splash_welcome = findViewById(R.id.cart_splash_welcome);

        Animation up_splash_animation = AnimationUtils.loadAnimation(this, R.anim.move_up);
        Animation down_splash_animation = AnimationUtils.loadAnimation(this, R.anim.move_down);

        cart_splash_welcome.setAnimation(up_splash_animation);
        ecommerce_splash_text.setAnimation(down_splash_animation);

        final Handler handler = new Handler(Looper.getMainLooper());
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent afterSplayDelay = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(afterSplayDelay);
                finish();
            }
        }, 4000);


    }
}

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        getSupportActionBar().hide();
//
//        new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
//                startActivity(intent);
//                finish();
//            }
//        }, 3000);
//
//
//    }

