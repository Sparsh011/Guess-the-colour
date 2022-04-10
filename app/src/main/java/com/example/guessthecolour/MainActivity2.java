package com.example.guessthecolour;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity2 extends AppCompatActivity {
    private Button backButton;
    private EditText userGuess;
    private Button submit;
    private TextView heading;
    private Button buttonRed, buttonBlue, buttonBrown, buttonWhite, buttonPink, buttonPurple, buttonGreen, buttonYellow, buttonBlack, buttonOrange;
    private String result;
    int number;
    private int progress = 0;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        backButton = (Button) findViewById(R.id.back_button);
        userGuess = (EditText) findViewById(R.id.userGuess);
        heading = (TextView) findViewById(R.id.heading);
        submit = (Button) findViewById(R.id.submit);
        buttonRed = (Button) findViewById(R.id.buttonRed);
        buttonBlue = (Button) findViewById(R.id.buttonBlue);
        buttonBrown = (Button) findViewById(R.id.buttonBrown);
        buttonWhite = (Button) findViewById(R.id.buttonWhite);
        buttonPink = (Button) findViewById(R.id.buttonPink);
        buttonPurple = (Button) findViewById(R.id.buttonPurple);
        buttonGreen = (Button) findViewById(R.id.buttonGreen);
        buttonYellow = (Button) findViewById(R.id.buttonYellow);
        buttonBlack = (Button) findViewById(R.id.buttonBlack);
        buttonOrange = (Button) findViewById(R.id.buttonOrange);
//        NextColour = (Button) findViewById(R.id.NextColour);
        progressBar = (ProgressBar) findViewById(R.id.progressBar2);

        userGuess.setText("");
        heading.setText("Guess the colour shown below");


        Random a = new Random();
        number = a.nextInt(10);
//                This generates a random number between 0 to 10
        if (number == 0) {

            buttonBlack.setVisibility(View.VISIBLE);
            buttonWhite.setVisibility(View.INVISIBLE);
            buttonPink.setVisibility(View.INVISIBLE);
            buttonPurple.setVisibility(View.INVISIBLE);
            buttonBrown.setVisibility(View.INVISIBLE);
            buttonGreen.setVisibility(View.INVISIBLE);
            buttonOrange.setVisibility(View.INVISIBLE);
            buttonBlue.setVisibility(View.INVISIBLE);
            buttonYellow.setVisibility(View.INVISIBLE);
            buttonRed.setVisibility(View.INVISIBLE);

        }

        if (number == 1) {

            buttonWhite.setVisibility(View.VISIBLE);
            buttonBlack.setVisibility(View.INVISIBLE);
            buttonPink.setVisibility(View.INVISIBLE);
            buttonPurple.setVisibility(View.INVISIBLE);
            buttonBrown.setVisibility(View.INVISIBLE);
            buttonGreen.setVisibility(View.INVISIBLE);
            buttonOrange.setVisibility(View.INVISIBLE);
            buttonBlue.setVisibility(View.INVISIBLE);
            buttonYellow.setVisibility(View.INVISIBLE);
            buttonRed.setVisibility(View.INVISIBLE);

        }

        if (number == 2) {

            buttonPink.setVisibility(View.VISIBLE);
            buttonBlack.setVisibility(View.INVISIBLE);
            buttonPurple.setVisibility(View.INVISIBLE);
            buttonBrown.setVisibility(View.INVISIBLE);
            buttonGreen.setVisibility(View.INVISIBLE);
            buttonOrange.setVisibility(View.INVISIBLE);
            buttonWhite.setVisibility(View.INVISIBLE);
            buttonBlue.setVisibility(View.INVISIBLE);
            buttonYellow.setVisibility(View.INVISIBLE);
            buttonRed.setVisibility(View.INVISIBLE);

        }

        if (number == 3) {

            buttonPurple.setVisibility(View.VISIBLE);
            buttonBlack.setVisibility(View.INVISIBLE);
            buttonPink.setVisibility(View.INVISIBLE);
            buttonBrown.setVisibility(View.INVISIBLE);
            buttonGreen.setVisibility(View.INVISIBLE);
            buttonWhite.setVisibility(View.INVISIBLE);
            buttonOrange.setVisibility(View.INVISIBLE);
            buttonBlue.setVisibility(View.INVISIBLE);
            buttonYellow.setVisibility(View.INVISIBLE);
            buttonRed.setVisibility(View.INVISIBLE);

        }

        if (number == 4) {

            buttonBrown.setVisibility(View.VISIBLE);
            buttonBlack.setVisibility(View.INVISIBLE);
            buttonPink.setVisibility(View.INVISIBLE);
            buttonPurple.setVisibility(View.INVISIBLE);
            buttonWhite.setVisibility(View.INVISIBLE);
            buttonGreen.setVisibility(View.INVISIBLE);
            buttonOrange.setVisibility(View.INVISIBLE);
            buttonBlue.setVisibility(View.INVISIBLE);
            buttonYellow.setVisibility(View.INVISIBLE);
            buttonRed.setVisibility(View.INVISIBLE);

        }

        if (number == 5) {

            buttonGreen.setVisibility(View.VISIBLE);
            buttonBlack.setVisibility(View.INVISIBLE);
            buttonPink.setVisibility(View.INVISIBLE);
            buttonPurple.setVisibility(View.INVISIBLE);
            buttonWhite.setVisibility(View.INVISIBLE);
            buttonBrown.setVisibility(View.INVISIBLE);
            buttonOrange.setVisibility(View.INVISIBLE);
            buttonBlue.setVisibility(View.INVISIBLE);
            buttonYellow.setVisibility(View.INVISIBLE);
            buttonRed.setVisibility(View.INVISIBLE);

        }

        if (number == 6) {

            buttonOrange.setVisibility(View.VISIBLE);
            buttonBlack.setVisibility(View.INVISIBLE);
            buttonPink.setVisibility(View.INVISIBLE);
            buttonPurple.setVisibility(View.INVISIBLE);
            buttonBrown.setVisibility(View.INVISIBLE);
            buttonWhite.setVisibility(View.INVISIBLE);
            buttonGreen.setVisibility(View.INVISIBLE);
            buttonBlue.setVisibility(View.INVISIBLE);
            buttonYellow.setVisibility(View.INVISIBLE);
            buttonRed.setVisibility(View.INVISIBLE);

        }

        if (number == 7) {

            buttonBlue.setVisibility(View.VISIBLE);
            buttonBlack.setVisibility(View.INVISIBLE);
            buttonPink.setVisibility(View.INVISIBLE);
            buttonPurple.setVisibility(View.INVISIBLE);
            buttonBrown.setVisibility(View.INVISIBLE);
            buttonGreen.setVisibility(View.INVISIBLE);
            buttonOrange.setVisibility(View.INVISIBLE);
            buttonYellow.setVisibility(View.INVISIBLE);
            buttonRed.setVisibility(View.INVISIBLE);
            buttonWhite.setVisibility(View.INVISIBLE);

        }

        if (number == 8) {

            buttonYellow.setVisibility(View.VISIBLE);
            buttonBlack.setVisibility(View.INVISIBLE);
            buttonPink.setVisibility(View.INVISIBLE);
            buttonPurple.setVisibility(View.INVISIBLE);
            buttonBrown.setVisibility(View.INVISIBLE);
            buttonGreen.setVisibility(View.INVISIBLE);
            buttonOrange.setVisibility(View.INVISIBLE);
            buttonBlue.setVisibility(View.INVISIBLE);
            buttonWhite.setVisibility(View.INVISIBLE);
            buttonRed.setVisibility(View.INVISIBLE);
        }
        if (number == 9) {

            buttonRed.setVisibility(View.VISIBLE);
            buttonBlack.setVisibility(View.INVISIBLE);
            buttonPink.setVisibility(View.INVISIBLE);
            buttonPurple.setVisibility(View.INVISIBLE);
            buttonWhite.setVisibility(View.INVISIBLE);
            buttonBrown.setVisibility(View.INVISIBLE);
            buttonGreen.setVisibility(View.INVISIBLE);
            buttonOrange.setVisibility(View.INVISIBLE);
            buttonBlue.setVisibility(View.INVISIBLE);
            buttonYellow.setVisibility(View.INVISIBLE);
        }

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result = userGuess.getText().toString().toLowerCase();
                if (progress <= 90){
                    progress+=10;
                    updateProgressBar();
                }
                if (progress == 100){
                    progress = 0;
                    updateProgressBar();
                }
                if (number == 0) {
                    String black = "black";
                    int a = result.compareTo(black);
                    if (a == 0)
                        Toast.makeText(MainActivity2.this, "Correct!", Toast.LENGTH_SHORT).show();
                    else
                        Toast.makeText(MainActivity2.this, "Incorrect guess!", Toast.LENGTH_SHORT).show();
                }
                if (number == 1) {
                    String white = "white";
                    int a = result.compareTo(white);
                    if (a == 0)
                        Toast.makeText(MainActivity2.this, "Correct!", Toast.LENGTH_SHORT).show();
                    else
                        Toast.makeText(MainActivity2.this, "Incorrect guess!", Toast.LENGTH_SHORT).show();
                }
                if (number == 2) {
                    String pink = "pink";
                    int a = result.compareTo(pink);
                    if (a == 0)
                        Toast.makeText(MainActivity2.this, "Correct!", Toast.LENGTH_SHORT).show();
                    else
                        Toast.makeText(MainActivity2.this, "Incorrect guess!", Toast.LENGTH_SHORT).show();
                }
                if (number == 3) {
                    String purple = "purple";
                    int a = result.compareTo(purple);
                    if (a == 0)
                        Toast.makeText(MainActivity2.this, "Correct!", Toast.LENGTH_SHORT).show();
                    else
                        Toast.makeText(MainActivity2.this, "Incorrect guess!", Toast.LENGTH_SHORT).show();
                }
                if (number == 4) {
                    String brown = "brown";
                    int a = result.compareTo(brown);
                    if (a == 0)
                        Toast.makeText(MainActivity2.this, "Correct!", Toast.LENGTH_SHORT).show();
                    else
                        Toast.makeText(MainActivity2.this, "Incorrect guess!", Toast.LENGTH_SHORT).show();
                }
                if (number == 5) {
                    String green = "green";
                    int a = result.compareTo(green);
                    if (a == 0)
                        Toast.makeText(MainActivity2.this, "Correct!", Toast.LENGTH_SHORT).show();
                    else
                        Toast.makeText(MainActivity2.this, "Incorrect guess!", Toast.LENGTH_SHORT).show();
                }
                if (number == 6) {
                    String orange = "orange";
                    int a = result.compareTo(orange);
                    if (a == 0)
                        Toast.makeText(MainActivity2.this, "Correct!", Toast.LENGTH_SHORT).show();
                    else
                        Toast.makeText(MainActivity2.this, "Incorrect guess!", Toast.LENGTH_SHORT).show();
                }
                if (number == 7) {
                    String blue = "blue";
                    int a = result.compareTo(blue);
                    if (a == 0)
                        Toast.makeText(MainActivity2.this, "Correct!", Toast.LENGTH_SHORT).show();
                    else
                        Toast.makeText(MainActivity2.this, "Incorrect guess!", Toast.LENGTH_SHORT).show();
                }
                if (number == 8) {
                    String yellow = "yellow";
                    int a = result.compareTo(yellow);
                    if (a == 0)
                        Toast.makeText(MainActivity2.this, "Correct!", Toast.LENGTH_SHORT).show();
                    else
                        Toast.makeText(MainActivity2.this, "Incorrect guess!", Toast.LENGTH_SHORT).show();
                }
                if (number == 9) {
                    String red = "red";
                    int a = result.compareTo(red);
                    if (a == 0)
                        Toast.makeText(MainActivity2.this, "Correct!", Toast.LENGTH_SHORT).show();
                    else
                        Toast.makeText(MainActivity2.this, "Incorrect guess!", Toast.LENGTH_SHORT).show();
                }
                userGuess.setText("");

                Random a = new Random();
                number = a.nextInt(10);
//                This generates a random number between 0 to 10
                if (number == 0) {

                    buttonBlack.setVisibility(View.VISIBLE);
                    buttonWhite.setVisibility(View.INVISIBLE);
                    buttonPink.setVisibility(View.INVISIBLE);
                    buttonPurple.setVisibility(View.INVISIBLE);
                    buttonBrown.setVisibility(View.INVISIBLE);
                    buttonGreen.setVisibility(View.INVISIBLE);
                    buttonOrange.setVisibility(View.INVISIBLE);
                    buttonBlue.setVisibility(View.INVISIBLE);
                    buttonYellow.setVisibility(View.INVISIBLE);
                    buttonRed.setVisibility(View.INVISIBLE);

                }

                if (number == 1) {

                    buttonWhite.setVisibility(View.VISIBLE);
                    buttonBlack.setVisibility(View.INVISIBLE);
                    buttonPink.setVisibility(View.INVISIBLE);
                    buttonPurple.setVisibility(View.INVISIBLE);
                    buttonBrown.setVisibility(View.INVISIBLE);
                    buttonGreen.setVisibility(View.INVISIBLE);
                    buttonOrange.setVisibility(View.INVISIBLE);
                    buttonBlue.setVisibility(View.INVISIBLE);
                    buttonYellow.setVisibility(View.INVISIBLE);
                    buttonRed.setVisibility(View.INVISIBLE);

                }

                if (number == 2) {

                    buttonPink.setVisibility(View.VISIBLE);
                    buttonBlack.setVisibility(View.INVISIBLE);
                    buttonPurple.setVisibility(View.INVISIBLE);
                    buttonBrown.setVisibility(View.INVISIBLE);
                    buttonGreen.setVisibility(View.INVISIBLE);
                    buttonOrange.setVisibility(View.INVISIBLE);
                    buttonWhite.setVisibility(View.INVISIBLE);
                    buttonBlue.setVisibility(View.INVISIBLE);
                    buttonYellow.setVisibility(View.INVISIBLE);
                    buttonRed.setVisibility(View.INVISIBLE);

                }

                if (number == 3) {

                    buttonPurple.setVisibility(View.VISIBLE);
                    buttonBlack.setVisibility(View.INVISIBLE);
                    buttonPink.setVisibility(View.INVISIBLE);
                    buttonBrown.setVisibility(View.INVISIBLE);
                    buttonGreen.setVisibility(View.INVISIBLE);
                    buttonWhite.setVisibility(View.INVISIBLE);
                    buttonOrange.setVisibility(View.INVISIBLE);
                    buttonBlue.setVisibility(View.INVISIBLE);
                    buttonYellow.setVisibility(View.INVISIBLE);
                    buttonRed.setVisibility(View.INVISIBLE);

                }

                if (number == 4) {

                    buttonBrown.setVisibility(View.VISIBLE);
                    buttonBlack.setVisibility(View.INVISIBLE);
                    buttonPink.setVisibility(View.INVISIBLE);
                    buttonPurple.setVisibility(View.INVISIBLE);
                    buttonWhite.setVisibility(View.INVISIBLE);
                    buttonGreen.setVisibility(View.INVISIBLE);
                    buttonOrange.setVisibility(View.INVISIBLE);
                    buttonBlue.setVisibility(View.INVISIBLE);
                    buttonYellow.setVisibility(View.INVISIBLE);
                    buttonRed.setVisibility(View.INVISIBLE);

                }

                if (number == 5) {

                    buttonGreen.setVisibility(View.VISIBLE);
                    buttonBlack.setVisibility(View.INVISIBLE);
                    buttonPink.setVisibility(View.INVISIBLE);
                    buttonPurple.setVisibility(View.INVISIBLE);
                    buttonWhite.setVisibility(View.INVISIBLE);
                    buttonBrown.setVisibility(View.INVISIBLE);
                    buttonOrange.setVisibility(View.INVISIBLE);
                    buttonBlue.setVisibility(View.INVISIBLE);
                    buttonYellow.setVisibility(View.INVISIBLE);
                    buttonRed.setVisibility(View.INVISIBLE);

                }

                if (number == 6) {

                    buttonOrange.setVisibility(View.VISIBLE);
                    buttonBlack.setVisibility(View.INVISIBLE);
                    buttonPink.setVisibility(View.INVISIBLE);
                    buttonPurple.setVisibility(View.INVISIBLE);
                    buttonBrown.setVisibility(View.INVISIBLE);
                    buttonWhite.setVisibility(View.INVISIBLE);
                    buttonGreen.setVisibility(View.INVISIBLE);
                    buttonBlue.setVisibility(View.INVISIBLE);
                    buttonYellow.setVisibility(View.INVISIBLE);
                    buttonRed.setVisibility(View.INVISIBLE);

                }

                if (number == 7) {

                    buttonBlue.setVisibility(View.VISIBLE);
                    buttonBlack.setVisibility(View.INVISIBLE);
                    buttonPink.setVisibility(View.INVISIBLE);
                    buttonPurple.setVisibility(View.INVISIBLE);
                    buttonBrown.setVisibility(View.INVISIBLE);
                    buttonGreen.setVisibility(View.INVISIBLE);
                    buttonOrange.setVisibility(View.INVISIBLE);
                    buttonYellow.setVisibility(View.INVISIBLE);
                    buttonRed.setVisibility(View.INVISIBLE);
                    buttonWhite.setVisibility(View.INVISIBLE);

                }

                if (number == 8) {

                    buttonYellow.setVisibility(View.VISIBLE);
                    buttonBlack.setVisibility(View.INVISIBLE);
                    buttonPink.setVisibility(View.INVISIBLE);
                    buttonPurple.setVisibility(View.INVISIBLE);
                    buttonBrown.setVisibility(View.INVISIBLE);
                    buttonGreen.setVisibility(View.INVISIBLE);
                    buttonOrange.setVisibility(View.INVISIBLE);
                    buttonBlue.setVisibility(View.INVISIBLE);
                    buttonWhite.setVisibility(View.INVISIBLE);
                    buttonRed.setVisibility(View.INVISIBLE);
                }
                if (number == 9) {

                    buttonRed.setVisibility(View.VISIBLE);
                    buttonBlack.setVisibility(View.INVISIBLE);
                    buttonPink.setVisibility(View.INVISIBLE);
                    buttonPurple.setVisibility(View.INVISIBLE);
                    buttonWhite.setVisibility(View.INVISIBLE);
                    buttonBrown.setVisibility(View.INVISIBLE);
                    buttonGreen.setVisibility(View.INVISIBLE);
                    buttonOrange.setVisibility(View.INVISIBLE);
                    buttonBlue.setVisibility(View.INVISIBLE);
                    buttonYellow.setVisibility(View.INVISIBLE);
                }
            }
        });

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity1();
            }
        });
    }

    public void openActivity1() {
        Intent intent2 = new Intent(this, MainActivity.class);
        startActivity(intent2);
    }
    public void updateProgressBar(){
        progressBar.setProgress(progress);
    }

}








