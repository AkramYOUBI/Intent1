package com.example.intent1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Connexion extends AppCompatActivity {

    Button btnCon;
    EditText txtUsername, txtPassword;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connexion);
        txtUsername = findViewById(R.id.txtUsername);
        txtPassword = findViewById(R.id.txtPassword);
        btnCon = findViewById(R.id.btnCon);


        btnCon.setOnClickListener(v -> {
            String Username= txtUsername.getText().toString();
            String Password= txtPassword.getText().toString();
            if( Username == "" && Password == "" ) {
                String a="0";
            }
            else{
                Intent intent = new Intent(Connexion.this, Calculator.class);
                startActivity(intent);
                finish();
                return;
            }
        });


    }
}