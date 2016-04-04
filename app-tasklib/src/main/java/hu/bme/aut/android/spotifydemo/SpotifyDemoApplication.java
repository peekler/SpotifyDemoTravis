package hu.bme.aut.android.spotifydemo;

import android.app.Application;

import hu.aut.tasklib.Injector;
import hu.bme.aut.android.spotifydemo.ui.UIModule;
import hu.bme.aut.android.spotifydemo.worker.WorkerModule;

public class SpotifyDemoApplication extends Application {

	@Injector
	public static SpotifyDemoApplicationComponent injector;

	@Override
	public void onCreate() {
		super.onCreate();

		injector =
				DaggerSpotifyDemoApplicationComponent.builder()
						.uIModule(new UIModule(this))
						.workerModule(new WorkerModule())
						.build();
	}
}
