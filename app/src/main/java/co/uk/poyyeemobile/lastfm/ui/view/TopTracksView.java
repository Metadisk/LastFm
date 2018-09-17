package co.uk.poyyeemobile.lastfm.ui.view;

import java.util.List;

import co.uk.poyyeemobile.lastfm.model.Track;

/**
 * Created by Firat Veral on 9/16/2018.
 */

public interface TopTracksView {
    void showProgress();

    void hideProgress();

    void showError();

    void updateData(List<Track> tracks);
    void showEmpty();
    void hidEmpty();
}
