package co.uk.poyyeemobile.lastfm.interactor;


import co.uk.poyyeemobile.lastfm.model.TopAlbumsResponse;
import co.uk.poyyeemobile.lastfm.network.TopAlbumsService;
import io.reactivex.Single;
import retrofit2.Retrofit;

/**
 * Created by Firat Veral on 9/16/2018.
 */

public class TopAlbumsInteractorImpl implements TopAlbumsInteractor {
    Retrofit mRetrofit;

    public TopAlbumsInteractorImpl(Retrofit retrofit) {
        mRetrofit = retrofit;
    }

    @Override
    public Single<TopAlbumsResponse> getTopAlbums(String userName, int limit, String apiKey) {
        return mRetrofit.create(TopAlbumsService.class).getTopArtists(userName, limit, apiKey);
    }
}
