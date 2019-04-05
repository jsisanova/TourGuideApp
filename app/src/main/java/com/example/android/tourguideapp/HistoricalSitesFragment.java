package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
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
//        View secondView = inflater.inflate(R.layout.list_item, container, false);

        // Create a list of attractions
        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();

        attractions.add(new Attraction(R.drawable.brighton_pier, "Brighton Pier", "Opened: May 1899"));
        attractions.add(new Attraction(R.drawable.clock, "Jubilee Clock Tower", " Built in 1888"));
        attractions.add(new Attraction(R.drawable.museum, "Brighton Fishing Museum", "Opened: 1992"));
        attractions.add(new Attraction(R.drawable.west_pier, "West Pier", "Opened: October 6, 1866"));
        attractions.add(new Attraction(R.drawable.wheel, "Brighton Wheel", "Closed: May 8, 2016"));
        attractions.add(new Attraction(R.drawable.royal_pavilion, "Royal Pavilion", "Construction started: 1786"));
        attractions.add(new Attraction(R.drawable.church, "St. Bartholomew's Church", "Opened: 1874"));
        attractions.add(new Attraction(R.drawable.railway, "Volk's Electric Railway", "Opened: 1883"));

        // Create a {@link AttractionAdapter}, whose data source is a list of {@link Attraction}s. The
        // adapter knows how to create list items for each item in the list.
        AttractionAdapter adapter =  new AttractionAdapter(getActivity(), attractions, R.color.category_events, false);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);


        // Make the {@link ListView} use the {@link AttractionAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Attraction} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }
}