package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ListaComida extends AppCompatActivity {
    ImageButton Embu, carne, fruta, lacteo, abarrote, gaseosa, licor, limpiezas, personal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_comida);

        Embu=findViewById(R.id.car1);
        carne=findViewById(R.id.car2);
        fruta=findViewById(R.id.car3);
        lacteo=findViewById(R.id.car4);
        abarrote=findViewById(R.id.car5);
        gaseosa=findViewById(R.id.car6);
        licor=findViewById(R.id.car7);
        limpiezas=findViewById(R.id.car8);
        personal=findViewById(R.id.car9);
    }


    public void embutido(View view) {
        Intent intent = new Intent(ListaComida.this, Embutidos.class);
        startActivity(intent);
        finish();
    }

    public void carne(View view){
        Intent intent = new Intent(ListaComida.this,Carnes.class);
        startActivity(intent);
        finish();
    }

    public void fruta(View view){
        Intent intent = new Intent(ListaComida.this,Fruta.class);
        startActivity(intent);
        finish();
    }
    public void lacteos(View view){
        Intent intent = new Intent(ListaComida.this,Lacteo.class);
        startActivity(intent);
        finish();
    }
    public void abarrotes(View view){
        Intent intent = new Intent(ListaComida.this,Abarrote.class);
        startActivity(intent);
        finish();
    }
    public void gaseosa(View view){
        Intent intent = new Intent(ListaComida.this,Gaseosa.class);
        startActivity(intent);
        finish();
    }
    public void licores(View view){
        Intent intent = new Intent(ListaComida.this,Licor.class);
        startActivity(intent);
        finish();
    }
    public void limpieza(View view){
        Intent intent = new Intent(ListaComida.this,Limpieza.class);
        startActivity(intent);
        finish();
    }
    public void cuidado(View view){
        Intent intent = new Intent(ListaComida.this,CuidadoPersonal.class);
        startActivity(intent);
        finish();
    }
}