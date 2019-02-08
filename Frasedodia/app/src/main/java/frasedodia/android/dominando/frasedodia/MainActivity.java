package frasedodia.android.dominando.frasedodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView textoNovaFrase;
    private Button botaoNovaFrase;

    private String[] frases = {"Pense sempre antes de tomar uma decisão",
                               "A grama do vizinho até pode ser mais verde, mas as vezes é mais caro pra manter",
                               "Ou você já foi enganado, ou está sendo ou um dia será"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textoNovaFrase = findViewById(R.id.textoNovaFraseId);
        botaoNovaFrase = findViewById(R.id.botaoNovaFraseId);

        botaoNovaFrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomico = new Random();
                int numeroaleatorio = randomico.nextInt( frases.length );
                textoNovaFrase.setText(frases[numeroaleatorio]);
            }
        });
    }
}
