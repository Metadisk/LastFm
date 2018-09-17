package co.uk.poyyeemobile.lastfm.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Firat Veral on 9/16/2018.
 */

public class TopTracks {

    @SerializedName("track")
    private List<Track> tracks;

    public List<Track> getTracks() {
        return tracks;
    }

    public void setTracks(List<Track> tracks) {
        this.tracks = tracks;
    }
}
