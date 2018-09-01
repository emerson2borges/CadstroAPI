package com.e2borges.cadastroapi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void AcessarInserir(View view){
        Intent intent = new Intent(MainActivity.this, InserirActivity.class);
        startActivity(intent);
    }

    public void AcessarListar(View view){
        Intent intent = new Intent(MainActivity.this, ListarActivity.class);
        startActivity(intent);
    }

    public void AcessarBuscar(View view){
        Intent intent = new Intent(MainActivity.this, BuscarActivity.class);
        startActivity(intent);
    }

    public void AcessarEditar(View view){
        Intent intent = new Intent(MainActivity.this, EditarActivity.class);
        startActivity(intent);
    }

}
