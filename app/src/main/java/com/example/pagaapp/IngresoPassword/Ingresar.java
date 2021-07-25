package com.example.pagaapp.IngresoPassword;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.pagaapp.MainActivity;
import com.example.pagaapp.R;

public class Ingresar extends AppCompatActivity {
Button ingreso1, olvideClave, soporte;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingresar);

        ingreso1 = (Button)findViewById(R.id.ingreso1);
        ingreso1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(Ingresar.this, Menu.class);
                startActivity(intent);
                finish();
            }
        });
        getSupportActionBar().hide();

        olvideClave = (Button)findViewById(R.id.olvideClave);
        olvideClave.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(Ingresar.this, OlvideMiClave.class);
                startActivity(intent);
                finish();
            }
        });
        getSupportActionBar().hide();


        soporte = (Button)findViewById(R.id.soporte);
        soporte.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(Ingresar.this, Soporte.class);
                startActivity(intent);
                finish();
            }
        });
        getSupportActionBar().hide();
    }
}
