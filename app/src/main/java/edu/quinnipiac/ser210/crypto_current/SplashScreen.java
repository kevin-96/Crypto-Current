package edu.quinnipiac.ser210.crypto_current;


import android.net.Uri;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity implements SplashScreenFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);


        SplashScreenFragment mFragment = new SplashScreenFragment();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.add(R.id.splashFragmentContainer, mFragment).commit();
    }

    @Override
    public void onFragmentInteraction(Uri uri) {
        
    }
}
