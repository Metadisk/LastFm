package co.uk.poyyeemobile.lastfm.di;


import javax.inject.Singleton;

import co.uk.poyyeemobile.lastfm.ui.fragment.TopTracksFragment;
import dagger.Component;

/**
 * Created by Firat Veral on 9/16/2018.
 */

@Singleton
@Component(modules = {TopTracksModule.class})
public interface TopTracksComponent {
    void inject(TopTracksFragment target);
}
