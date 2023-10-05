package com.example.primerasapps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CalculadoraMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculadora);

        TextView pantalla = findViewById(R.id.pantalla);
        Button boton7 = findViewById(R.id.siete);
        Button boton8 = findViewById(R.id.ocho);
        Button boton9 = findViewById(R.id.nueve);
        Button botonDividir = findViewById(R.id.dividir);
        Button boton4= findViewById(R.id.cuatro);
        Button boton5 = findViewById(R.id.cinco);
        Button boton6 = findViewById(R.id.seix);
        Button botonMulti = findViewById(R.id.multiplicar);
        Button boton1 = findViewById(R.id.uno);
        Button boton2 = findViewById(R.id.dos);
        Button boton3 = findViewById(R.id.tres);
        Button botonRestar = findViewById(R.id.resta);
        Button botonComa = findViewById(R.id.coma);
        Button boton0 = findViewById(R.id.cero);
        Button botonSuma = findViewById(R.id.suma);
        Button botonIgual = findViewById(R.id.igual);
        Button botonAC = findViewById(R.id.AC);

            boton7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Log.d("Botom 7", boton7.getText().toString());
                    String numero = boton7.getText().toString();
                    pantalla.setText(pantalla.getText() + numero);

                }
            });
            boton8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Log.d("Botom 8", boton8.getText().toString());
                    String numero = boton8.getText().toString();
                    pantalla.setText(pantalla.getText() + numero);

                }
            });
            boton9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Log.d("Botom 9", boton9.getText().toString());
                    String numero7 = boton9.getText().toString();
                    pantalla.setText(pantalla.getText() + numero7);

                }
            });
            boton4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Log.d("Botom 4", boton4.getText().toString());
                    String numero = boton4.getText().toString();
                    pantalla.setText(pantalla.getText() + numero);

                }
            });
            boton5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Log.d("Botom 5", boton5.getText().toString());
                    String numero = boton5.getText().toString();
                    pantalla.setText(pantalla.getText() + numero);

                }
            });
            boton6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Log.d("Botom 6", boton6.getText().toString());
                    String numero = boton6.getText().toString();
                    pantalla.setText(pantalla.getText() + numero);

                }
            });
            boton1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Log.d("Botom 1", boton1.getText().toString());
                    String numero = boton1.getText().toString();
                    pantalla.setText(pantalla.getText() + numero);

                }
            });
            boton2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Log.d("Botom 2", boton2.getText().toString());
                    String numero = boton2.getText().toString();
                    pantalla.setText(pantalla.getText() + numero);

                }
            });
            boton3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Log.d("Botom 3", boton3.getText().toString());
                    String numero = boton3.getText().toString();
                    pantalla.setText(pantalla.getText() + numero);

                }
            });
            boton0.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Log.d("Botom 0", boton0.getText().toString());
                    String numero = boton0.getText().toString();
                    pantalla.setText(pantalla.getText() + numero);

                }
            });
            botonDividir.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Log.d("Botom Dividir", botonDividir.getText().toString());
                    String dividir = botonDividir.getText().toString();
                    pantalla.setText(pantalla.getText() + dividir);

                }
            });
            botonMulti.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Log.d("Botom Multi", botonMulti.getText().toString());
                    String Multi = botonMulti.getText().toString();
                    pantalla.setText(pantalla.getText() + Multi);

                }
            });
            botonRestar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Log.d("Botom Resta", botonRestar.getText().toString());
                    String resta = botonRestar.getText().toString();
                    pantalla.setText(pantalla.getText() + resta);

                }
            });
            botonSuma.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Log.d("Botom Suma", botonSuma.getText().toString());
                    String mas = botonSuma.getText().toString();
                    pantalla.setText(pantalla.getText() + mas);

                }
            });
            botonComa.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Log.d("Botom Coma", botonComa.getText().toString());
                    String numero7 = boton7.getText().toString();
                    pantalla.setText(pantalla.getText() + numero7);

                }
            });
            botonIgual.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int result = 0;
                    int contTotal = 0;
                    String num1 = "";
                    String num2 = "";

                    //pasamos el numero a un Array de char

                    char[] numChar = pantalla.getText().toString().toCharArray();

                    //Hacemos un bucle para sacar el primer numero hasta el signo de operacion
                    for (int i = 0; i < numChar.length; i++) {

                        //Forzamos un break para una vez llegado al signo pare de concatenar numeros al num1
                        if (numChar[i] == '+' || numChar[i] == '-' || numChar[i] == '*' || numChar[i] == '/') {
                            break;
                        }
                        num1 += pantalla.getText().toString().charAt(i);
                        contTotal++;

                    }
                    //Luego hacemos otro bucle para para sacra el num2 inicializando el cont del for anterior +1
                    for (int i = contTotal + 1; i < numChar.length; i++) {
                        num2 += String.valueOf(pantalla.getText().toString().charAt(i));
                    }

                    //Pasamos los numeros de String a int
                    int numero1 = Integer.parseInt(num1);
                    int numero2 = Integer.parseInt(num2);
                    char operacion = pantalla.getText().toString().charAt(contTotal);

                    //Segun el signo hacemos la operacion correspondiente
                    switch (operacion) {
                        case '+':
                            result = numero1 + numero2;
                            break;
                        case '-':
                            result = numero1 - numero2;
                            break;
                        case '/':
                            result = numero1 / numero2;
                            break;
                        case '*':
                            result = numero1 * numero2;
                    }


                    String resultado = "" + result;

                    Log.d("Botom Igual", resultado);
                    pantalla.setText(resultado);


                }
            });

            botonAC.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    pantalla.setText("");
                }
            });




    }
}