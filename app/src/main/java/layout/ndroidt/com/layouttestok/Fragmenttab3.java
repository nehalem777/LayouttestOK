package layout.ndroidt.com.layouttestok;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import layout.ndroidt.com.layouttestok.R;

/**
 * Created by N_D on 1/11/2015.
 */
public class Fragmenttab3 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.i("Fragment Chk", "Fragmenttab3");
        View rootview = inflater.inflate(R.layout.fragment_tab3,container,false);
        return rootview;
    }
}
