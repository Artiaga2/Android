package org.artiaga.hello_world;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnSaludo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSaludo = (Button)findViewById(R.id.saludo);



        btnSaludo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(

                        MainActivity.this,
                        "eyyyyy",
                        Toast.LENGTH_LONG
                );

                toast.show();
            }
        });
    }

//    /**
//     * Show a fake message.
//     * @param view
//     */
//    public void showMeTheToast(View view){
//        Toast toast = Toast.makeText(
//                this,
//                "Ola que ase",
//                Toast.LENGTH_LONG
//        );
//
//        toast.show();
//    }
}
