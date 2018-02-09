package com.example.meuapp.adivinhaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView id_Resultado;
    private int aa;
    private Button id_Botao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        id_Resultado = findViewById(R.id.id_Resultado);
        id_Botao =  findViewById(R.id.id_Botao);

        id_Botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    id_Resultado.setText("Botao funcionando");
            }
        });
    }
}
