package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;

public class HistoricalSitesFragment extends Fragment {

    public HistoricalSitesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attractions_list, container, false);

        // Create a list of attractions
        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();

        attractions.add(new Attraction(R.drawable.brighton_pier, getString(R.string.brighton_pier), getString(R.string.brighton_pier_description)));
        attractions.add(new Attraction(R.drawable.clock, getString(R.string.jubilee_clock_tower), getString(R.string.jubilee_clock_tower_description)));
        attractions.add(new Attraction(R.drawable.museum, getString(R.string.fishing_museum), getString(R.string.fishing_museum_description)));
        attractions.add(new Attraction(R.drawable.west_pier, getString(R.string.west_pier), getString(R.string.west_pier_description)));
        attractions.add(new Attraction(R.drawable.wheel, getString(R.string.brighton_wheel), getString(R.string.brighton_wheel_description)));
        attractions.add(new Attraction(R.drawable.royal_pavilion, getString(R.string.royal_pavilion), getString(R.string.royal_pavilion_description)));
        attractions.add(new Attraction(R.drawable.church, getString(R.string.church), getString(R.string.church_description)));
        attractions.add(new Attraction(R.drawable.railway, getString(R.string.railway), getString(R.string.railway_description)));

        // Create a {@link AttractionAdapter}, whose data source is a list of {@link Attraction}s.
        AttractionAdapter adapter =  new AttractionAdapter(getActivity(), attractions, R.color.category_events, false);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link AttractionAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Attraction} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }
}