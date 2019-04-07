package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
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

        attractions.add(new Attraction("The Cricketers", "Black Lion St", "Opening Hours: 11 am - 02 am"));
        attractions.add(new Attraction("The Lion & Lobster", "24 Sillwood S", "Opening Hours: 11 am - 01 am"));
        attractions.add(new Attraction("Bath Arms", "3-4 Meeting House Ln", "Opening Hours: 10 am - 11 pm"));
        attractions.add(new Attraction("North Laine", "27 Gloucester Pl", "Opening Hours: 12 am - 02 am"));
        attractions.add(new Attraction("Brighton Beer Dispensary", "38 Dean St", "Opening Hours: 12 am - 01 am"));
        attractions.add(new Attraction("Fortune Of War", "156 Kings Rd", "Opening Hours: 11 am - 10 pm"));
        attractions.add(new Attraction("The Fiddlers Elbow", " 11-12 Boyce's St", "Opening Hours: 08 pm - 02am"));
        attractions.add(new Attraction("The Black Dove", "74 St James's St", "Opening Hours: 02 pm - 11 pm"));
        attractions.add(new Attraction("The Pump House", " 46 Market St", "Opening Hours: 08 am - 10 pm"));
        attractions.add(new Attraction("Brighton Rocks", "6 Rock Pl", "Opening Hours: 11 am - 01 am"));

        // Create an {@link AttractionAdapter}, whose data source is a list of {@link Attraction}s. The
        // adapter knows how to create list items for each item in the list.
        AttractionAdapter adapter =  new AttractionAdapter(getActivity(), attractions, R.color.category_pubs, false);

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