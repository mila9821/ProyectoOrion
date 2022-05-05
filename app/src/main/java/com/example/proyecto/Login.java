package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login extends AppCompatActivity {

    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login = findViewById(R.id.login);



    }

    public void login(View view) {
        Intent intent = new Intent(Login.this,ListaComida.class);
        startActivity(intent);
        finish();
    }

    public void crearCuenta(View view) {
        Intent intent = new Intent(Login.this,CrearCuenta.class);
        startActivity(intent);
        finish();

    }
    public void buscar(View view){
        Intent intent = new Intent(Login.this,view1.class);
        startActivity(intent);
        finish();

    }
}