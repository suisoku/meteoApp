package com.example.meteoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText  loginElt;
    private EditText pwdElt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginElt = findViewById(R.id.editEmail);
        pwdElt = findViewById(R.id.editPwd);
    }

    public void authenticate(View view) {

        String login = loginElt.getText().toString();
        String pwd = pwdElt.getText().toString();
        Toast toastSuccess = Toast.makeText(this, "Authentification reussi", Toast.LENGTH_SHORT);
        Toast toastFailure = Toast.makeText(this, "Identifiant/mot de passe incorrect", Toast.LENGTH_SHORT);
       // Intent intentAct2 = new Intent(this, SecondActivity.class);

        if(login.equals("noureddine@gmail.com") && pwd.equals("lol123")){
            toastSuccess.show();
        //    startActivity(intentAct2);
        }
        else {
            toastFailure.show();
        }

    }
}
