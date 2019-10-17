package com.example.dice_roller;

        import android.os.Bundle;
        import android.support.design.widget.FloatingActionButton;
        import android.support.design.widget.Snackbar;
        import android.support.v7.app.AppCompatActivity;
        import android.support.v7.widget.Toolbar;
        import android.view.View;
        import android.view.Menu;
        import android.view.MenuItem;
        import android.widget.EditText;
        import android.widget.TextView;

        import java.util.Random;

public class MainActivity extends AppCompatActivity {

    //Counter
    int Count = 0;
    int guessCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    public void on_button_click(View view){
        TextView resultDisplay = this.findViewById(R.id.result);
        EditText Num1 = this.findViewById(R.id.userNum);
        String text_check = Num1.getText().toString().trim();

        if(text_check.isEmpty() || text_check == null) {
            resultDisplay.setText("Please Enter a value");
            //Pause for users to input values
        }
        else {
            guessCount++;
            //Object of Number Gen
            TextView tv = this.findViewById(R.id.numView);
            TextView guessCounter = this.findViewById(R.id.guessNum);
            Random r = new Random();
            //(upperbound - lowerbound) + lowerbound
            int randNum = r.nextInt(7-1)+1;

            int Num2 = Integer.parseInt(Num1.getText().toString());

            if(Num2 == randNum){
                scoreBoard(view);
            }

            //Coneverting int into String
            String CompGen = String.valueOf(randNum);

            tv.setText("Computer's Number: \r " + CompGen);
            resultDisplay.setText("Your Number: \r" + Num2);
            guessCounter.setText("Guess Counter: \n" + guessCount );
        }


    }


    public void scoreBoard(View View){
        Count++;
        TextView scoreCard = this.findViewById(R.id.score);
        scoreCard.setText("Your Score: " + Count);

    }


}
