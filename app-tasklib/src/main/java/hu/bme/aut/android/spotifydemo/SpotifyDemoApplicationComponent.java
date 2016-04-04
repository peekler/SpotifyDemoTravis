package hu.bme.aut.android.spotifydemo;

import javax.inject.Singleton;

import dagger.Component;
import hu.bme.aut.android.spotifydemo.network.NetworkModule;
import hu.bme.aut.android.spotifydemo.ui.UIModule;
import hu.bme.aut.android.spotifydemo.ui.artists.ArtistsFragment;
import hu.bme.aut.android.spotifydemo.ui.artists.ArtistsPresenter;
import hu.bme.aut.android.spotifydemo.ui.main.MainActivity;
import hu.bme.aut.android.spotifydemo.worker.WorkerModule;
import hu.bme.aut.android.spotifydemo.worker.task.ArtistWorkerBaseTaskHelper;

@Singleton
@Component(modules = {UIModule.class, NetworkModule.class, WorkerModule.class})
public interface SpotifyDemoApplicationComponent {
	void inject(MainActivity mainActivity);

	void inject(ArtistsFragment artistsFragment);

	void inject(ArtistsPresenter artistsPresenter);

	void inject(ArtistWorkerBaseTaskHelper artistWorkerBaseTaskHelper);
}
