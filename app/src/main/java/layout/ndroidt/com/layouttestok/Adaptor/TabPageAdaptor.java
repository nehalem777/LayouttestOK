package layout.ndroidt.com.layouttestok.Adaptor;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;

import layout.ndroidt.com.layouttestok.Fragmenttab1;
import layout.ndroidt.com.layouttestok.Fragmenttab2;
import layout.ndroidt.com.layouttestok.Fragmenttab3;

/**
 * Created by N_D on 1/11/2015.
 */
public class TabPageAdaptor extends FragmentPagerAdapter {
    //กำหนดค่าจำนวน tab
    private static final int NumberfoTab = 3;

    public TabPageAdaptor(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        switch (i){
            case 0 :
                Log.i("pageer","1");
                return new Fragmenttab1();
            case 1 :
                Log.i("pager","2");
                return new Fragmenttab2();
            case 2 :
                Log.i("pager","3");
                return new Fragmenttab3();
        }
        return null;
    }

    @Override
    public int getCount() {
        return NumberfoTab;
    }
}
