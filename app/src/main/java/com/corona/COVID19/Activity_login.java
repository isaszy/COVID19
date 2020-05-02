package com.corona.COVID19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.Toast;

public class Activity_login extends AppCompatActivity {

    private String Nome = "Anderson";
    private String Senha = "123";

    private EditText nome;
    private EditText senha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void entrar(View view){

        nome = findViewById(R.id.edtUsuario);
        senha = findViewById(R.id.edtSenhalogin);


        if((Nome == nome.toString()) && (Senha == senha.toString())) {

            Toast.makeText(this, "Nome ou senha de usuário inválido", Toast.LENGTH_SHORT).show();

        }else{

            new Handler().postDelayed(new Runnable() {

                public void run() {
                    startActivity(new Intent(getBaseContext(), Activity_scanner.class));
                    finish();
                }
            }, 1000);

        }
    }

    public void cadastrar(View view){
        new Handler().postDelayed(new Runnable() {

            public void run() {
                startActivity(new Intent(getBaseContext(), Activity_cadastro.class));
            }
        }, 100);
    }

}
