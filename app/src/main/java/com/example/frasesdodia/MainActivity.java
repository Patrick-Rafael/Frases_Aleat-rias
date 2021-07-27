package com.example.frasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarFrase(View view){


        int numero = new Random().nextInt(4);

        String[] frases = {
                "A vida é uma montanha Russa, as vezes estamos no alto as vezes estamos em baixo.",
                "Nunca desista, o ideal é nem tentar",
                "Deixe pra amanha oque se pode deixar pra outro fazer.",
                "O que é, o que é, um ponto vermelho no plano verde, Uma rosa ",
        };

        TextView texto = findViewById(R.id.textFrase);
        texto.setText( frases[numero]);

    }
}