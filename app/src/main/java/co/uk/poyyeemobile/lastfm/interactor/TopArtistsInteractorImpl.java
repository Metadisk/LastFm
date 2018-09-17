package co.uk.poyyeemobile.lastfm.interactor;

import co.uk.poyyeemobile.lastfm.model.TopArtistsResponse;
import co.uk.poyyeemobile.lastfm.network.TopArtistsService;
import io.reactivex.Single;
import retrofit2.Retrofit;

/**
 * Created by Firat Veral on 9/16/2018.
 */

public class TopArtistsInteractorImpl implements TopArtistsInteractor {
    Retrofit mRetrofit;

    public TopArtistsInteractorImpl(Retrofit retrofit) {
        mRetrofit = retrofit;
    }

    @Override
    public Single<TopArtistsResponse> getTopArtists(String userName, int limit, String apiKey) {
        return mRetrofit.create(TopArtistsService.class).getTopArtists(userName, limit, apiKey);
    }
}
