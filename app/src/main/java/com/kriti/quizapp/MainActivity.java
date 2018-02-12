package com.kriti.quizapp;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int countR = 0;
    int score1 = 0;
    public void onCheckboxFirst(View view){
        CheckBox ribo = findViewById(R.id.ribo);
        CheckBox plastids = findViewById(R.id.plastids);
        CheckBox diploid = findViewById(R.id.diploid);
        CheckBox golgi = findViewById(R.id.golgi);
        if (ribo.isChecked() && golgi.isChecked() && (!plastids.isChecked()) && (!diploid.isChecked())){
            score1  = 1;
        }
        else{
            score1 = 0;
        }
    }

    int score2 = 0;
    public void onCheckboxSecond(View view) {
        CheckBox tin = findViewById(R.id.tin);
        CheckBox lead = findViewById(R.id.lead);
        CheckBox copper = findViewById(R.id.copper);
        CheckBox chromium = findViewById(R.id.chromium);
        if (tin.isChecked() && lead.isChecked() && (!copper.isChecked()) && (!chromium.isChecked())){
            score2  = 1;
        }
        else{
            score2 = 0;
        }
    }

    int score3 = 0;
    public void isRight(View view) {
        EditText isRight = findViewById(R.id.myEdit_text);
        String str = isRight.getText().toString();
        if (str.equals("Ethylene"))
            score3 = 1;
        else
            score3 = 0;
    }

    int score4 = 0;
    public void onRadioButtonFirst(View view) {
        RadioButton dna = findViewById(R.id.dna);
        if (dna.isChecked())
            score4 = 1;
        else
            score4 = 0;
    }

    int score5 = 0;
    public void onRadioButtonSecond(View view) {
        RadioButton dioxide = findViewById(R.id.dioxide);
        if (dioxide.isChecked())
            score5 = 1;
        else
            score5 = 0;
    }

    public void gradingInfo(View view) {
        countR= score1 + score2 + score3 + score4 + score5;
        Toast.makeText(this, "Total Correct: " + countR , Toast.LENGTH_SHORT).show();
    }

    private void displayMessage(int count) {
        TextView display = findViewById(R.id.display);
        display.setText(getString(R.string.scoredisplay, count * 5));
    }


    public void onSubmit(View view) {
        countR= score1 + score2 + score3 + score4 + score5;
        displayMessage(countR);
    }
}
