package org.artiaga.geoquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class QuestionActivity extends AppCompatActivity {

    private Button btn_True;
    private Button btn_False;
    private TextView txt_question;
    private Question[] mQuestionBank;
    private int mCurrentIndex;
    private Button btn_Sig;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);

        btn_Sig = (Button) findViewById(R.id.siguiente_button);
        btn_True = (Button) findViewById(R.id.true_button);
        btn_False = (Button) findViewById(R.id.false_button);
        txt_question = (TextView)  findViewById(R.id.question_text);
        mQuestionBank = new Question[]{
          new Question(R.string.question_spain, true),
                new Question(R.string.question_france, true),
                new Question(R.string.question_ada, false),
                new Question(R.string.question_uk, false),
                new Question(R.string.question_tenis, false)
        };

        mCurrentIndex = 0;

        txt_question.setText(mQuestionBank[mCurrentIndex].getQuestionTextId());

        btn_Sig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btn_True.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mQuestionBank[mCurrentIndex].isAnswerTrue()) {
                    Toast.makeText(
                            QuestionActivity.this,
                            "Correcto :)",
                            Toast.LENGTH_SHORT
                    ).show();
                }else {
                    Toast.makeText(
                            QuestionActivity.this,
                            "Incorrecto :)",
                            Toast.LENGTH_SHORT
                    ).show();
                }
            }
        });

        btn_False.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    if (!mQuestionBank[mCurrentIndex].isAnswerTrue()){
                    Toast.makeText(
                            QuestionActivity.this,
                            "Incorrecto :)",
                            Toast.LENGTH_SHORT
                    ).show();
                }else {
                        Toast.makeText(
                                QuestionActivity.this,
                                "Incorrecto :)",
                                Toast.LENGTH_SHORT
                        ).show();
                    }
            }
        }));
    }
}
