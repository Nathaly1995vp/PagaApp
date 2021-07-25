package com.example.pagaapp.IngresoPassword;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.pagaapp.R;

public class OlvideMiClave extends AppCompatActivity {
Button sgtOlvideClave, volverOlvideClave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_olvide_mi_clave);

        sgtOlvideClave = (Button)findViewById(R.id.sgtOlvideClave);
        sgtOlvideClave.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(OlvideMiClave.this, Ingresar.class);
                startActivity(intent);
                finish();
            }
        });
        getSupportActionBar().hide();

        volverOlvideClave = (Button)findViewById(R.id.volverOlvideClave);
        volverOlvideClave.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(OlvideMiClave.this, Ingresar.class);
                startActivity(intent);
                finish();
            }
        });
        getSupportActionBar().hide();

    }
}