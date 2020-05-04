package action.observer.structure;

public class TestEntry {
	public static void main(String[] args) {
		Subject subject = new ConcreteSubject1();
		Observer observer1 = new ConcreteObserver1();
		Observer observer2 = new ConcreteObserver2();
		Observer observer3 = new ConcreteObserver3();
		subject.attach(observer1);
		subject.attach(observer2);
		subject.attach(observer3);
		subject.notifyObserver();
	}
}
