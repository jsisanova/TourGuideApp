package com.example.android.tourguideapp;

/**
 * {@link Attraction} represents the attractions that are recommended for the visitors.
 */
public class Attraction {

    /** Image resource ID for the attraction */
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    /** Constant value that represents no image was provided for this attraction,
     * -1 is out of the range of all the possible valid resource ID*/
    private static final int NO_IMAGE_PROVIDED = -1;

    /** Name of the attraction */
    private String mAttractionName;

    /** Description of the attraction */
    private String mAttractionDescription;

    /** Opening hours */
    private String mOpeningHours;

    /** Audio resource ID for the event attractions */
    private int mAudioResourceId;

    /**
     * Create a new Attraction object (initialize the values) - for historial sites
     *
     * @param imageResourceId is the drawable resource ID for the image associated with the attraction
     * @param attractionName is the name of the attraction
     * @param attractionDescription is the brief description of the attraction
     */
    public Attraction(int imageResourceId, String attractionName, String attractionDescription) {
        mImageResourceId = imageResourceId;
        mAttractionName = attractionName;
        mAttractionDescription = attractionDescription;
    }

    /**
     * Create a new Attraction object (initialize the values) - for events
     *
     * @param attractionName is the name of the attraction
     * @param attractionDescription is the brief description of the attraction
     * @param audioResourceId is the resource ID for the audio file associated with the event attraction
     */
    public Attraction(String attractionName, String attractionDescription, int audioResourceId) {
        mAttractionName = attractionName;
        mAttractionDescription = attractionDescription;
        mAudioResourceId = audioResourceId;
    }

    /**
     * Create a new Attraction object (initialize the values) - for parks
     *
     * @param imageResourceId is the drawable resource ID for the image associated with the attraction
     * @param attractionName is the name of the attraction
     */
    public Attraction(int imageResourceId, String attractionName) {
        mImageResourceId = imageResourceId;
        mAttractionName = attractionName;
    }

    /**
     * Create a new Attraction object (initialize the values) - for pubs
     *
     * @param attractionName is the name of the attraction
     * @param attractionDescription is the brief description of the attraction
     * @param openingHours are the opening hours of attraction
     */
    public Attraction(String attractionName, String attractionDescription, String openingHours) {
        mAttractionName = attractionName;
        mAttractionDescription = attractionDescription;
        mOpeningHours = openingHours;
    }

    /**
     * Get the image resource ID of the attraction.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this attraction.
     */
    public boolean hasImage() {
//        if is not equal to -1, return TRUE
//        if it is equal to -1, then there is no image, and return FALSE
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    /**
     * Get the name of the attraction.
     */
    public String getAttractionName() {
        return mAttractionName;
    }

    /**
     * Get the brief description of the attraction.
     */
    public String getAttractionDescription() {
        return mAttractionDescription;
    }

    /**
     * Get the opening hours.
     */
    public String getOpeningHours() {
        return mOpeningHours;
    }

    /**
     * Return the audio resource ID of the event attraction.
     */
    public int getAudioResourceId() {
        return mAudioResourceId;
    }
}