package action.observer.structure;

public class ConcreteObserver3 extends Observer {

	@Override
	public void update() {
		System.out.println(getClass().getSimpleName() + " update");
	}
}
