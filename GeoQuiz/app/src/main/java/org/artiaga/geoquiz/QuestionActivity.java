package org.artiaga.geoquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class QuestionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);
    }

    public void showMeTheTrue(View view) {

        Toast toastTrue = Toast.makeText(
                this,
                "Correcto",
                Toast.LENGTH_LONG
        );

        toastTrue.show();
    }

    public void showMeTheFalse(View view){
        Toast toastFalse = Toast.makeText(
                this,
                "Incorrecto",
                Toast.LENGTH_LONG
        );

        toastFalse.show();
    }
}
