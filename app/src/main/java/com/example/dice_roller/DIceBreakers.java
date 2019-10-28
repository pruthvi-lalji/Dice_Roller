package com.example.dice_roller;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class DIceBreakers extends AppCompatActivity {

    TextView questionDisplay;
    ArrayList<String> questionList = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dice_breakers);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


        questionDisplay = (TextView) findViewById(R.id.questionDisplay);
        questionList.add("If You Could Go Anywhere In The World, Where Would You Go?");
        questionList.add("If You Were Stranded On A Desert Island, What Three Things Would You Want To Take With You?");
        questionList.add("If You Could Eat Only One Food For The Rest Of Your Life, What Would That Be?");
        questionList.add("If You Won A Million Dollars, What Is The First Thing You Would Buy?");
        questionList.add("If You Could Spend The Day With One Fictional Character, Who Would It Be?");
        questionList.add("If You Found A Magic Lantern And A Genie Gave You Three Wishes, What Would You Wish?");
        roll_the_dice();
    }


    public void roll_the_dice(){
        Random r = new Random();
        int randNum = r.nextInt(6);


/*        Collections.shuffle(questionList);
        questionDisplay.setText(questionList.get(0) + "");*/

        questionDisplay.setText(randNum + "");
    }

}
