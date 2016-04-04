package hu.bme.aut.android.spotifydemo.worker;

import java.io.IOException;
import java.util.List;

import hu.aut.tasklib.CreateTask;
import hu.bme.aut.android.spotifydemo.model.ArtistsResult;
import hu.bme.aut.android.spotifydemo.model.Item;
import hu.bme.aut.android.spotifydemo.network.ArtistsApi;
import retrofit2.Call;
import retrofit2.Response;

public class ArtistWorker extends BaseWorker {

	ArtistsApi artistsApi;

	public ArtistWorker(ArtistsApi artistsApi) {
		this.artistsApi = artistsApi;
	}

	@CreateTask
	public List<Item> getArtists(String artistQuery) throws IOException {
		Call<ArtistsResult> artistsQueryCall = artistsApi.getArtists(artistQuery, "artist", 0, 3);
		Response<ArtistsResult> response = artistsQueryCall.execute();
		checkResponseOk(response);
		return response.body().getArtists().getItems();
	}

}
