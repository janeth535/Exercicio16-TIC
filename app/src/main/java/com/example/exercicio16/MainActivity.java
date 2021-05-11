package com.example.exercicio16;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txt_usern, txt_passw;
    Button txt_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_usern = findViewById(R.id.txt_username);
        txt_passw = findViewById(R.id.txt_password);
        txt_btn = findViewById(R.id.txt_entrar);

        txt_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = txt_usern.getText().toString();
                String password = txt_passw.getText().toString();

                if (username.equals("user") && password.equals("pass")){
                    Intent i = new Intent(MainActivity.this,LoginOkActivity.class);
                    startActivity(i);
                }
                else{
                    Toast.makeText(MainActivity.this, "Login Errado", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(MainActivity.this,LoginErradoActivity.class);
                    startActivity(i);
                }

            }
        });
    }
}