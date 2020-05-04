package action.templateMethod.structure;

public class TestEntry {
	public static void main(String[] args) {
		AbstractClass c;
		c = new ConcreteClassA();
		c.templateMethod();

		c = new ConcreteClassB();
		c.templateMethod();

	}
}
