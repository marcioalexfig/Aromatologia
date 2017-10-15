package br.com.ma.android.arteesaude.activity;


import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import br.com.ma.android.arteesaude.R;
import br.com.ma.android.arteesaude.adapter.TabAdapter;
import br.com.ma.android.arteesaude.fragment.BaseFragment;
import br.com.ma.android.arteesaude.fragment.EmbalagemFragment;
import br.com.ma.android.arteesaude.fragment.OleoEssencialFragment;
import br.com.ma.android.arteesaude.helper.SlidingTabLayout;
import br.com.ma.android.arteesaude.helper.TratamentoEventosMenu;
import br.com.ma.android.arteesaude.util.database.SQLiteManutencao;

public class MainActivity extends AppCompatActivity {

    private Toolbar mnToolbar;
    private SlidingTabLayout slidingTabLayout;
    private ViewPager viewPager;

    //instancia do fragment
    OleoEssencialFragment oleos = new OleoEssencialFragment();
    BaseFragment base = new BaseFragment();
    EmbalagemFragment embalagem = new EmbalagemFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mnToolbar = (Toolbar) findViewById(R.id.toolbar);
        //mnToolbar.setLogo(R.drawable.logo);
        mnToolbar.setTitle("Aromatologia");
        setSupportActionBar( mnToolbar );

        slidingTabLayout = (SlidingTabLayout) findViewById(R.id.tab_menu);
        viewPager = (ViewPager) findViewById(R.id.view_pager_conteudo);

        //configurando adapter pra carregar os fragmentos para a view pager
        TabAdapter tabAdapter = new TabAdapter(getSupportFragmentManager());
        viewPager.setAdapter( tabAdapter );

        //adicionando a view pager
        slidingTabLayout.setViewPager(viewPager);

        //configurando o slid tab para ocupar o espaço do layout
        slidingTabLayout.setDistributeEvenly(true);

        //configurando cor do indicador de seleção de tab
        slidingTabLayout.setSelectedIndicatorColors(ContextCompat.getColor(this, R.color.colorPrimaryDark));

        //teste e carga de base de dados - manter comentado
        //manutencaoBaseDeDados();



    }

    /**
     * Método para ser executado apenas para manter dados na base interna do app
     */
    private void manutencaoBaseDeDados() {
        SQLiteDatabase banco = openOrCreateDatabase("aromatologia.db", Context.MODE_PRIVATE, null);
        SQLiteManutencao sql = new SQLiteManutencao(banco);
        sql.executar();
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
        Intent intent = new Intent(MainActivity.this, classe);
        startActivity(intent);
        finish();
        return true;
    }


}
