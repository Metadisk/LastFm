package co.uk.poyyeemobile.lastfm.di;


import javax.inject.Singleton;

import co.uk.poyyeemobile.lastfm.ui.fragment.TopArtistsFragment;
import dagger.Component;

/**
 * Created by Firat Veral on 9/16/2018.
 */

@Singleton
@Component(modules = {TopArtistsModule.class})
public interface TopArtistsComponent {
    void inject(TopArtistsFragment target);
}
