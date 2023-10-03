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

        int edadInt = getIntent().getIntExtra("edad",1);

                    int resultado = edadInt*7;
                    String resultadoString = "Tu perro tiene: " + resultado + " años";
                    result.setText(resultadoString);

                }




}