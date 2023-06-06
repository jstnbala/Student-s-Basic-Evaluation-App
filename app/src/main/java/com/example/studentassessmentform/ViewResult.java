package com.example.studentassessmentform;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class ViewResult extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_result);
        setTitle("View Result");

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        String StudName = getIntent().getExtras().getString("name");
        String ResponseQ1 = getIntent().getExtras().getString("response1");
        String ResponseQ2 = getIntent().getExtras().getString("response2");
        String ResponseQ3 = getIntent().getExtras().getString("response3");
        String ScoreQ1 = getIntent().getExtras().getString("scoreQues1");
        String ScoreQ2 = getIntent().getExtras().getString("scoreQues2");
        String ScoreQ3 = getIntent().getExtras().getString("scoreQues3");
        String Total = getIntent().getExtras().getString("totalscore");

        TextView outputStudentName = findViewById(R.id.outputStudentName);
        outputStudentName.setText(StudName);

        TextView outputResultQues1 = findViewById(R.id.outputResultQues1);
        outputResultQues1.setText(ResponseQ1);

        TextView outputScore1 = findViewById(R.id.outputScore1);
        outputScore1.setText("Q1 Score: " + ScoreQ1);

        TextView outputResultQues2 = findViewById(R.id.outputResultQues2);
        outputResultQues2.setText(ResponseQ2);

        TextView outputScore2 = findViewById(R.id.outputScore2);
        outputScore2.setText("Q2 Score: " + ScoreQ2);

        TextView outputResultQues3 = findViewById(R.id.outputResultQues3);
        outputResultQues3.setText(ResponseQ3);

        TextView outputScore3 = findViewById(R.id.outputScore3);
        outputScore3.setText("Q3 Score: " + ScoreQ3);

        TextView outputTotalScore = findViewById(R.id.outputTotalScore);
        outputTotalScore.setText("Your Total Score is: " + Total);

    }

    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
                return true;
        }
        return super.onOptionsItemSelected(item);

    }

}