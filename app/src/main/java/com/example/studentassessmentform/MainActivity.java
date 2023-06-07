package com.example.studentassessmentform;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    
    String result1a, result1b, result1c, result1d, result2a, result2b, result2c, result2d,
            result3a, result3b, result3c, result3d;
    int score1a, score1b, score1c, score1d, score2a, score2b, score2c, score2d,
            score3a, score3b, score3c, score3d;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("STUDENT'S EVALUATION OF FACULTY");

        Button submit = findViewById(R.id.btnSubmit);
        submit.setEnabled(true);

        RadioGroup rdgQuesAMotivation = findViewById(R.id.rdgQuesAMotivation);
        rdgQuesAMotivation.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checked) {
                counter++;

                // 1. Learning Motivation / Attitude

                switch (checked) {
                    case R.id.rdA1Motivation:
                        result1a = "A) 1. Never\n";
                        score1a = 1;
                        break;
                    case R.id.rdA2Motivation:
                        result1a = "A) 1. Rarely\n";
                        score1a = 2;
                        break;
                    case R.id.rdA3Motivation:
                        result1a = "A) 1. Sometimes\n";
                        score1a = 3;
                        break;
                    case R.id.rdA4Motivation:
                        result1a = "A) 1. Usually\n";
                        score1a = 4;
                        break;
                    case R.id.rdA5Motivation:
                        result1a = "A) 1. Always\n";
                        score1a = 5;
                        break;
                }
            }
        });

        RadioGroup rdgQuesBMotivation = findViewById(R.id.rdgQuesBMotivation);
        rdgQuesBMotivation.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checked) {
                counter++;

                switch (checked) {
                    case R.id.rdB1Motivation:
                        result1b = "B) 1. Never\n";
                        score1b = 1;
                        break;
                    case R.id.rdB2Motivation:
                        result1b = "B) 1. Rarely\n";
                        score1b = 2;
                        break;
                    case R.id.rdB3Motivation:
                        result1b = "B) 1. Sometimes\n";
                        score1b = 3;
                        break;
                    case R.id.rdB4Motivation:
                        result1b = "B) 1. Usually\n";
                        score1b = 4;
                        break;
                    case R.id.rdB5Motivation:
                        result1b = "B) 1. Always\n";
                        score1b = 5;
                        break;
                }
            }
        });

        RadioGroup rdgQuesCMotivation = findViewById(R.id.rdgQuesCMotivation);
        rdgQuesCMotivation.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checked) {
                counter++;

                switch (checked) {
                    case R.id.rdC1Motivation:
                        result1c = "C) 1. Never\n";
                        score1c = 1;
                        break;
                    case R.id.rdC2Motivation:
                        result1c = "C) 1. Rarely\n";
                        score1c = 2;
                        break;
                    case R.id.rdC3Motivation:
                        result1c = "C) 1. Sometimes\n";
                        score1c = 3;
                        break;
                    case R.id.rdC4Motivation:
                        result1c = "C) 1. Usually\n";
                        score1c = 4;
                        break;
                    case R.id.rdC5Motivation:
                        result1c = "C) 1. Always\n";
                        score1c = 5;
                        break;
                }
            }
        });

        RadioGroup rdgQuesDMotivation = findViewById(R.id.rdgQuesDMotivation);
        rdgQuesDMotivation.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checked) {
                counter++;

                switch (checked) {
                    case R.id.rdD1Motivation:
                        result1d = "D) 1. Never\n";
                        score1d = 1;
                        break;
                    case R.id.rdD2Motivation:
                        result1d = "D) 1. Rarely\n";
                        score1d = 2;
                        break;
                    case R.id.rdD3Motivation:
                        result1d = "D) 1. Sometimes\n";
                        score1d = 3;
                        break;
                    case R.id.rdD4Motivation:
                        result1d = "D) 1. Usually\n";
                        score1d = 4;
                        break;
                    case R.id.rdD5Motivation:
                        result1d = "D) 1. Always\n";
                        score1d = 5;
                        break;
                }
            }
        });

        // 2. Learning Characteristics

        RadioGroup rdgQuesACharac = findViewById(R.id.rdgQuesACharac);
        rdgQuesACharac.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checked) {
                counter++;

                switch (checked) {
                    case R.id.rdA1Charac:
                        result2a = "A) 2. Never\n";
                        score2a = 1;
                        break;
                    case R.id.rdA2Charac:
                        result2a = "A) 2. Rarely\n";
                        score2a = 2;
                        break;
                    case R.id.rdA3Charac:
                        result2a = "A) 2. Sometimes\n";
                        score2a = 3;
                        break;
                    case R.id.rdA4Charac:
                        result2a = "A) 2. Usually\n";
                        score2a = 4;
                        break;
                    case R.id.rdA5Charac:
                        result2a = "A) 2. Always\n";
                        score2a = 5;
                        break;
                }
            }
        });

        RadioGroup rdgQuesBCharac = findViewById(R.id.rdgQuesBCharac);
        rdgQuesBCharac.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checked) {
                counter++;

                switch (checked) {
                    case R.id.rdB1Charac:
                        result2b = "B) 2. Never\n";
                        score2b = 1;
                        break;
                    case R.id.rdB2Charac:
                        result2b = "B) 2. Rarely\n";
                        score2b = 2;
                        break;
                    case R.id.rdB3Charac:
                        result2b = "B) 2. Sometimes\n";
                        score2b = 3;
                        break;
                    case R.id.rdB4Charac:
                        result2b = "B) 2. Usually\n";
                        score2b = 4;
                        break;
                    case R.id.rdB5Charac:
                        result2b = "B) 2. Always\n";
                        score2b = 5;
                        break;
                }
            }
        });

        RadioGroup rdgQuesCCharac = findViewById(R.id.rdgQuesCCharac);
        rdgQuesCCharac.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checked) {
                counter++;

                switch (checked) {
                    case R.id.rdC1Charac:
                        result2c = "C) 2. Never\n";
                        score2c = 1;
                        break;
                    case R.id.rdC2Charac:
                        result2c = "C) 2. Rarely\n";
                        score2c = 2;
                        break;
                    case R.id.rdC3Charac:
                        result2c = "C) 2. Sometimes\n";
                        score2c = 3;
                        break;
                    case R.id.rdC4Charac:
                        result2c = "C) 2. Usually\n";
                        score2c = 4;
                        break;
                    case R.id.rdC5Charac:
                        result2c = "C) 2. Always\n";
                        score2c = 5;
                        break;
                }
            }
        });

        RadioGroup rdgQuesDCharac = findViewById(R.id.rdgQuesDCharac);
        rdgQuesDCharac.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checked) {
                counter++;

                switch (checked) {
                    case R.id.rdD1Charac:
                        result2d = "D) 2. Never\n";
                        score2d = 1;
                        break;
                    case R.id.rdD2Charac:
                        result2d = "D) 2. Rarely\n";
                        score2d = 2;
                        break;
                    case R.id.rdD3Charac:
                        result2d = "D) 2. Sometimes\n";
                        score2d = 3;
                        break;
                    case R.id.rdD4Charac:
                        result2d = "D) 2. Usually\n";
                        score2d = 4;
                        break;
                    case R.id.rdD5Charac:
                        result2d = "D) 2. Always\n";
                        score2d = 5;
                        break;

                }
            }
        });

        // 3. Behavioural Performance in Class

        RadioGroup rdgQuesAPerf = findViewById(R.id.rdgQuesAPerf);
        rdgQuesAPerf.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checked) {
                counter++;

                switch (checked) {
                    case R.id.rdA1Perf:
                        result3a = "A) 3. Never\n";
                        score3a = 1;
                        break;
                    case R.id.rdA2Perf:
                        result3a = "A) 3. Rarely\n";
                        score3a = 2;
                        break;
                    case R.id.rdA3Perf:
                        result3a = "A) 3. Sometimes\n";
                        score3a = 3;
                        break;
                    case R.id.rdA4perf:
                        result3a = "A) 3. Usually\n";
                        score3a = 4;
                        break;
                    case R.id.rdA5perf:
                        result3a = "A) 3. Always\n";
                        score3a = 5;
                        break;
                }
            }
        });

        RadioGroup rdgQuesBPerf = findViewById(R.id.rdgQuesBPerf);
        rdgQuesBPerf.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checked) {
                counter++;

                switch (checked) {
                    case R.id.rdB1Perf:
                        result3b = "B) 3. Never\n";
                        score3b = 1;
                        break;
                    case R.id.rdB2Perf:
                        result3b = "B) 3. Rarely\n";
                        score3b = 2;
                        break;
                    case R.id.rdB3Perf:
                        result3b = "B) 3. Sometimes\n";
                        score3b = 3;
                        break;
                    case R.id.rdB4Perf:
                        result3b = "B) 3. Usually\n";
                        score3b = 4;
                        break;
                    case R.id.rdB5Perf:
                        result3b = "B) 3. Always\n";
                        score3b = 5;
                        break;
                }
            }
        });

        RadioGroup rdgQuesCPerf = findViewById(R.id.rdgQuesCPerf);
        rdgQuesCPerf.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checked) {
                counter++;

                switch (checked) {
                    case R.id.rdC1Perf:
                        result3c = "C) 3. Never\n";
                        score3c = 1;
                        break;
                    case R.id.rdC2Perf:
                        result3c = "C) 3. Rarely\n";
                        score3c = 2;
                        break;
                    case R.id.rdC3Perf:
                        result3c = "C) 3. Sometimes\n";
                        score3c = 3;
                        break;
                    case R.id.rdC4Perf:
                        result3c = "C) 3. Usually\n";
                        score3c = 4;
                        break;
                    case R.id.rdC5Perf:
                        result3c = "C) 3. Always\n";
                        score3c = 5;
                        break;
                }
            }
        });

        RadioGroup rdgQuesDPerf = findViewById(R.id.rdgQuesDPerf);
        rdgQuesDPerf.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checked) {
                counter++;

                switch (checked) {
                    case R.id.rdD1Perf:
                        result3d = "D) 3. Never\n";
                        score3d = 1;
                        break;
                    case R.id.rdD2Perf:
                        result3d = "D) 3. Rarely\n";
                        score3d = 2;
                        break;
                    case R.id.rdD3Perf:
                        result3d = "D) 3. Sometimes\n";
                        score3d = 3;
                        break;
                    case R.id.rdD4Perf:
                        result3d = "D) 3. Usually\n";
                        score3d = 4;
                        break;
                    case R.id.rdD5Perf:
                        result3d = "D) 3. Always\n";
                        score3d = 5;
                        break;
                }
            }
        });
    }
        // Submit Button
    public void submit(View v){
        Button submit = findViewById(R.id.btnSubmit);
        submit.setEnabled(true);

        EditText edtStudentName = findViewById(R.id.edtStudentName);
        String name = edtStudentName.getText().toString();

        String response1 = "";
        String response2 = "";
        String response3 = "";
        int scoreQues1, scoreQues2, scoreQues3, TotalScore;

        if(name.equals("")) {
            Toast.makeText(MainActivity.this, "PLEASE ENTER STUDENT NAME!", Toast.LENGTH_SHORT).show();
        } else if
            (counter < 12) {
                Toast.makeText(MainActivity.this, "PLEASE FILL UP THE FORM!", Toast.LENGTH_SHORT).show();
            } else {
                response1 += result1a + result1b + result1c + result1d;
                response2 += result2a + result2b + result2c + result2d;
                response3 += result3a + result3b + result3c + result3d;

                scoreQues1 = score1a + score1b + score1c + score1d;
                scoreQues2 = score2a + score2b + score2c + score2d;
                scoreQues3 = score3a + score3b + score3c + score3d;
                TotalScore = scoreQues1 + scoreQues2 + scoreQues3;

                // Displays the Notification
                NotificationCompat.Builder builder = new NotificationCompat.Builder(this);
                builder.setContentTitle("Hello, " + name);
                builder.setContentText("Check Your Performance.");
                builder.setSmallIcon(R.drawable.ic_baseline_notifications_active_24);
                builder.setAutoCancel(true);

            /* When the user presses the submit button the notification will appear, then click
                it will proceed to the View Result Class */
                Intent i = new Intent(this, ViewResult.class);
                i.putExtra("name", name);
                i.putExtra("response1", response1);
                i.putExtra("response2", response2);
                i.putExtra("response3", response3);
                i.putExtra("scoreQues1", String.valueOf(scoreQues1));
                i.putExtra("scoreQues2", String.valueOf(scoreQues2));
                i.putExtra("scoreQues3", String.valueOf(scoreQues3));
                i.putExtra("totalscore", String.valueOf(TotalScore));

                // Open the Activity Using the Notification
                PendingIntent pi = PendingIntent.getActivity(this, 0, i, PendingIntent.FLAG_UPDATE_CURRENT);
                builder.setContentIntent(pi);

                // View Notification
                NotificationManager nm = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
                nm.notify(0, builder.build());

            }
        }

        }


