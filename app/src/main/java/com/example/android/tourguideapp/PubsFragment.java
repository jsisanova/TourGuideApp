package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;

public class PubsFragment extends Fragment {

    public PubsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attractions_list, container, false);

        // Create a list of attractions
        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();

        attractions.add(new Attraction(getString(R.string.cricketers), getString(R.string.cricketers_description), getString(R.string.cricketers_opening_hours)));
        attractions.add(new Attraction(getString(R.string.lion_lobster), getString(R.string.lion_lobster_description), getString(R.string.lion_lobster_opening_hours)));
        attractions.add(new Attraction(getString(R.string.bath_arms), getString(R.string.bath_arms_description), getString(R.string.bath_arms_opening_hours)));
        attractions.add(new Attraction(getString(R.string.north_laine), getString(R.string.north_laine_description), getString(R.string.north_laine_opening_hours)));
        attractions.add(new Attraction(getString(R.string.beer_dispensary), getString(R.string.beer_dispensary_description), getString(R.string.beer_dispensary_opening_hours)));
        attractions.add(new Attraction(getString(R.string.fortune_of_war), getString(R.string.fortune_of_war_description), getString(R.string.fortune_of_war_opening_hours)));
        attractions.add(new Attraction(getString(R.string.fiddlers_elbow), getString(R.string.fiddlers_elbow_description), getString(R.string.fiddlers_elbow_opening_hours)));
        attractions.add(new Attraction(getString(R.string.black_dove), getString(R.string.black_dove_description), getString(R.string.black_dove_opening_hours)));
        attractions.add(new Attraction(getString(R.string.pump_house), getString(R.string.pump_house_description), getString(R.string.pump_house_opening_hours)));
        attractions.add(new Attraction(getString(R.string.brighton_rocks), getString(R.string.brighton_rocks_description), getString(R.string.brighton_rocks_opening_hours)));

        // Create an {@link AttractionAdapter}, whose data source is a list of {@link Attraction}s.
        AttractionAdapter adapter =  new AttractionAdapter(getActivity(), attractions, R.color.category_pubs, false);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Attraction} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }
}