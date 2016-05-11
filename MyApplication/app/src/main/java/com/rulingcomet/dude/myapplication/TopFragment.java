package com.rulingcomet.dude.myapplication;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Spinner;

/**
 * Created by Dude on 5/10/2016.
 */
public class TopFragment extends Fragment {

    private FlightSearcher interfaceImplementor;

     public interface FlightSearcher {
         public void searchForFlights(String Origin, String Destination );
     }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.interfaceImplementor = (FlightSearcher)Context();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_top, container, false);


    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Button flightSearchButton = (Button) getActivity().findViewById(R.id.button);
        flightSearchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Spinner originSpinner = (Spinner)getActivity().findViewById(R.id.spinnerOrigins);
                Spinner destinationSpinner = (Spinner)getActivity().findViewById(R.id.spinnerDestinations);
                interfaceImplementor.searchForFlights(originSpinner.getSelectedItem().toString(), destinationSpinner.getSelectedItem().toString());

            }
        });

        super.onActivityCreated(savedInstanceState);
    }
}
