package hu.autsoft.apptasklib;

import android.content.Context;

import java.util.concurrent.Executor;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import hu.autsoft.apptasklib.utils.UiExecutor;
import hu.bme.aut.android.spotifydemo.di.Network;
import hu.bme.aut.android.spotifydemo.network.ArtistsApi;
import hu.bme.aut.android.spotifydemo.ui.artists.ArtistsPresenter;
import hu.bme.aut.android.spotifydemo.ui.main.MainPresenter;
import hu.bme.aut.android.spotifydemo.worker.ArtistWorker;

@Module
public class TestModule {

    private Context context;

    public TestModule(Context context) {
        this.context = context;
    }

    @Provides
    public Context provideContext() {
        return context;
    }

    @Provides
    @Singleton
    public MainPresenter provideMainPresenter() {
        return new MainPresenter();
    }

    @Provides
    @Singleton
    public ArtistsPresenter provideArtistsPresenter() {
        return new ArtistsPresenter();
    }

    @Provides
    @Singleton
    @Network
    public Executor provideNetworkExecutor() {
        return new UiExecutor();
    }

    @Provides
    @Singleton
    public ArtistWorker provideArtistWorker(ArtistsApi artistsApi) {
        return new ArtistWorker(artistsApi);
    }
}
