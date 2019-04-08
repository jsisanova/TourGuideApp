package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

        attractions.add(new Attraction(R.drawable.preston_park, getString(R.string.preston_park)));
        attractions.add(new Attraction(R.drawable.blakers_park, getString(R.string.blakers_park)));
        attractions.add(new Attraction(R.drawable.east_brighton_park, getString(R.string.east_brighton_park)));
        attractions.add(new Attraction(R.drawable.withdean_park, getString(R.string.withdean_park)));
        attractions.add(new Attraction(R.drawable.steine_gardens, getString(R.string.steine_gardens)));
        attractions.add(new Attraction(R.drawable.carden_park, getString(R.string.carden_park)));
        attractions.add(new Attraction(R.drawable.queens_park, getString(R.string.queens_park)));

        // Create an {@link AttractionAdapter}, whose data source is a list of {@link Attraction}s.
        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions, R.color.category_parks, false);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Attraction} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }
}