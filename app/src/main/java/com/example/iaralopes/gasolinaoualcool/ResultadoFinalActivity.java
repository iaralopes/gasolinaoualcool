package com.example.iaralopes.gasolinaoualcool;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultadoFinalActivity extends AppCompatActivity {

    private TextView textVencedor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado_final);

        textVencedor = (TextView) findViewById(R.id.vencedor);

        Bundle bundle = getIntent().getExtras();
        String vencedor = bundle.getString("MELHOR");

        mostrarVencedor(vencedor);
    }
    public void mostrarVencedor (String vencedor) {
        textVencedor.setText(vencedor);
    }


}
