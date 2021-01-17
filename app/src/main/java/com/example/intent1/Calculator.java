package com.example.intent1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Calculator extends AppCompatActivity {

    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bplus,bmoins,betoile,bdiv,bc,begal;
    TextView res;
    private double chiffre1;
    private boolean clicOperateur = false;
    private boolean update = false;
    private String operateur = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);


        b0 = findViewById(R.id.btn0);
        b1 = findViewById(R.id.btn1);
        b2 = findViewById(R.id.btn2);
        b3 = findViewById(R.id.btn3);
        b4 =  findViewById(R.id.btn4);
        b5 = findViewById(R.id.btn5);

        b6 =  findViewById(R.id.btn6);
        b7 =  findViewById(R.id.btn7);
        b8 =  findViewById(R.id.btn8);
        b9 =  findViewById(R.id.btn9);
        bplus =  findViewById(R.id.btnPlus);
        bmoins =  findViewById(R.id.btnMoins);
        betoile =  findViewById(R.id.btnFois);
        bdiv = findViewById(R.id.btnDiv);
        bc = findViewById(R.id.btnClear);
        begal = findViewById(R.id.btnEgal);

        res = findViewById(R.id.screen);

        bplus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                plusClick();
            }
        });

        bmoins.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                moinsClick();
            }
        });

        betoile.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                etoileClick();
            }
        });

        bdiv.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                divClick();
            }
        });


        bc.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                resetClick();
            }
        });

        begal.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                egalClick();
            }
        });



        b0.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                chiffreClick("0");
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                chiffreClick("1");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                chiffreClick("2");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                chiffreClick("3");
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                chiffreClick("4");
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                chiffreClick("5");
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                chiffreClick("6");
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                chiffreClick("7");
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                chiffreClick("8");
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                chiffreClick("9");
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                chiffreClick("5");
            }
        });

    }
    public void chiffreClick(String str) {
        if(update){
            update = false;
        }else{
            if(!res.getText().equals("0"))
                str = res.getText() + str;
        }
        res.setText(str);



    }


    public void plusClick(){

        if(clicOperateur){
            calcul();
            res.setText(String.valueOf(chiffre1));
        }else{
            chiffre1 = Double.valueOf(res.getText().toString()).doubleValue();
            clicOperateur = true;
        }
        operateur = "+";
        update = true;
    }




    public void moinsClick(){
        if(clicOperateur){
            calcul();
            res.setText(String.valueOf(chiffre1));
        }else{
            chiffre1 = Double.valueOf(res.getText().toString()).doubleValue();
            clicOperateur = true;
        }
        operateur = "-";
        update = true;
    }

    public void etoileClick(){
        if(clicOperateur){
            calcul();
            res.setText(String.valueOf(chiffre1));
        }else{
            chiffre1 = Double.valueOf(res.getText().toString()).doubleValue();
            clicOperateur = true;
        }
        operateur = "*";
        update = true;
    }


    public void divClick(){
        if(clicOperateur){
            calcul();
            res.setText(String.valueOf(chiffre1));
        }else{
            chiffre1 = Double.valueOf(res.getText().toString()).doubleValue();
            clicOperateur = true;
        }
        operateur = "/";
        update = true;
    }

    public void egalClick(){
        calcul();
        update = true;
        clicOperateur = false;
    }

    public void resetClick(){
        clicOperateur = false;
        update = true;
        chiffre1 = 0;
        operateur = "";
        res.setText("");
    }

    private void calcul(){
        if(operateur.equals("+")){
            chiffre1 = chiffre1 + Double.valueOf(res.getText().toString()).doubleValue();
            res.setText(String.valueOf(chiffre1));
        }

        if(operateur.equals("-")){
            chiffre1 = chiffre1 - Double.valueOf(res.getText().toString()).doubleValue();
            res.setText(String.valueOf(chiffre1));
        }

        if(operateur.equals("*")){
            chiffre1 = chiffre1 * Double.valueOf(res.getText().toString()).doubleValue();
            res.setText(String.valueOf(chiffre1));
        }

        if(operateur.equals("/")){
            try{
                chiffre1 = chiffre1 / Double.valueOf(res.getText().toString()).doubleValue();
                res.setText(String.valueOf(chiffre1));
            }catch(ArithmeticException e){
                res.setText("0");
            }
        }
    }




}