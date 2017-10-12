package br.com.ma.android.arteesaude.util.database;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import br.com.ma.android.arteesaude.modelo.Base;
import br.com.ma.android.arteesaude.modelo.Embalagem;
import br.com.ma.android.arteesaude.modelo.Oleo;

/**
 * Created by alex on 12/10/17.
 */

public class SQLiteManutencao {

    private SQLiteDatabase banco = null;

    public SQLiteManutencao(SQLiteDatabase banco){
        this.banco = banco;
    }

    public void criarBanco(){
        //SQLiteDatabase banco = SQLiteDatabase.openOrCreateDatabase(NOME_BANCO, MODE, null);
    }

    public void criarTabelas(){
        //SQLiteDatabase banco = SQLiteDatabase.openOrCreateDatabase(NOME_BANCO, MODE, null);

        banco.execSQL("CREATE TABLE IF NOT EXISTS oleos (id INTEGER PRIMARY KEY autoincrement, desc TEXT, volume INTEGER, valor REAL)");
        banco.execSQL("CREATE TABLE IF NOT EXISTS embalagens (id INTEGER PRIMARY KEY autoincrement, desc TEXT, volume INTEGER, valor REAL)");
        banco.execSQL("CREATE TABLE IF NOT EXISTS bases (id INTEGER PRIMARY KEY autoincrement, desc TEXT, volume INTEGER, valor REAL)");
    }

    public void deletarTabelas(){
        //SQLiteDatabase banco = SQLiteDatabase.openOrCreateDatabase(NOME_BANCO, MODE, null);

        banco.execSQL("DROP TABLE IF EXISTS oleos");
        banco.execSQL("DROP TABLE IF EXISTS embalagens");
        banco.execSQL("DROP TABLE IF EXISTS bases");
    }

    public void carregarTabelas(){
        //SQLiteDatabase banco = SQLiteDatabase.openOrCreateDatabase(NOME_BANCO, MODE, null);

        banco.execSQL("INSERT INTO oleos (desc, volume, valor) VALUES ('Limão (Essencial)', 5, 20)");
        banco.execSQL("INSERT INTO embalagens (desc, volume, valor) VALUES ('Vidro conta gotas', 20, 2)");
        banco.execSQL("INSERT INTO bases (desc, volume, valor) VALUES ('argila', 500, 12)");

    }

    public void limparTabelas(){
        //SQLiteDatabase banco = SQLiteDatabase.openOrCreateDatabase(NOME_BANCO, MODE, null);
        banco.execSQL("DELETE FROM oleos");
        banco.execSQL("DELETE FROM embalagens");
        banco.execSQL("DELETE FROM bases");
    }


    public void imprimeDados(){
        //SQLiteDatabase banco = SQLiteDatabase.openOrCreateDatabase(NOME_BANCO, MODE, null);

        Cursor cursor = null;

        // OLEOS ------------------------
        cursor = banco.rawQuery("SELECT id, desc, volume, valor FROM oleos", null);
        int indiceColunaIdOL = cursor.getColumnIndex("id");
        int indiceColunaDescOL = cursor.getColumnIndex("desc");
        int indiceColunaVolumeOL = cursor.getColumnIndex("volume");
        int indiceColunaValorOL = cursor.getColumnIndex("valor");


        List<Oleo> oleos = new ArrayList<>();
        if (cursor!=null) {
            if (cursor.moveToFirst()){
                do {
                    Oleo oleo = new Oleo(
                            cursor.getInt(indiceColunaIdOL),
                            cursor.getString(indiceColunaDescOL),
                            cursor.getInt(indiceColunaVolumeOL),
                            cursor.getFloat(indiceColunaValorOL)
                    );
                    oleos.add(oleo);
                } while (cursor.moveToNext());
            }
        }
        Log.i("OLEOS ########################",oleos.toString());


        //EMBALAGENS -------------------
        cursor = banco.rawQuery("SELECT id, desc, volume, valor FROM embalagens", null);
        int indiceColunaIdEM = cursor.getColumnIndex("id");
        int indiceColunaDescEM = cursor.getColumnIndex("desc");
        int indiceColunaVolumeEM = cursor.getColumnIndex("volume");
        int indiceColunaValorEM = cursor.getColumnIndex("valor");


        List<Embalagem> embalagens = new ArrayList<>();
        if (cursor!=null) {
            if (cursor.moveToFirst()){
                do {
                    Embalagem embalagem = new Embalagem(
                            cursor.getInt(indiceColunaIdEM),
                            cursor.getString(indiceColunaDescEM),
                            cursor.getInt(indiceColunaVolumeEM),
                            cursor.getFloat(indiceColunaValorEM)
                    );
                    embalagens.add(embalagem);
                } while (cursor.moveToNext());
            }
        }

        Log.i("EMBALAGENS ########################",embalagens.toString());

        //BASES ------------------
        cursor = banco.rawQuery("SELECT id, desc, volume, valor FROM bases", null);
        int indiceColunaIdBA = cursor.getColumnIndex("id");
        int indiceColunaDescBA = cursor.getColumnIndex("desc");
        int indiceColunaVolumeBA = cursor.getColumnIndex("volume");
        int indiceColunaValorBA = cursor.getColumnIndex("valor");

        List<Base> bases = new ArrayList<>();
        if (cursor!=null) {
            if (cursor.moveToFirst()){
                do {
                    Base base = new Base(
                            cursor.getInt(indiceColunaIdBA),
                            cursor.getString(indiceColunaDescBA),
                            cursor.getInt(indiceColunaVolumeBA),
                            cursor.getFloat(indiceColunaValorBA)
                    );
                    bases.add(base);
                } while (cursor.moveToNext());
            }
        }

        Log.i("BASES ########################",bases.toString());

    }


    public void executar() {
        new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        try {
                            //sql.deletarTabelas();
                            //criarTabelas();
                            //sql.limparTabelas();
                            //carregarTabelas();
                            imprimeDados();
                        }catch (Exception e){
                            e.printStackTrace();
                        }
                    }
                }

        ).run();
    }
}
