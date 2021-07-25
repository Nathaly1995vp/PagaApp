package com.example.pagaapp.PagaTarjetaCredito;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.pagaapp.IngresoPassword.Menu;
import com.example.pagaapp.R;

public class PagoExitosoTC extends AppCompatActivity {
Button descargarTC, volverExitosoTC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pago_exitoso_t_c);

        descargarTC = (Button)findViewById(R.id.descargarTC);
        descargarTC.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(PagoExitosoTC.this, PagaTarjetaCredito.class);
                startActivity(intent);
                finish();
            }
        });
        getSupportActionBar().hide();

        volverExitosoTC = (Button)findViewById(R.id.volverExitosoTC);
        volverExitosoTC.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(PagoExitosoTC.this, Menu.class);
                startActivity(intent);
                finish();
            }
        });
        getSupportActionBar().hide();
    }
}