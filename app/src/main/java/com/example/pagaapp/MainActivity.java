// Pantalla principal de ingreso redirige al login

package com.example.pagaapp;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import com.example.pagaapp.IngresoPassword.Ingresar;

public class MainActivity extends AppCompatActivity {
Button ingresoGeneral;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ingresoGeneral = (Button)findViewById(R.id.ingresoGeneral);
        ingresoGeneral.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, Ingresar.class);
                startActivity(intent);
                finish();
            }
        });
        getSupportActionBar().hide();
    }

}

