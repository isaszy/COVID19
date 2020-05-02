package com.corona.COVID19;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class Conexao extends SQLiteOpenHelper {

    private static final String banco = "bancoUser";
    private static final int version = 1;


    public Conexao(@Nullable Context context) {
        super(context, banco, null, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE DadosUsuario(id integer primary key autoincrement," +
                "nome varchar(70)," +
                "Telefone varchar(12)," +
                "Idade varchar(3)," +
                "N_SUS varchar(25)," +
                "Diabete varchar(3)," +
                "Senha varchar(20))");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
