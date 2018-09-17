package co.uk.poyyeemobile.lastfm.interactor;

import co.uk.poyyeemobile.lastfm.model.TopTracksResponse;
import co.uk.poyyeemobile.lastfm.network.TopTracksService;
import io.reactivex.Single;
import retrofit2.Retrofit;

/**
 * Created by Firat Veral on 9/16/2018.
 */

public class TopTracksInteractorImpl implements TopTracksInteractor {
    Retrofit mRetrofit;

    public TopTracksInteractorImpl(Retrofit retrofit) {
        mRetrofit = retrofit;
    }

    @Override
    public Single<TopTracksResponse> getTopTracks(String userName, int limit, String apiKey) {
        return mRetrofit.create(TopTracksService.class).getTopTracks(userName, limit, apiKey);
    }
}
