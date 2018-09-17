package co.uk.poyyeemobile.lastfm.presenter;

/**
 * Created by Firat Veral on 9/16/2018.
 */

public interface TopTracksPresenter  {
    void onDestroy();
    void getTopTracks(String userName, int limit, String apiKey);

}
