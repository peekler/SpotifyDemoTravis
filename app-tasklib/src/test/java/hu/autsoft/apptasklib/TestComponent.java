package hu.autsoft.apptasklib;

import javax.inject.Singleton;

import dagger.Component;
import hu.autsoft.apptasklib.mock.MockNetworkModule;
import hu.bme.aut.android.spotifydemo.SpotifyDemoApplicationComponent;

@Singleton
@Component(modules = {MockNetworkModule.class,
        TestModule.class})
public interface TestComponent
        extends SpotifyDemoApplicationComponent {
}

