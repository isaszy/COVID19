package com.corona.COVID19;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Activity_cadastro extends AppCompatActivity {

    private EditText nome;
    private EditText telefone;
    private EditText idade;
    private EditText n_SUS;
    private EditText diabete;
    private EditText senha;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        nome = findViewById(R.id.edtNome);
        telefone = findViewById(R.id.edtTelefone);
        idade = findViewById(R.id.edtIdade);
        n_SUS = findViewById(R.id.edtSUS);
        diabete = findViewById(R.id.edtDiabete);
        senha = findViewById(R.id.edtSenha);

    }

    public void salvar(View view){
        DadosUsuario user = new DadosUsuario();

        user.setNome(nome.getText().toString());
        user.setTelefone(telefone.getText().toString());
        user.setIdade(idade.getText().toString());
        user.setN_SUS(n_SUS.getText().toString());
        user.setDiabete(diabete.getText().toString());

    }
}
