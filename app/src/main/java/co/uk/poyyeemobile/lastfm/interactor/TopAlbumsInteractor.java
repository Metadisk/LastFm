package co.uk.poyyeemobile.lastfm.interactor;


import co.uk.poyyeemobile.lastfm.model.TopAlbumsResponse;
import io.reactivex.Single;

/**
 * Created by Firat Veral on 9/16/2018.
 */

public interface TopAlbumsInteractor {
    Single<TopAlbumsResponse> getTopAlbums(String userName, int limit, String apiKey);
}
