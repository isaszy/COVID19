package com.corona.COVID19;

import android.content.ContentValues;
import android.content.Context;
import android.database.ContentObservable;
import android.database.sqlite.SQLiteDatabase;

public class DaoUser {

    private Conexao conexao;
    private SQLiteDatabase banco;


    public DaoUser(Context context){
        conexao  = new Conexao(context);
        banco = conexao.getWritableDatabase();
    }

    public long inserir(DadosUsuario user){
        ContentValues values = new ContentValues();
        values.put("Nome", user.getNome());
        values.put("Telefone", user.getTelefone());
        values.put("Idade", user.getIdade());
        values.put("N_SUS", user.getN_SUS());
        values.put("Diabete", user.getN_SUS());
        return banco.insert("DadosUsuario", null, values)
    }
}
