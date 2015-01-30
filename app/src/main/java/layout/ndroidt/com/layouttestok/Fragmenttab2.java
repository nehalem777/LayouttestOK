package layout.ndroidt.com.layouttestok;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import layout.ndroidt.com.layouttestok.R;


/**
 * Created by N_D on 1/11/2015.
 */
public class Fragmenttab2 extends Fragment {
    TextView b_received;
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.i("Fragment Chk", "Fragmenttab2");
        View rootview = inflater.inflate(R.layout.fragment_tab2,container,false);

        b_received = (TextView)rootview.findViewById(R.id.b_received);
        String myTag = getTag();

        ((MainActivity)getActivity()).setTabFragmentB(myTag);

        Toast.makeText(getActivity(),
                "MyFragmentB.onCreateView(): " + myTag,
                Toast.LENGTH_LONG).show();


        return rootview;
    }

    public void b_updateText(String t){
        b_received.setText(t);
    }
}
