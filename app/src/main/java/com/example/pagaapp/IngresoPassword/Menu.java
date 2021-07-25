package com.example.pagaapp.IngresoPassword;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.pagaapp.BolsilloDinero.BolsilloAhorrador;
import com.example.pagaapp.HistorialDePagos.HistorialPagos;
import com.example.pagaapp.PagaCreditosBancarios.PagaCreditosBancarios;
import com.example.pagaapp.PagaTarjetaCredito.PagaTarjetaCredito;
import com.example.pagaapp.PuntajeCrediticio.PuntajeCrediticio;
import com.example.pagaapp.QrEstablecimientos.EscaneaQrPago;
import com.example.pagaapp.R;
import com.example.pagaapp.RecargaBancosPse.RecargarCuenta;

public class Menu extends AppCompatActivity {
Button tarjetaCredito, creditoBancario, puntajeCrediticio, recargarCuenta, bolsillo, qrEstablecimientos, historialPagos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        historialPagos = (Button)findViewById(R.id.historialPagos);
        historialPagos.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(Menu.this, HistorialPagos.class);
                startActivity(intent);
                finish();
            }
        });
        getSupportActionBar().hide();

        tarjetaCredito = (Button)findViewById(R.id.tarjetaCredito);
        tarjetaCredito.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(Menu.this, PagaTarjetaCredito.class);
                startActivity(intent);
                finish();
            }
        });
        getSupportActionBar().hide();

        creditoBancario = (Button)findViewById(R.id.creditoBancario);
        creditoBancario.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(Menu.this, PagaCreditosBancarios.class);
                startActivity(intent);
                finish();
            }
        });
        getSupportActionBar().hide();

        puntajeCrediticio = (Button)findViewById(R.id.puntajeCrediticio);
        puntajeCrediticio.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(Menu.this, PuntajeCrediticio.class);
                startActivity(intent);
                finish();
            }
        });
        getSupportActionBar().hide();

        recargarCuenta = (Button)findViewById(R.id.recargarCuenta);
        recargarCuenta.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(Menu.this, RecargarCuenta.class);
                startActivity(intent);
                finish();
            }
        });
        getSupportActionBar().hide();

        bolsillo = (Button)findViewById(R.id.bolsillo);
        bolsillo.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(Menu.this, BolsilloAhorrador.class);
                startActivity(intent);
                finish();
            }
        });
        getSupportActionBar().hide();

        qrEstablecimientos = (Button)findViewById(R.id.qrEstablecimientos);
        qrEstablecimientos.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(Menu.this, EscaneaQrPago.class);
                startActivity(intent);
                finish();
            }
        });
        getSupportActionBar().hide();
    }
}