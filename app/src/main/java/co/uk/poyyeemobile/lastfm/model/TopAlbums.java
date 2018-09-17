package co.uk.poyyeemobile.lastfm.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Firat Veral on 9/16/2018.
 */

public class TopAlbums {
    public List<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(List<Album> albums) {
        this.albums = albums;
    }

    @SerializedName("album")
    List<Album> albums;
}
