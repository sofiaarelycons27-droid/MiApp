package com.example.miapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button btnIrSegundaPantalla;
    private TextView tvContador;
    private int contador = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnIrSegundaPantalla = findViewById(R.id.btn_ir_segunda);
        tvContador = findViewById(R.id.tv_contador);

        btnIrSegundaPantalla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Crear Intent para ir a SegundaActivity
                Intent intent = new Intent(MainActivity.this, SegundaActivity.class);
                // Pasar datos a la segunda pantalla
                intent.putExtra("contador", contador);
                // Iniciar la actividad
                startActivity(intent);
            }
        });

        Button btnIncrementar = findViewById(R.id.btn_incrementar);
        btnIncrementar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador++;
                tvContador.setText("Contador: " + contador);
            }
        });
    }
}