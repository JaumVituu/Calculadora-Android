package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void adicao (View view){
        TextView TxtResultado = (TextView)findViewById(R.id.textResultado);
        EditText TxtValor1 = (EditText) findViewById(R.id.primeiroValor);
        EditText TxtValor2 = (EditText) findViewById(R.id.segundoValor);
        double valor1 = Double.parseDouble(String.valueOf(TxtValor1.getText().toString()));
        double valor2 = Double.parseDouble(String.valueOf(TxtValor2.getText().toString()));
        double resultado;
        resultado = valor1+valor2;

        TxtResultado.setText("Resultado: "+ String.valueOf(resultado));

    }
    public void subtracao(View view){
        TextView TxtResultado = (TextView)findViewById(R.id.textResultado);
        EditText TxtValor1 = (EditText) findViewById(R.id.primeiroValor);
        EditText TxtValor2 = (EditText) findViewById(R.id.segundoValor);
        double valor1 = Double.parseDouble(String.valueOf(TxtValor1.getText().toString()));
        double valor2 = Double.parseDouble(String.valueOf(TxtValor2.getText().toString()));
        double resultado;
        resultado = valor1-valor2;

        TxtResultado.setText("Resultado: "+ String.valueOf(resultado));
    }

    public void multiplicacao(View view){
        TextView TxtResultado = (TextView)findViewById(R.id.textResultado);
        EditText TxtValor1 = (EditText)findViewById(R.id.primeiroValor);
        EditText TxtValor2 = (EditText)findViewById(R.id.segundoValor);
        double valor1 = Double.parseDouble(String.valueOf(TxtValor1.getText().toString()));
        double valor2 = Double.parseDouble(String.valueOf(TxtValor2.getText().toString()));
        double resultado;
        resultado = valor1*valor2;

        TxtResultado.setText("Resultado: "+ String.valueOf(resultado));
    }

    public void divisao(View view){
        TextView TxtResultado = (TextView)findViewById((R.id.textResultado));
        EditText TxtValor1 = (EditText)findViewById(R.id.primeiroValor);
        EditText TxtValor2 = (EditText)findViewById(R.id.segundoValor);
        double valor1 = Double.parseDouble(String.valueOf(TxtValor1.getText().toString()));
        double valor2 = Double.parseDouble(String.valueOf(TxtValor2.getText().toString()));
        double resultado;
        resultado = valor1/valor2;

        TxtResultado.setText("Resultado: "+ String.valueOf(resultado));
    }
}