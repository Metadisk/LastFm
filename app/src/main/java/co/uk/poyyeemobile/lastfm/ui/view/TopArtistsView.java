package co.uk.poyyeemobile.lastfm.ui.view;


import java.util.List;

import co.uk.poyyeemobile.lastfm.model.Artist;

/**
 * Created by Firat Veral on 9/16/2018.
 */

public interface TopArtistsView {
    void showProgress();

    void hideProgress();

    void updateData(List<Artist> topArtists);

    void showError();
    void showEmpty();
    void hidEmpty();

}
