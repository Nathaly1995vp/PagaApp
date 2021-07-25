package com.example.pagaapp.IngresoPassword;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.pagaapp.R;

public class Soporte extends AppCompatActivity {
Button iniciarChat, volverSoporte;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soporte);

        iniciarChat = (Button)findViewById(R.id.iniciarChat);
        iniciarChat.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(Soporte.this, Ingresar.class);
                startActivity(intent);
                finish();
            }
        });
        getSupportActionBar().hide();

        volverSoporte = (Button)findViewById(R.id.volverSoporte);
        volverSoporte.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(Soporte.this, Ingresar.class);
                startActivity(intent);
                finish();
            }
        });
        getSupportActionBar().hide();
    }
}