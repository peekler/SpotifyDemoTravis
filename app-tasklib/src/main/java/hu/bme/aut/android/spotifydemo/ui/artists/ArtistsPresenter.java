package hu.bme.aut.android.spotifydemo.ui.artists;

import hu.bme.aut.android.spotifydemo.ui.TaskPresenter;
import hu.bme.aut.android.spotifydemo.worker.task.artist.GetArtistsTask;

public class ArtistsPresenter extends TaskPresenter<ArtistsScreen> {

	public void refreshArtists(final String artistQuery) {
		executeTask(new GetArtistsTask(artistQuery));
	}

	void onTaskResult(GetArtistsTask task) {
		if (!task.hasError()) {
			if (screen != null) {
				screen.showArtists(task.getResult());
			}
		} else {
			if (screen != null) {
				screen.showNetworkError("Error");
			}
		}
	}
}
