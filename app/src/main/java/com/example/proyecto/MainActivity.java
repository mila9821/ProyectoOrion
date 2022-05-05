package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private  static final long SPLASH_SCREEN_DELAY = 5000;

    Animation topAnim, bottomAnim;
    ImageView image, texto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Animacion
        topAnim = AnimationUtils.loadAnimation(this, R.anim.anima_logo);
        bottomAnim = AnimationUtils.loadAnimation(this,R.anim.anima_texto);

        //Logica y disenio
        image = findViewById(R.id.idlogo);
        texto = findViewById(R.id.idtexto);

        image.setAnimation(topAnim);
        texto.setAnimation(bottomAnim);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, Login.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_SCREEN_DELAY);



    }
}
