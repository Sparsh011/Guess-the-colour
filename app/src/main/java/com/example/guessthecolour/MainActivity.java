package com.example.guessthecolour;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView welcomeToApp;
    private Button button;
    private MediaPlayer ourPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        welcomeToApp = (TextView) findViewById(R.id.welcomeToApp);
        button = (Button) findViewById(R.id.buttonPlay);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity2();
//                play();
            }
        });
        welcomeToApp.setText("         Hey there!\nClick 'Play!' to continue");
        welcomeToApp.setVisibility(View.INVISIBLE);
    }

    public void openActivity2(){
        Intent intent1 = new Intent(this, MainActivity2.class);
        startActivity(intent1);
    }
    public void play(){
        ourPlayer = MediaPlayer.create(this, R.raw.song);
        ourPlayer.start();
    }
}
















