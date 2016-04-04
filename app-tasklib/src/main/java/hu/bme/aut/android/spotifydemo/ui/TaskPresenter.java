package hu.bme.aut.android.spotifydemo.ui;

import hu.aut.tasklib.BaseTask;
import hu.aut.tasklib.TaskEngineHolder;

public class TaskPresenter<S> extends Presenter<S> {

	TaskEngineHolder holder = new TaskEngineHolder(this);

	public <T> void executeTask(BaseTask<T> task) {
		this.holder.executeTask(task);
	}

	@Override
	public void attachScreen(S screen) {
		super.attachScreen(screen);
		this.holder.start();
	}

	@Override
	public void detachScreen() {
		super.detachScreen();
		this.holder.stop();
	}

}
