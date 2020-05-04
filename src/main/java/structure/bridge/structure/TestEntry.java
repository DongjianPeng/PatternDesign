package structure.bridge.structure;

public class TestEntry {
	public static void main(String[] args) {
		Abstraction ab = new RefinedAbstraction();

		ab.setImplementor(new ConcreteImplementorA());
		ab.operation();

		ab.setImplementor(new ConcreteImplementorB());
		ab.operation();
	}
}
