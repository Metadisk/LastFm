package co.uk.poyyeemobile.lastfm.ui.view;


import java.util.List;

import co.uk.poyyeemobile.lastfm.model.Album;

/**
 * Created by Firat Veral on 9/16/2018.
 */

public interface TopAlbumsView {
    void showProgress();

    void hideProgress();

    void showError();

    void updateData(List<Album> topAlbums);

    void showEmpty();

    void hidEmpty();
}
