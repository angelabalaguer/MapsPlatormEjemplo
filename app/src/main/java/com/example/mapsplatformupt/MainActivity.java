package com.example.mapsplatformupt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    int Llave;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void DosPuntos(View view) {
        startActivity(new Intent(MainActivity.this,RutaEntreDosPuntos.class));
    }

    public void geocode(View view) {
        startActivity(new Intent(MainActivity.this,MiGeocode.class));

    }
}
