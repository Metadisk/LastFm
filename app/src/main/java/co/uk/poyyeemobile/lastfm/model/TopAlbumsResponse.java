package co.uk.poyyeemobile.lastfm.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Firat Veral on 9/16/2018.
 */

public class TopAlbumsResponse {
    public TopAlbums getTopAlbums() {
        return topAlbums;
    }

    public void setTopAlbums(TopAlbums topAlbums) {
        this.topAlbums = topAlbums;
    }

    @SerializedName("topalbums")
    TopAlbums topAlbums;
}
