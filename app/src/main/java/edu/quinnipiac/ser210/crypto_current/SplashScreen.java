package edu.quinnipiac.ser210.crypto_current;


import android.net.Uri;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import edu.quinnipiac.ser210.crypto_current.dummy.DummyContent;

public class SplashScreen extends AppCompatActivity implements CoinRankFragment.OnListFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);


        CoinRankFragment mFragment = new CoinRankFragment();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.add(R.id.splashFragmentContainer, mFragment).commit();
    }


    public void onFragmentInteraction(Uri uri) {

    }

    @Override
    public void onListFragmentInteraction(DummyContent.DummyItem item) {

    }
}
