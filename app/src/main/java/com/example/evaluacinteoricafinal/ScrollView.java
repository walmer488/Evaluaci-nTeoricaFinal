package com.example.evaluacinteoricafinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ScrollView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll_view);

        setTitle("ScrollView");
    }

    public void Seleccion(View view){
        switch (view.getId()){

            case R.id.bananas:
                Toast.makeText(this, "Estas son bananas", Toast.LENGTH_SHORT).show();
                break;
                //
            case R.id.cerezas:
                Toast.makeText(this, "Estas son cerezas", Toast.LENGTH_SHORT).show();
                break;
                //
            case R.id.frambuesas:
                Toast.makeText(this, "Estas son frambuesas", Toast.LENGTH_SHORT).show();
                break;
                //
            case R.id.fresas:
                Toast.makeText(this, "Estas son fresas", Toast.LENGTH_SHORT).show();
                break;
                //
            case R.id.kiwis:
                Toast.makeText(this, "Estos son kiwis", Toast.LENGTH_SHORT).show();
                break;
                //
            case R.id.mangos:
                Toast.makeText(this, "Estos son mangos", Toast.LENGTH_SHORT).show();
                break;
                //
            case R.id.manzanas:
                Toast.makeText(this, "Estas son manzanas", Toast.LENGTH_SHORT).show();
                break;
                //
            case R.id.melon:
                Toast.makeText(this, "Estos son melon", Toast.LENGTH_SHORT).show();
                break;
                //
            case R.id.naranjas:
                Toast.makeText(this, "Estas son naranjas", Toast.LENGTH_SHORT).show();
                break;
                //
            case R.id.pera:
                Toast.makeText(this, "Estas son pera", Toast.LENGTH_SHORT).show();
                break;
                //
            case R.id.sandia:
                Toast.makeText(this, "Estas son sandia", Toast.LENGTH_SHORT).show();
                break;
                //
            case R.id.uvas:
                Toast.makeText(this, "Estas son uvas", Toast.LENGTH_SHORT).show();
                break;
                //
            case R.id.zarzamoras:
                Toast.makeText(this, "Estas son zarzamoras", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}