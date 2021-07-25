package com.example.pagaapp.PuntajeCrediticio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.pagaapp.IngresoPassword.Ingresar;
import com.example.pagaapp.IngresoPassword.Menu;
import com.example.pagaapp.IngresoPassword.Soporte;
import com.example.pagaapp.R;

public class PuntajeCrediticio extends AppCompatActivity {
Button tipsPuntaje, volverPuntaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puntaje_crediticio);


        tipsPuntaje = (Button)findViewById(R.id.tipsPuntaje);
        tipsPuntaje.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(PuntajeCrediticio.this, TipsCrediticios.class);
                startActivity(intent);
                finish();
            }
        });
        getSupportActionBar().hide();

        volverPuntaje = (Button)findViewById(R.id.volverPuntaje);
        volverPuntaje.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(PuntajeCrediticio.this, Menu.class);
                startActivity(intent);
                finish();
            }
        });
        getSupportActionBar().hide();
    }
}