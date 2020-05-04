package action.observer.structure;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象主题类
 */
public abstract class Subject {

	//非线程安全
	private List<Observer> observers = new ArrayList<>();

	public void attach(Observer observer) {
		if (!observers.contains(observer))
			observers.add(observer);
	}

	public void detach(Observer observer) {
		if (observers.contains(observer))
			observers.remove(observer);
	}

	public void notifyObserver() {
		for (Observer item : observers)
			item.update();
	}
}
