package co.uk.poyyeemobile.lastfm.di;


import javax.inject.Singleton;

import co.uk.poyyeemobile.lastfm.ui.fragment.TopAlbumsFragment;
import dagger.Component;

/**
 * Created by Firat Veral on 9/16/2018.
 */
@Singleton
@Component(modules = {TopAlbumsModule.class})
public interface TopAlbumsComponent {
    void inject(TopAlbumsFragment target);
}
