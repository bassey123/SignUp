package com.example.signup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

//        EditText edt1 = (EditText) findViewById(R.id.user);
//        EditText edt2 = (EditText) findViewById(R.id.pswd);
//
//        LayoutInflater inflater = getLayoutInflater();
//        View layout = inflater.inflate(R.layout.activity_main2,
//                (ViewGroup) findViewById(R.id.custom_toast));
//
//        TextView text = (TextView) layout.findViewById(R.id.text);
//        text.setText("Your Password is: " + edt2.getText() + "Your Username is: " + edt1.getText());
//
//        Toast toast = new Toast(getApplicationContext());
//        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
//        toast.setDuration(Toast.LENGTH_LONG);
//        toast.setView(layout);
//        toast.show();
    }
}
