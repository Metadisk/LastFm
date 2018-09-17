package co.uk.poyyeemobile.lastfm.presenter;

/**
 * Created by Firat Veral on 9/16/2018.
 */

public interface TopArtistsPresenter {
    void onDestroy();

    void getUserTopArtists(String userName, int limit, String apiKey);
}
