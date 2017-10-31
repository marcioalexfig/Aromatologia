package br.com.ma.android.arteesaude.helper;

import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;

import br.com.ma.android.arteesaude.R;
import br.com.ma.android.arteesaude.activity.MainActivity;
import br.com.ma.android.arteesaude.activity.ValoresBasesActivity;
import br.com.ma.android.arteesaude.activity.ValoresEmbalagensActivity;
import br.com.ma.android.arteesaude.activity.ValoresOleosActivity;

/**
 * Created by alex on 14/10/17.
 */

public class TratamentoEventosMenu  extends AppCompatActivity {
    /***
     * Método recebe a instancia da Activity que está chamando e o item de menu para ser tratado
     * @param item
     * @return
     */
    public Class tratarEventos(MenuItem item){
        Class classe = MainActivity.class;
        try {
            switch (item.getItemId()) {

                case R.id.item_cadastrar_valores_oleos:
                    classe = ValoresOleosActivity.class;
                    break;

                case R.id.item_cadastrar_valores_bases:
                    classe = ValoresBasesActivity.class;
                    break;

                case R.id.item_cadastrar_valores_embalagens:
                    classe = ValoresEmbalagensActivity.class;
                    break;

                case R.id.item_sair:
                    sair();
                    break;

                default:
                    break;
            }
        }catch (Exception e ){
            Log.e("ERRO: ",e.getLocalizedMessage());
        }
        return classe;
    }

    private void sair(){
        //autenticacao = FireBaseConfiguracoes.autenticacaoFirebase();
        //autenticacao.signOut();
        //abrirTelaLogin();
    }

}
