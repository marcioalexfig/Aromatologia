package br.com.ma.android.arteesaude.activity;

import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import br.com.ma.android.arteesaude.R;
import br.com.ma.android.arteesaude.helper.TratamentoEventosMenu;
import br.com.ma.android.arteesaude.util.database.SQLiteGerenciadorFacade;

public class ValoresEmbalagensActivity extends AppCompatActivity {
    private ListView listaEmbanagens;
    private String[] embalagensDesc;

    private Toolbar mnToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_valores_embalagens);
        mnToolbar = (Toolbar) findViewById(R.id.toolbar);
        mnToolbar.setTitle("Aromatologia");
        setSupportActionBar( mnToolbar );

        try {
            this.embalagensDesc = retornaArrayDescricaoEmbalagens();
        }catch (Exception e){
            e.printStackTrace();
        }

        listaEmbanagens = (ListView) findViewById(R.id.listViewValoresEmbalagens);
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                embalagensDesc
        );

        listaEmbanagens.setAdapter( adaptador );
    }

    /**
     * Este método carrega o menu em uma activity
     * @param menu
     * @return
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    /**
     * Este trata o evento de menu e terorna a classe para onde o intent tem que ir
     * @param item
     * @return
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Class classe = (new TratamentoEventosMenu()).tratarEventos(item);
        Intent intent = new Intent(ValoresEmbalagensActivity.this, classe);
        startActivity(intent);
        //finish();
        return true;
    }

    public String[] retornaArrayDescricaoEmbalagens(){
        SQLiteDatabase banco = openOrCreateDatabase("aromatologia.db", Context.MODE_PRIVATE, null);
        SQLiteGerenciadorFacade sql = new SQLiteGerenciadorFacade(banco);

        List<String> arrayListStringEmbalagens = new ArrayList<>();
        arrayListStringEmbalagens = sql.retornaDescricaoEmbalagens();
        String[] array = arrayListStringEmbalagens.toArray(new String[0]);

        return array;
    }
}
