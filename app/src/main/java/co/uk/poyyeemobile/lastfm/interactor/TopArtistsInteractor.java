package co.uk.poyyeemobile.lastfm.interactor;


import co.uk.poyyeemobile.lastfm.model.TopArtistsResponse;
import io.reactivex.Single;

/**
 * Created by Firat Veral on 9/16/2018.
 */

public interface TopArtistsInteractor {
    Single<TopArtistsResponse> getTopArtists(String userName, int limit, String apiKey);
}
