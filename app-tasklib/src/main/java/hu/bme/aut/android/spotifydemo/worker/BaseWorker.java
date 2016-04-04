package hu.bme.aut.android.spotifydemo.worker;

import hu.aut.tasklib.exception.TaskMessageException;
import retrofit2.Response;

public class BaseWorker {

	protected void checkResponseOk(Response response) {
		if (response.code() != 200) {
			throw new TaskMessageException("Network error");
		}
	}

}
