package br.com.ma.android.arteesaude.activity;

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
        mnToolbar.setTitle("Aromatologia Arte e Saúde");
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




    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {

            case R.id.item_sair:
                sair();
                break;
            default:
                break;
        }
        return super.onOptionsItemSelected(item);

    }

    public void sair(){
        //autenticacao = FireBaseConfiguracoes.autenticacaoFirebase();
        //autenticacao.signOut();
        //abrirTelaLogin();
    }
}
