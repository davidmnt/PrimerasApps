package com.example.primerasapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
   private int edadInt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Inicia la aplicacion
        setContentView(R.layout.activity_main);

        EditText EditEdad = findViewById(R.id.EditEdad);
        Button BotonEnviar = findViewById(R.id.BotonEnviar);

       BotonEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Toma la edad
                String edad = EditEdad.getText().toString();
                //Comporbamos si esta vacia loa edad

                if(!edad.isEmpty()){

                     edadInt = Integer.parseInt(edad);

                }
                enviarPantalla(BotonEnviar);
            }

        });


        }


    public void enviarPantalla(View view){

        Intent in = new Intent(this, ResultPerroActivity.class);
        in.putExtra("edad",edadInt);
        startActivity(in);

    }
}