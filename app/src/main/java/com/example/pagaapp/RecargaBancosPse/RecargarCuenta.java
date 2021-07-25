package com.example.pagaapp.RecargaBancosPse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.pagaapp.HistorialDePagos.HistorialPagos;
import com.example.pagaapp.IngresoPassword.Ingresar;
import com.example.pagaapp.IngresoPassword.Menu;
import com.example.pagaapp.R;

public class RecargarCuenta extends AppCompatActivity {
ImageButton enEfectivo, recargaPse;
Button volverRecargar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recargar_cuenta);

        enEfectivo = (ImageButton)findViewById(R.id.enEfectivo);
        enEfectivo.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(RecargarCuenta.this, RecargaEfectivo.class);
                startActivity(intent);
                finish();
            }
        });
        getSupportActionBar().hide();

        recargaPse = (ImageButton)findViewById(R.id.recargaPse);
        recargaPse.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(RecargarCuenta.this, RecargaPSE.class);
                startActivity(intent);
                finish();
            }
        });
        getSupportActionBar().hide();

        volverRecargar = (Button)findViewById(R.id.volverRecargar);
        volverRecargar.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(RecargarCuenta.this, Menu.class);
                startActivity(intent);
                finish();
            }
        });
        getSupportActionBar().hide();
    }
}