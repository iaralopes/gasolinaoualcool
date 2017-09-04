package com.example.iaralopes.gasolinaoualcool;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText valorAlcool;
    private EditText valorGasolina;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        valorAlcool = (EditText) findViewById(R.id.alcool);
        valorGasolina = (EditText) findViewById(R.id.gasolina);
    }

    public void verResultadoFinal (View view) {
        String melhor;

        if ((Double.parseDouble(valorAlcool.getText().toString()))/(Double.parseDouble(valorGasolina.getText().toString()))
                < 0.7) {
            melhor = "É melhor escolher o álcool!";
        }
        else {
            melhor = "Acho que essa é a vez da gasolina!";
        }

        Intent intent = new Intent(this, ResultadoFinalActivity.class);
        intent.putExtra("MELHOR", melhor);
        startActivity(intent);
    }
}
