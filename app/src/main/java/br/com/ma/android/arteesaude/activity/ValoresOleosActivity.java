package br.com.ma.android.arteesaude.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import br.com.ma.android.arteesaude.R;
import br.com.ma.android.arteesaude.helper.TratamentoEventosMenu;

public class ValoresOleosActivity extends AppCompatActivity {


    private Toolbar mnToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_valores_oleos);
        mnToolbar = (Toolbar) findViewById(R.id.toolbar);
        mnToolbar.setTitle("Aromatologia");
        setSupportActionBar( mnToolbar );
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
        Intent intent = new Intent(ValoresOleosActivity.this, classe);
        startActivity(intent);
        finish();
        return true;
    }
}
