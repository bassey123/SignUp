package com.example.signup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn;
    EditText edt1;
    EditText edt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btnLogin);
        edt1 = findViewById(R.id.user);
        edt2 = findViewById(R.id.pswd);

//        String s1 = edt1.getText().toString().trim();
//        String s2 = edt2.getText().toString().trim();

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (checkValidation()) {
                    Toast.makeText(MainActivity.this, "Your Password is: " + edt2.getText() + " " + "Your Username is: " + edt1.getText(), Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(MainActivity.this, Main2Activity.class);
                    startActivity(i);
                    finish();
                }

            }
        });

    }

    public boolean checkValidation() {
        String name = edt1.getText().toString().trim();
        String pas = edt2.getText().toString().trim();

        if (name.length() <= 0) {
            edt1.requestFocus();
            edt1.setError("Enter Name");
            return false;
        } else if (pas.length() <= 0) {
            edt2.requestFocus();
            edt2.setError("Enter Password");
            return false;
        } else {
            return true;
        }
    }
}
