package hu.bme.aut.android.spotifydemo.worker;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import hu.bme.aut.android.spotifydemo.network.ArtistsApi;

@Module
public class WorkerModule {

	@Provides
	@Singleton
	public ArtistWorker provideArtistWorker(ArtistsApi artistsApi) {
		return new ArtistWorker(artistsApi);
	}

}
