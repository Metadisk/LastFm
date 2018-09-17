package co.uk.poyyeemobile.lastfm.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Firat Veral on 9/16/2018.
 */

public class TopArtistsResponse {
    @SerializedName("topartists")
    private TopArtists topArtists;

    public TopArtists getTopartists() {
        return topArtists;
    }

    public void setTopartists(TopArtists topArtists) {
        this.topArtists = topArtists;
    }
}
