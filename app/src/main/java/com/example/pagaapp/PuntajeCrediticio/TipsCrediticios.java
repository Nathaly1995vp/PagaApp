package com.example.pagaapp.PuntajeCrediticio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.pagaapp.IngresoPassword.Menu;
import com.example.pagaapp.R;

public class TipsCrediticios extends AppCompatActivity {
Button volverTips;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips_crediticios);

        volverTips = (Button)findViewById(R.id.volverTips);
        volverTips.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(TipsCrediticios.this, PuntajeCrediticio.class);
                startActivity(intent);
                finish();
            }
        });
        getSupportActionBar().hide();
    }
}