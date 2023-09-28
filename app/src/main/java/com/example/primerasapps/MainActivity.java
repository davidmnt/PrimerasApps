package com.example.primerasapps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Inicia la aplicacion
        setContentView(R.layout.activity_main);

        EditText EditEdad = findViewById(R.id.EditEdad);
        TextView resultado = findViewById(R.id.resultado);
        Button BotonEnviar = findViewById(R.id.BotonEnviar);

        BotonEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toma la edad
                String edad = EditEdad.getText().toString();
                //Comporbamos si esta vacia loa edad

                if(!edad.isEmpty()){

                    int edadInt = Integer.parseInt(edad);
                    int result = edadInt*7;
                    String resultadoString = "Tu perro tiene: " + result + " años";
                    resultado.setText(resultadoString);

                }



            }
        });



    }
}