package build.prototype.structure;

public class TestEntry {
	public static void main(String[] args) throws CloneNotSupportedException {
		ConcretePrototype1 p1 = new ConcretePrototype1("I");

		ConcretePrototype1 p2 = (ConcretePrototype1) p1.clone();

		System.out.println(p1.getId());
		System.out.println(p1);
		System.out.println(p2.getId());
		System.out.println(p2);

	}

}
