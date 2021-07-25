package com.example.pagaapp.BolsilloDinero;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.pagaapp.IngresoPassword.Ingresar;
import com.example.pagaapp.IngresoPassword.Menu;
import com.example.pagaapp.IngresoPassword.Soporte;
import com.example.pagaapp.R;

public class BolsilloAhorrador extends AppCompatActivity {
Button volverBolsillo, sgtBolsillo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bolsillo_ahorrador);

        volverBolsillo = (Button)findViewById(R.id.volverBolsillo);
        volverBolsillo.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(BolsilloAhorrador.this, Menu.class);
                startActivity(intent);
                finish();
            }
        });
        getSupportActionBar().hide();

        sgtBolsillo = (Button)findViewById(R.id.sgtBolsillo);
        sgtBolsillo.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(BolsilloAhorrador.this, Menu.class);
                startActivity(intent);
                finish();
            }
        });
        getSupportActionBar().hide();
    }
}