package org.molina.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class QuizActivity extends AppCompatActivity {

    private Button trueButton;
    private Button falseButton;
    private Question question1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        question1 = new Question(getString(R.string.Question1), true);

        trueButton = (Button)findViewById(R.id.trueButton);

        trueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (question1.isAnswer()){
                    Toast toast = Toast.makeText(
                        QuizActivity.this,
                        getString(R.string.correct),
                        Toast.LENGTH_LONG
                    );
                    toast.show();
                } else {
                    Toast toast = Toast.makeText(
                            QuizActivity.this,
                            getString(R.string.incorrect),
                            Toast.LENGTH_LONG
                    );
                    toast.show();
                }
            }
        });

        falseButton = (Button)findViewById(R.id.falseButton);

        falseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!question1.isAnswer()){
                    Toast toast = Toast.makeText(
                            QuizActivity.this,
                            getString(R.string.correct),
                            Toast.LENGTH_LONG
                    );
                    toast.show();
                } else {
                    Toast toast = Toast.makeText(
                            QuizActivity.this,
                            getString(R.string.incorrect),
                            Toast.LENGTH_LONG
                    );
                    toast.show();
                }
            }
        });
    }
}
/*

        trueButton = (Button)findViewById(R.id.trueBtn);

        trueButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (question1.isAnswer()){
                    if (question1.isAnswer()){
                        Toast toast = Toast.makeText(
                                MainActivity.this,
                                "Correcto",
                                Toast.LENGTH_LONG
                        );

                        toast.show();
                    } else {
                        Toast toast = Toast.makeText(
                                MainActivity.this,
                                "Incorrecto",
                                Toast.LENGTH_LONG
                        );

                        toast.show();
                    }
                }
            }
        });
 */
