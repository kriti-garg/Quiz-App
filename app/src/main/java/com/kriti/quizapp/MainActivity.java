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
    int score1=0,score2=0,score3=0,score4=0,score5=0;
    public void onCheckboxFirst(View view) {
        // boolean checked = ((CheckBox) view).isChecked();
        CheckBox ribo = (CheckBox) findViewById(R.id.ribo);
        CheckBox plastids = (CheckBox) findViewById(R.id.plastids);
        CheckBox diploid = (CheckBox) findViewById(R.id.diploid);
        CheckBox golgi = (CheckBox) findViewById(R.id.golgi);
        if (ribo.isChecked() && golgi.isChecked() && (!plastids.isChecked()) && (!diploid.isChecked())){
            score1  = 1;
        }
        else{
            score1 = 0;
        }
    }
    public void onCheckboxSecond(View view) {
      //  boolean checked = ((CheckBox) view).isChecked();
       // int f2=0;
        CheckBox tin = (CheckBox) findViewById(R.id.tin);
        CheckBox lead = (CheckBox) findViewById(R.id.lead);
        CheckBox copper = (CheckBox) findViewById(R.id.copper);
        CheckBox chromium = (CheckBox) findViewById(R.id.chromium);

         if (tin.isChecked() && lead.isChecked() && (!copper.isChecked()) && (!chromium.isChecked()))
            score2=1;
         else score2=0;
    }

    public void isRight(View view) {
        EditText isRight = (EditText) findViewById(R.id.myEdit_text);
        if (isRight.getText().toString().equals("Ethylene")) {
            score3=1;
        }
        else score3=0;
            String name = isRight.getText().toString();
            if (name == null) {
                Toast.makeText(this, "Plz fill all the answers", Toast.LENGTH_SHORT).show();
            }
    }

    public void onRadioButtonFirst(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        RadioButton dna = (RadioButton) findViewById(R.id.dna);
        if (dna.isChecked())
            score4=1;
        else score4=0;
    }

    public void onRadioButtonSecond(View view) {
        boolean checked2 = ((RadioButton) view).isChecked();
        RadioButton dioxide = (RadioButton) findViewById(R.id.dioxide);
        if (dioxide.isChecked())
            score5= 1;
        else score5=0;
    }
    public void gradingInfo(View view) {
        Toast.makeText(this, "Total Correct: " + (score1 + score2 + score3 + score4 + score5), Toast.LENGTH_SHORT).show();
    }
    private void displayMessage(int count) {
        TextView display = (TextView) findViewById(R.id.display);
        display.setText("Total score is: " + count * 5);
    }
    public void onSubmit(View view) {
        countR=score1+score2+score3+score4+score5;
        displayMessage(countR);
    }

}
