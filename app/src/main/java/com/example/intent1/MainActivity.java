package com.example.intent1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnConnect , btnCalculator , btnCall , btnCamera ;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnConnect = findViewById(R.id.btnConnect);
        btnCalculator = findViewById(R.id.btnCalculator);
        btnCall = findViewById(R.id.btnCall);
        btnCamera = findViewById(R.id.btnCamera);

        btnCalculator.setOnClickListener(v -> {
            Intent intent=new Intent(MainActivity.this, Calculator.class);
            startActivity(intent);
            finish();
            return;
        });
        btnConnect.setOnClickListener(v -> {
            Intent intent=new Intent(MainActivity.this, Connexion.class);
            startActivity(intent);
            finish();
            return;
        });
        btnCamera.setOnClickListener(v -> {

                Intent Intent3=new   Intent(MediaStore.INTENT_ACTION_STILL_IMAGE_CAMERA);
                startActivity(Intent3);

        });
        btnCall.setOnClickListener(v -> {

            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:0684060867"));
            startActivity(intent);
        });
    }
}