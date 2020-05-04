package action.observer.structure;

public class ConcreteObserver2 extends Observer {

	@Override
	public void update() {
		System.out.println(getClass().getSimpleName() + " update");
	}
}
