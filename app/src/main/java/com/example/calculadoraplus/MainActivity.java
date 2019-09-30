package com.example.calculadoraplus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView et_resultado;
    private Button b1;
    private Button b2;
    private Button b3;
    private Button b4;
    private Button b5;
    private Button b6;
    private Button b7;
    private Button b8;
    private Button b9;
    private Button b0;
    private Button b_punto;
    private Button b_clear;
    private Button b_residuo;
    private Button b_suma;
    private Button b_resta;
    private Button b_multi;
    private Button b_div;
    private Button b_igual;
    private double oper1;
    private double oper2;
    private double res;
    int op;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_resultado = (TextView)findViewById(R.id.et_result);
        b1 = (Button)findViewById(R.id.b1);
        b2 = (Button)findViewById(R.id.b2);
        b3 = (Button)findViewById(R.id.b3);
        b4 = (Button)findViewById(R.id.b4);
        b5 = (Button)findViewById(R.id.b5);
        b6 = (Button)findViewById(R.id.b6);
        b7 = (Button)findViewById(R.id.b7);
        b8 = (Button)findViewById(R.id.b8);
        b9 = (Button)findViewById(R.id.b9);
        b0 = (Button)findViewById(R.id.b0);
        b_punto = (Button)findViewById(R.id.b_punto);
        b_clear = (Button)findViewById(R.id.b_clear);
        b_residuo = (Button)findViewById(R.id.b_residuo);
        b_suma = (Button)findViewById(R.id.b_suma);
        b_resta = (Button)findViewById(R.id.b_resta);
        b_multi = (Button)findViewById(R.id.b_multi);
        b_div = (Button)findViewById(R.id.b_divicion);
        b_igual = (Button)findViewById(R.id.b_igual);


    }

    public void B1(View view){
        String cap = et_resultado.getText().toString();
        cap = cap + "1";
        et_resultado.setText(cap);
    }

    public void B2(View view){
        String cap = et_resultado.getText().toString();
        cap = cap + "2";
        et_resultado.setText(cap);
    }

    public void B3(View view){
        String cap = et_resultado.getText().toString();
        cap = cap + "3";
        et_resultado.setText(cap);
    }

    public void B4(View view){
        String cap = et_resultado.getText().toString();
        cap = cap + "4";
        et_resultado.setText(cap);
    }

    public void B5(View view){
        String cap = et_resultado.getText().toString();
        cap = cap + "5";
        et_resultado.setText(cap);
    }

    public void B6(View view){
        String cap = et_resultado.getText().toString();
        cap = cap + "6";
        et_resultado.setText(cap);
    }

    public void B7(View view){
        String cap = et_resultado.getText().toString();
        cap = cap + "7";
        et_resultado.setText(cap);
    }

    public void B8(View view){
        String cap = et_resultado.getText().toString();
        cap = cap + "8";
        et_resultado.setText(cap);
    }

    public void B9(View view){
        String cap = et_resultado.getText().toString();
        cap = cap + "9";
        et_resultado.setText(cap);
    }

    public void B0(View view){
        String cap = et_resultado.getText().toString();
        cap = cap + "0";
        et_resultado.setText(cap);
    }

    public void BPunto(View view){
        String cap = et_resultado.getText().toString();
        cap = cap + ".";
        et_resultado.setText(cap);
    }

    public void Sumar(View view){
        try {
            String aux = et_resultado.getText().toString();
            oper1 = Double.parseDouble(aux);
        }catch (NumberFormatException nfe){ }

        et_resultado.setText("");
        op = 1;

    }

    public void Restar(View view){
        try {
            String aux = et_resultado.getText().toString();
            oper1 = Double.parseDouble(aux);
        }catch (NumberFormatException nfe){ }

        et_resultado.setText("");
        op = 2;

    }

    public void Multiplicar(View view){
        try {
            String aux = et_resultado.getText().toString();
            oper1 = Double.parseDouble(aux);
        }catch (NumberFormatException nfe){ }

        et_resultado.setText("");
        op = 3;

    }

    public void Dividir(View view){
        try {
            String aux = et_resultado.getText().toString();
            oper1 = Double.parseDouble(aux);
        }catch (NumberFormatException nfe){ }

        et_resultado.setText("");
        op = 4;

    }

    public void Porcentaje(View view){
        try {
            String aux = et_resultado.getText().toString();
            oper1 = Double.parseDouble(aux);
        }catch (NumberFormatException nfe){ }

        et_resultado.setText("");
        op = 5;
    }

    public void Clear(View view){
        et_resultado.setText("");
        oper1 = 0;
        oper2 = 0;
        res = 0;
    }

    public void Igual(View view){
        try {
            String aux2 = et_resultado.getText().toString();
            oper2 = Double.parseDouble(aux2);
        }catch (NumberFormatException nfe){ }

        et_resultado.setText("");

        if (op == 1){
            res = oper1 + oper2;
        }else if (op == 2){
            res = oper1 - oper2;
        }else if (op == 3){
            res = oper1 * oper2;
        }else if (op == 4){
            if (oper2 == 0){
                et_resultado.setText("ERROR");
            }else {
                res = oper1 / oper2;
            }
        }else if (op == 5){
            res = oper2 * (oper1/100);
        }

        String resultado = String.valueOf(res);
        et_resultado.setText(resultado);
        oper1 = res;

    }

}
