package edu.quinnipiac.ser210.crypto_current;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


/**
 * A simple {@link Fragment} subclass.
 */
public class SingleConversionFragment extends Fragment {


    public SingleConversionFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View layout = inflater.inflate(R.layout.fragment_single_conversion, container, false);

        String[] coinSpinnerValues = new String[] {"BTC", "EUR"};
        Spinner coinSpinner = (Spinner) layout.findViewById(R.id.coinChooseSpinner);
        ArrayAdapter<String> coinAdapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_spinner_item, coinSpinnerValues);
        coinAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        coinSpinner.setAdapter(coinAdapter);

        String[] currencySpinnerValues = new String[] {"AUD", "USD", "CAD"};
        Spinner currencySpinner = (Spinner) layout.findViewById(R.id.currencyChooseSpinner);
        ArrayAdapter<String> currencyAdapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_spinner_item, currencySpinnerValues);
        currencyAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        currencySpinner.setAdapter(currencyAdapter);

        return layout;
    }

}
