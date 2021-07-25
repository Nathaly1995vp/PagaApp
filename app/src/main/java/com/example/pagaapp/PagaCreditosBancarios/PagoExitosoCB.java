package com.example.pagaapp.PagaCreditosBancarios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.pagaapp.IngresoPassword.Menu;
import com.example.pagaapp.PagaTarjetaCredito.PagaTarjetaCredito;
import com.example.pagaapp.PagaTarjetaCredito.PagoExitosoTC;
import com.example.pagaapp.R;

public class PagoExitosoCB extends AppCompatActivity {
Button descargarTC, volverExitosoCB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pago_exitoso_c_b);

        descargarTC = (Button)findViewById(R.id.descargarTC);
        descargarTC.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(PagoExitosoCB.this, PagaTarjetaCredito.class);
                startActivity(intent);
                finish();
            }
        });
        getSupportActionBar().hide();

        volverExitosoCB = (Button)findViewById(R.id.volverExitosoCB);
        volverExitosoCB.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(PagoExitosoCB.this, Menu.class);
                startActivity(intent);
                finish();
            }
        });
        getSupportActionBar().hide();
    }
}