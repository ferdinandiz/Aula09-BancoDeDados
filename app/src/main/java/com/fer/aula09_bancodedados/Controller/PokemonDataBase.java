package com.fer.aula09_bancodedados.Controller;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class PokemonDataBase extends SQLiteOpenHelper {

   private static final int versao = 1;
   private static final String nomeDB = "bd_pokemon";
   private static final String c_cod = "cod";
   private static final String c_nome = "nome";
   private static final String c_tipo = "tipo";
   private static final String c_numero = "numero";
   private static final String tb_pokemon = "pokedex";
   public static Context contexto;

   public PokemonDataBase(@Nullable Context context) {
      super(context, nomeDB, null, versao);
      contexto = context;
   }

   @Override
   public void onCreate(SQLiteDatabase sqLiteDatabase) {
      //CREATE TABLE pokemon (cod INTEGER PRIMARY KEY, ...)
      String query = "CREATE TABLE "+ tb_pokemon + "(" +
              c_cod + " INTEGER PRIMARY KEY, " +
              c_nome + " TEXT, " +
              c_tipo + " TEXT, " +
              c_numero + " TEXT)";
      sqLiteDatabase.execSQL(query);
   }

   @Override
   public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

   }
}
