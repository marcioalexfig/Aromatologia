package br.com.ma.android.arteesaude.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import br.com.ma.android.arteesaude.fragment.BaseFragment;
import br.com.ma.android.arteesaude.fragment.EmbalagemFragment;
import br.com.ma.android.arteesaude.fragment.OleoEssencialFragment;

/**
 * Created by alex on 05/10/17.
 */

public class TabAdapter extends FragmentStatePagerAdapter {


        private String[] tituloAbas = {"BASES", "ÓLEOS ESSENCIAIS", "EMBALAGENS"};

    public TabAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragmento = null;
        switch (position){
            case 0 :
                fragmento = new BaseFragment();
                break;
            case 1 :
                fragmento = new OleoEssencialFragment();
                break;
            case 2 :
                fragmento = new EmbalagemFragment();
                break;

        }
        return fragmento;
    }

    @Override
    public int getCount() {
        return tituloAbas.length;
    }
    @Override
    public CharSequence getPageTitle(int position){
        return tituloAbas[position];
    }
}
