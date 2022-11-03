package com.example.reciclaje;

import static com.example.reciclaje.PesoAdaptador.FECHA;
import static com.example.reciclaje.PesoAdaptador.PESO;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class PesoEditar extends AppCompatActivity {

    private String peso;
    private String fecha;
    TextView tvPeso;
    TextView tvFecha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peso_editar);

        peso = getIntent().getStringExtra(PESO);
        fecha = getIntent().getStringExtra(FECHA);

        tvFecha = (TextView) findViewById(R.id.fecha);
        tvFecha.setText(fecha);

        tvPeso = (TextView) findViewById(R.id.peso);
        tvPeso.setText(peso);

    }
}