package com.example.exercicio16;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class LoginErradoActivity extends AppCompatActivity {

    Button txt_voltar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_errado);

        Toast.makeText(this, "Clique em voltar", Toast.LENGTH_SHORT).show();

        txt_voltar = findViewById(R.id.txt_voltar);

        txt_voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}