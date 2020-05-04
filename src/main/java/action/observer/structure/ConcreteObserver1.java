package action.observer.structure;

public class ConcreteObserver1 extends Observer {

	@Override
	public void update() {
		System.out.println(getClass().getSimpleName() + " update");
	}
}
