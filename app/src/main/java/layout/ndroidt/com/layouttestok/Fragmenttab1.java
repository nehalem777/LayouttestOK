package layout.ndroidt.com.layouttestok;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
/**
 * Created by N_D on 1/11/2015.
 */
public class Fragmenttab1 extends Fragment {
    EditText A_input;
    Button A_enter, btn_clr;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.i("Fragment Chk", "Fragmenttab1");
        View rootview = inflater.inflate(R.layout.fragment_tab1, container, false);

        //bind wiget
        A_input = (EditText) rootview.findViewById(R.id.a_input);
        A_enter = (Button) rootview.findViewById(R.id.a_enter);

        btn_clr = (Button) rootview.findViewById(R.id.button_clr);
        btn_clr.setEnabled(false);
        btn_clr.setOnClickListener(ClearText);

        A_enter.setOnClickListener(A_enterOnClickListener);
        return rootview;
    }

    View.OnClickListener ClearText = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            A_input.setText("");
        }
    };
    View.OnClickListener A_enterOnClickListener
            = new View.OnClickListener() {

        @Override
        public void onClick(View arg0) {

            String textPassToB = A_input.getText().toString();

            String TabOfFragmentB = ((MainActivity) getActivity()).getTabFragmentB();

            Fragmenttab2 fragmentB = (Fragmenttab2) getActivity()
                    .getSupportFragmentManager()
                    .findFragmentByTag(TabOfFragmentB);

            fragmentB.b_updateText(textPassToB);

            Toast.makeText(getActivity(),
                    "text sent to Fragment tab2:\n " + textPassToB,
                    Toast.LENGTH_LONG).show();
        }
    };

}
