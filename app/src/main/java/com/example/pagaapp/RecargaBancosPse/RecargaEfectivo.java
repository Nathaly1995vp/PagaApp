package com.example.pagaapp.RecargaBancosPse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.pagaapp.IngresoPassword.Menu;
import com.example.pagaapp.R;

public class RecargaEfectivo extends AppCompatActivity {
Button volverEfec;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recarga_efectivo);

        volverEfec = (Button)findViewById(R.id.volverEfec);
        volverEfec.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(RecargaEfectivo.this, Menu.class);
                startActivity(intent);
                finish();
            }
        });
        getSupportActionBar().hide();
    }
}