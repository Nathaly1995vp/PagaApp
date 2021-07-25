package com.example.pagaapp.QrEstablecimientos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.pagaapp.IngresoPassword.Ingresar;
import com.example.pagaapp.IngresoPassword.Menu;
import com.example.pagaapp.IngresoPassword.OlvideMiClave;
import com.example.pagaapp.R;

public class EscaneaQrPago extends AppCompatActivity {
Button pagarQr, volverQr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escanea_qr_pago);

        pagarQr = (Button)findViewById(R.id.pagarQr);
        pagarQr.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(EscaneaQrPago.this, Menu.class);
                startActivity(intent);
                finish();
            }
        });
        getSupportActionBar().hide();

        volverQr = (Button)findViewById(R.id.volverQr);
        volverQr.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(EscaneaQrPago.this, Menu.class);
                startActivity(intent);
                finish();
            }
        });
        getSupportActionBar().hide();
    }
}