package com.example.pagaapp.HistorialDePagos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.pagaapp.BolsilloDinero.BolsilloAhorrador;
import com.example.pagaapp.IngresoPassword.Menu;
import com.example.pagaapp.R;

public class HistorialPagos extends AppCompatActivity {
    Button volverHistorial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historial_pagos);

        volverHistorial = (Button)findViewById(R.id.volverHistorial);
        volverHistorial.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(HistorialPagos.this, Menu.class);
                startActivity(intent);
                finish();
            }
        });
        getSupportActionBar().hide();

    }
}