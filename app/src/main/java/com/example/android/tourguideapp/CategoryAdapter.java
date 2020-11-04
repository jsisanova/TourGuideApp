package com.example.android.tourguideapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * {@link CategoryAdapter} is a {@link FragmentPagerAdapter} that can provide the layout for
 * each list item based on a data source which is a list of {@link Attraction} objects.
 */
public class CategoryAdapter extends FragmentPagerAdapter {

    /** Context of the app */
    // We need a Context object in order to turn the string resource ID into an actual String
    private Context mContext;

    // Tab names
    private String[] myPageListArray = new String[]{"Historical sites", "Events", "Parks", "Pubs"};


    /**
     * Create a new {@link CategoryAdapter} object.
     *
     * @param context is the context of the app
     * @param fm is the fragment manager that will keep each fragment's state in the adapter
     *           across swipes.
     */
    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    /**
     * Return the {@link Fragment} that should be displayed for the given page number.
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new HistoricalSitesFragment();
        } else if (position == 1) {
            return new EventsFragment();
        } else if (position == 2) {
            return new ParksFragment();
        } else {
            return new PubsFragment();
        }
    }

    /**
     * Return the total number of pages.
     */
    @Override
    public int getCount() {
        return 4;
    }

    /**
     * Customize the tab text
     */
    @Override
    public CharSequence getPageTitle(int position) {

        return myPageListArray[position];

//        switch (position) {
//            case 0:
//                return mContext.getString(R.string.category_historical_sites);
//            case 1:
//                return mContext.getString(R.string.category_events);
//            case 2:
//                return mContext.getString(R.string.category_parks);
//            default:
//                return  mContext.getString(R.string.category_pubs);
//        }
    }
}

