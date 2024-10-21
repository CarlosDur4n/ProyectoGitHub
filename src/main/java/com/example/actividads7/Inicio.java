package com.example.actividads7;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Inicio extends AppCompatActivity {
    TextView Titulo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Titulo = findViewById(R.id.txtView);
        Intent inicio = getIntent();
        String usuario = inicio.getStringExtra("Usuario");
        Titulo.setText("Bienvenido: " + usuario);
    }
}
