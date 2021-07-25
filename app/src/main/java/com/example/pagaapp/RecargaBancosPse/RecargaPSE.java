package com.example.pagaapp.RecargaBancosPse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.pagaapp.IngresoPassword.Menu;
import com.example.pagaapp.R;

public class RecargaPSE extends AppCompatActivity {
Button volverOtros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recarga_p_s_e);

        volverOtros = (Button)findViewById(R.id.volverOtros);
        volverOtros.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(RecargaPSE.this, Menu.class);
                startActivity(intent);
                finish();
            }
        });
        getSupportActionBar().hide();
    }
}