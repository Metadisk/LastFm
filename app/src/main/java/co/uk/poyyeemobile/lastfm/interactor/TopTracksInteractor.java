package co.uk.poyyeemobile.lastfm.interactor;


import co.uk.poyyeemobile.lastfm.model.TopTracksResponse;
import io.reactivex.Single;

/**
 * Created by Firat Veral on 9/16/2018.
 */

public interface TopTracksInteractor {
    Single<TopTracksResponse> getTopTracks(String userName, int limit, String apiKey);

}
