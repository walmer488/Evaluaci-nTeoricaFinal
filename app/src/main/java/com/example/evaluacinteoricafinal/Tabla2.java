package com.example.evaluacinteoricafinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Tabla2 extends AppCompatActivity {

  private   Button boton1, boton2, boton3, boton4, boton5, boton6, boton7, boton8, boton9, boton0,
            botonsumar, botonrestar, botonmultiplicar, botonigual, botondividir, botonLimpiar;

    private TextView textViewResultado, etconcatenar;

    private  double numero1 , nuemro2 , resultado;

    private  String operador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabla2);
        setTitle("TableLayout");

        boton1 = findViewById(R.id.boton1);
        boton2 = findViewById(R.id.boton2);
        boton3 = findViewById(R.id.boton3);
        boton4 = findViewById(R.id.boton4);
        boton5 = findViewById(R.id.boton5);
        boton6 = findViewById(R.id.boton6);
        boton7 = findViewById(R.id.boton7);
        boton8 = findViewById(R.id.boton8);
        boton9 = findViewById(R.id.boton9);
        boton0 = findViewById(R.id.boton0);
        botonsumar = findViewById(R.id.botonsumar);
        botonrestar = findViewById(R.id.botonrestar);
        botonmultiplicar = findViewById(R.id.botonmultiplicar);
        botondividir = findViewById(R.id.botondividir);
        botonigual = findViewById(R.id.botonigual);
        botonLimpiar = findViewById(R.id.botonLimpiar);
        textViewResultado = findViewById(R.id.textViewResultado);

        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etconcatenar = findViewById(R.id.textViewResultado);
                textViewResultado.setText(etconcatenar.getText().toString() + "1");
            }
        });

        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etconcatenar = findViewById(R.id.textViewResultado);
                textViewResultado.setText(etconcatenar.getText().toString() + "2");
            }
        });

        boton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etconcatenar = findViewById(R.id.textViewResultado);
                textViewResultado.setText(etconcatenar.getText().toString() + "3");
            }
        });

        boton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etconcatenar = findViewById(R.id.textViewResultado);
                textViewResultado.setText(etconcatenar.getText().toString() + "4");
            }
        });

        boton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etconcatenar = findViewById(R.id.textViewResultado);
                textViewResultado.setText(etconcatenar.getText().toString() + "5");
            }
        });

        boton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etconcatenar = findViewById(R.id.textViewResultado);
                textViewResultado.setText(etconcatenar.getText().toString() + "6");
            }
        });

        boton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etconcatenar = findViewById(R.id.textViewResultado);
                textViewResultado.setText(etconcatenar.getText().toString() + "7");
            }
        });

        boton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etconcatenar = findViewById(R.id.textViewResultado);
                textViewResultado.setText(etconcatenar.getText().toString() + "8");
            }
        });

        boton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etconcatenar = findViewById(R.id.textViewResultado);
                textViewResultado.setText(etconcatenar.getText().toString() + "9");
            }
        });

        boton0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etconcatenar = findViewById(R.id.textViewResultado);
                textViewResultado.setText(etconcatenar.getText().toString() + "0");
            }
        });

        botonigual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etconcatenar = findViewById(R.id.textViewResultado);
                nuemro2 = Double.parseDouble(etconcatenar.getText().toString());

                if (operador.equals("+")) {
                    textViewResultado.setText("");
                    resultado = numero1 + nuemro2;
                    textViewResultado.setText(String.valueOf(resultado));
                }
                if (operador.equals("-")){
                    textViewResultado.setText("");
                    resultado = numero1 - nuemro2;
                    textViewResultado.setText(String.valueOf(resultado));
                }

                if (operador.equals("*")){
                    textViewResultado.setText("");
                    resultado = numero1 * nuemro2;
                    textViewResultado.setText(String.valueOf(resultado));
                }
                if (operador.equals("/")){
                    textViewResultado.setText("");
                    if (nuemro2 != 0){
                        resultado = numero1 / nuemro2;
                    }else {
                        textViewResultado.setText("infinito");
                    }
                    textViewResultado.setText(String.valueOf(resultado));
                }
            }
        });

        botonsumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              operador = "+";
              etconcatenar = findViewById(R.id.textViewResultado);
              numero1 = Double.parseDouble(etconcatenar.getText().toString());
              textViewResultado.setText("+");
            }
        });

        botonrestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operador = "-";
                etconcatenar = findViewById(R.id.textViewResultado);
                numero1 = Double.parseDouble(etconcatenar.getText().toString());
                textViewResultado.setText("-");
            }
        });

        botonmultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operador = "*";
                etconcatenar = findViewById(R.id.textViewResultado);
                numero1 = Double.parseDouble(etconcatenar.getText().toString());
                textViewResultado.setText("*");
            }
        });

        botondividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operador = "/";
                etconcatenar = findViewById(R.id.textViewResultado);
                numero1 = Double.parseDouble(etconcatenar.getText().toString());
                textViewResultado.setText("/");
            }
        });

        botonLimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // numero1 = 0;
               // nuemro2 = 0;
                textViewResultado.setText("");
            }
        });
    }
}