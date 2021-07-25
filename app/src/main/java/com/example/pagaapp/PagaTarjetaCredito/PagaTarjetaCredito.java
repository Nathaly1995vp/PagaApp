package com.example.pagaapp.PagaTarjetaCredito;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.pagaapp.IngresoPassword.Menu;
import com.example.pagaapp.PuntajeCrediticio.PuntajeCrediticio;
import com.example.pagaapp.PuntajeCrediticio.TipsCrediticios;
import com.example.pagaapp.R;

public class PagaTarjetaCredito extends AppCompatActivity {
Button pagarTC, volverTC;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paga_tarjeta_credito);

        pagarTC = (Button)findViewById(R.id.pagarTC);
        pagarTC.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(PagaTarjetaCredito.this, PagoExitosoTC.class);
                startActivity(intent);
                finish();
            }
        });
        getSupportActionBar().hide();

        volverTC = (Button)findViewById(R.id.volverTC);
        volverTC.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(PagaTarjetaCredito.this, Menu.class);
                startActivity(intent);
                finish();
            }
        });
        getSupportActionBar().hide();
    }
}