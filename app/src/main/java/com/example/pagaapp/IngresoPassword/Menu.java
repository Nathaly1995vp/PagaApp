package com.example.pagaapp.IngresoPassword;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.pagaapp.BolsilloDinero.BolsilloAhorrador;
import com.example.pagaapp.HistorialDePagos.HistorialPagos;
import com.example.pagaapp.PagaCreditosBancarios.PagaCreditosBancarios;
import com.example.pagaapp.PagaTarjetaCredito.PagaTarjetaCredito;
import com.example.pagaapp.PuntajeCrediticio.PuntajeCrediticio;
import com.example.pagaapp.QrEstablecimientos.EscaneaQrPago;
import com.example.pagaapp.R;
import com.example.pagaapp.RecargaBancosPse.RecargaPSE;
import com.example.pagaapp.RecargaBancosPse.RecargarCuenta;

public class Menu extends AppCompatActivity {
ImageButton tarjetaCredito, creditoBancario, puntajeCrediticio, recargarCuenta, bolsillo, qrEstablecimientos, historialPagos, retirar;
Button volverMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        historialPagos = (ImageButton)findViewById(R.id.historialPagos);
        historialPagos.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(Menu.this, HistorialPagos.class);
                startActivity(intent);
                finish();
            }
        });
        getSupportActionBar().hide();

        tarjetaCredito = (ImageButton)findViewById(R.id.tarjetaCredito);
        tarjetaCredito.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(Menu.this, PagaTarjetaCredito.class);
                startActivity(intent);
                finish();
            }
        });
        getSupportActionBar().hide();

        creditoBancario = (ImageButton)findViewById(R.id.crediBanc);
        creditoBancario.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(Menu.this, PagaTarjetaCredito.class);
                startActivity(intent);
                finish();
            }
        });
        getSupportActionBar().hide();

        puntajeCrediticio = (ImageButton)findViewById(R.id.puntajeCrediticio);
        puntajeCrediticio.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(Menu.this, PuntajeCrediticio.class);
                startActivity(intent);
                finish();
            }
        });
        getSupportActionBar().hide();

        recargarCuenta = (ImageButton)findViewById(R.id.recargarCuenta);
        recargarCuenta.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(Menu.this, RecargarCuenta.class);
                startActivity(intent);
                finish();
            }
        });
        getSupportActionBar().hide();

        bolsillo = (ImageButton)findViewById(R.id.bolsillo);
        bolsillo.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(Menu.this, BolsilloAhorrador.class);
                startActivity(intent);
                finish();
            }
        });
        getSupportActionBar().hide();

        qrEstablecimientos = (ImageButton)findViewById(R.id.qrEstablecimientos);
        qrEstablecimientos.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(Menu.this, EscaneaQrPago.class);
                startActivity(intent);
                finish();
            }
        });
        getSupportActionBar().hide();

        retirar = (ImageButton)findViewById(R.id.retirar);
        retirar.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(Menu.this, RecargaPSE.class);
                startActivity(intent);
                finish();
            }
        });
        getSupportActionBar().hide();

        volverMenu = (Button)findViewById(R.id.volverMenu);
        volverMenu.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(Menu.this, Ingresar.class);
                startActivity(intent);
                finish();
            }
        });
        getSupportActionBar().hide();
    }
}