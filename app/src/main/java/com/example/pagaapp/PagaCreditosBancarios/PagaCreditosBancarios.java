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

public class PagaCreditosBancarios extends AppCompatActivity {
Button volverCB, pagarCB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paga_creditos_bancarios);

        pagarCB = (Button)findViewById(R.id.pagarCB);
        pagarCB.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(PagaCreditosBancarios.this, PagoExitosoCB.class);
                startActivity(intent);
                finish();
            }
        });
        getSupportActionBar().hide();

        volverCB = (Button)findViewById(R.id.volverTC);
        volverCB.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(PagaCreditosBancarios.this, Menu.class);
                startActivity(intent);
                finish();
            }
        });
        getSupportActionBar().hide();
    }
}