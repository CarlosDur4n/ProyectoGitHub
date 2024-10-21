package com.example.actividads7;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText usuario, password;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usuario = findViewById(R.id.txtUsuario);
        password = findViewById(R.id.txtPassword);
        btn = findViewById(R.id.btnEnviar);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ValidaLogin(usuario.getText().toString(),password.getText().toString());
            }
        });
    }

    public void ValidaLogin(String usuario, String password) {
        if (usuario.equals("admin") && password.equals("admin")) {
            Intent inicio = new Intent(this, com.example.actividads7.Inicio.class);
            inicio.putExtra("usuario", "");
        } else {
            Toast.makeText(this, "Usuario o contraseña invalidos", Toast.LENGTH_SHORT).show();
        }
    }
}