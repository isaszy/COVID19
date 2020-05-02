package com.corona.COVID19;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.Toast;

public class Activity_cadastro extends AppCompatActivity {

    private EditText nome;
    private EditText telefone;
    private EditText idade;
    private EditText n_SUS;
    private EditText diabete;
    private EditText senha;

    private DaoUser dao;



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

        dao = new DaoUser(this);

    }

    public void salvar(View view){
        DadosUsuario user = new DadosUsuario();

        user.setNome(nome.getText().toString());
        user.setTelefone(telefone.getText().toString());
        user.setIdade(idade.getText().toString());
        user.setN_SUS(n_SUS.getText().toString());
        user.setDiabete(diabete.getText().toString());
        long id = dao.inserir(user);
        Toast.makeText(this, "Usuário cadastrado com o id: " + id, Toast.LENGTH_SHORT).show();

    }
}
