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
                //Comporbamos si esta vacia la edad

                if(!edad.isEmpty()){

                     edadInt = Integer.parseInt(edad);

                }
                enviarPantalla(BotonEnviar);
            }

        });


        }

        //igual que en otros ejercicios he definido un intent para pasar a otro activity
        //pero en este caso el intent tiene que mandar la edad del perro al otro activity
        //Esto se hace con el metodo intent.putExtra(parametro de entrada nombre y la variable que quieres mandar)
    public void enviarPantalla(View view){

        Intent in = new Intent(this, ResultPerroActivity.class);
        in.putExtra("edad",edadInt);
        startActivity(in);

    }
}