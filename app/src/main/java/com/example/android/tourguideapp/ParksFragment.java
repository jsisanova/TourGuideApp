package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import java.util.ArrayList;

public class ParksFragment extends Fragment {

    public ParksFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.attractions_list, container, false);

        // Create a list of attractions
        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();

        attractions.add(new Attraction(R.drawable.preston_park, "Preston Park"));
        attractions.add(new Attraction(R.drawable.blakers_park, "Blakers Park"));
        attractions.add(new Attraction(R.drawable.east_brighton_park, "East Brighton Park"));
        attractions.add(new Attraction(R.drawable.withdean_park, "Withdean Park"));
        attractions.add(new Attraction(R.drawable.steine_gardens, "Steine Gardens"));
        attractions.add(new Attraction(R.drawable.carden_park, "Carden Park"));
        attractions.add(new Attraction(R.drawable.queens_park, "Queens Park"));

        // Create an {@link AttractionAdapter}, whose data source is a list of {@link Attraction}s. The
        // adapter knows how to create list items for each item in the list.
        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions, R.color.category_parks, false);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_listyout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Attraction} in the list.
        listView.setAdapter(adapter);

        Button stopButton = (Button) rootView.findViewById(R.id.stop_button);
        stopButton.setVisibility(View.INVISIBLE);

        return rootView;
    }
}