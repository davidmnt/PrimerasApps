package com.example.primerasapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PortadaCalculadoraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portada_calculadora);

        Button botonEmpezar = findViewById(R.id.botonEmpezar);


    }
    public void siguiente(View view) {

        Intent inte = new Intent(this, CalculadoraMain.class);
        startActivity(inte);

    }

}