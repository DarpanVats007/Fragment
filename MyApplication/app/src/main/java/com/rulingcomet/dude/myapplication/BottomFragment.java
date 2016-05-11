package com.rulingcomet.dude.myapplication;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

/**
 * Created by Dude on 5/10/2016.
 */
public class BottomFragment extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    public void displayFlightQueryResults(String result){

        EditText resultField = (EditText)getActivity().findViewById(R.id.FlightQueryResult);
        resultField.setText(result);
    }

}
