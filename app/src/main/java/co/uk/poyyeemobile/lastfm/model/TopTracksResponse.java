package co.uk.poyyeemobile.lastfm.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Firat Veral on 9/16/2018.
 */

public class TopTracksResponse {
    @SerializedName("toptracks")
    private TopTracks topTracks;

    public TopTracks getTopTracks() {
        return topTracks;
    }

    public void setToptracks(TopTracks topTracks) {
        this.topTracks = topTracks;
    }
}
