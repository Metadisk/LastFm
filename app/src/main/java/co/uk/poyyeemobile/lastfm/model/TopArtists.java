package co.uk.poyyeemobile.lastfm.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Firat Veral on 9/16/2018.
 */

public class TopArtists {
    @SerializedName("artist")
    private List<Artist> artists;

    public List<Artist> getArtists() {
        return artists;
    }

    public void setArtists(List<Artist> artists) {
        this.artists = artists;
    }

}
