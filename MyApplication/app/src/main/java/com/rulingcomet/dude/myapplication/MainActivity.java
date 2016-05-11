package com.rulingcomet.dude.myapplication;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends Activity implements TopFragment.FlightSearcher  {

    @Override
    public void searchForFlights(String Origin, String Destination) {
        BottomFragment bottomFragment = (BottomFragment) getFragmentManager().findFragmentById(R.id.bottomfragment);
        int resultPrice = (int)(Math.random()*200);
        String resultString = Origin + '-' + Destination + '=' +resultPrice;
        bottomFragment.displayFlightQueryResults(resultString);


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

