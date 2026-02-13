//package com.example.miapp;

//import android.os.Bundle;

//import androidx.activity.EdgeToEdge;
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.core.graphics.Insets;
//import androidx.core.view.ViewCompat;
//import androidx.core.view.WindowInsetsCompat;

//public class segundaActivity extends AppCompatActivity {

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
 //       EdgeToEdge.enable(this);
//        setContentView(R.layout.activity_segunda);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
 //           Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
 //           v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
  //          return insets;
 //       });
//    }
//}

package com.example.miapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SegundaActivity extends AppCompatActivity {

    private TextView tvMensaje;
    private Button btnVolver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        // Inicializar vistas
        tvMensaje = findViewById(R.id.tv_mensaje);
        btnVolver = findViewById(R.id.btn_volver);

        // Obtener datos enviados desde MainActivity
        Intent intent = getIntent();
        if (intent != null && intent.hasExtra("contador")) {
            int contadorRecibido = intent.getIntExtra("contador", 0);
            tvMensaje.setText("Valor recibido: " + contadorRecibido);
        }

        // Configurar botón para volver
        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // Cierra esta actividad y vuelve a la anterior
            }
        });
    }
}