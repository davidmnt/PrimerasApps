package com.example.primerasapps;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultPerroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_perro);
        TextView result = findViewById(R.id.result);

        //Metodo que recoge la informacion mandada por un intent.putExtra
        int edadInt = getIntent().getIntExtra("edad",1);

        //Hacemos la operacion de la edad del perro y la mostramos en el textView result

                    int resultado = edadInt*7;
                    String resultadoString = "Tu perro tiene: " + resultado + " años";
                    result.setText(resultadoString);

                }




}