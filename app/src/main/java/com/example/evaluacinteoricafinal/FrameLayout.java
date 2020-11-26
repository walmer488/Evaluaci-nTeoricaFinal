package com.example.evaluacinteoricafinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class FrameLayout extends AppCompatActivity {

    ImageView iv1;
    Button boton1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_layout);
        setTitle("FrameLayout");
        iv1 = findViewById(R.id.imageView);
        boton1 = findViewById(R.id.buttonocultar);

        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ocultar(view);
            }
        });
    }

    public  void ocultar (View view){
        boton1.setVisibility(View.INVISIBLE);
        iv1.setVisibility(View.VISIBLE);
    }
}