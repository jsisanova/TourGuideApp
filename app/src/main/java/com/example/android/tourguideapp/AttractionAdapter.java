package com.example.android.tourguideapp;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

// AttractionAdapter is a custom adapter that takes as it's input a list of Attraction objects
public class AttractionAdapter extends ArrayAdapter<Attraction> {

    /** Resource ID for the background color for this list of attractions */
    private int mColorResourceId;
    /** Boolean saying if the audio play button should be shown for the list of attractions*/
    private boolean mShowPlayButton;

    /** @param context  The current context. Used to inflate the layout file.
     @param attractions    A List of Attraction objects to display in a list
     @param colorResourceId is the resource ID for the background color for this list of attractions
     @param showPlayButton says if the audio play button should be shown for the list of attractions
     */
    public AttractionAdapter(Context context, ArrayList<Attraction> attractions, int colorResourceId, boolean showPlayButton) {
        super(context, 0, attractions);
        mColorResourceId = colorResourceId;
        this.mShowPlayButton = showPlayButton;
    }

    /**
     * Provide a view for an AdapterView (ListView)
     *
     * @param position The position in the list of data that should be displayed in the
     *                 list item view.
     * @param convertView The recycled view to populate.
     * @param parent The parent ViewGroup that is used for inflation (in this case ListView)
     * @return The View for the position in the AdapterView.
     */
    @Override
    // Get a list item view that we can use (and return it to ListView)
    public View getView(int position, View convertView, ViewGroup parent) {

        // EITHER by reusing
        View listItemView = convertView;
        // OR inflate (= create) new list item view from list_item.xml
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        //Get the {@link Attraction} object located at this position in the list
        Attraction currentAttraction = getItem(position);

        // Find the TextView and ImageView in the list_item.xml layout
        ImageView imageResourceId = (ImageView) listItemView.findViewById(R.id.image);
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name_text_view);
        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.description_text_view);
        TextView openingHoursTextView = (TextView) listItemView.findViewById(R.id.opening_hours_text_view);
        // Check if an image is provided for this attraction or not
        if (currentAttraction.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageResourceId.setImageResource(currentAttraction.getImageResourceId());
            // Make sure the view is visible
            imageResourceId.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageResourceId.setVisibility(View.GONE);
        }

        // Populate the data into the template view using the data object
        nameTextView.setText(currentAttraction.getAttractionName());
        descriptionTextView.setText(currentAttraction.getAttractionDescription());
        openingHoursTextView.setText(currentAttraction.getOpeningHours());


        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        // Hide play audio button, if showPlayButton is false
        if(!mShowPlayButton){
            listItemView.findViewById(R.id.play_arrow).setVisibility(View.GONE);
        }

        // Return the whole list item layout so that it can be shown in the ListView on screen
        return listItemView;
    }
}