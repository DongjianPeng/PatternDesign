package action.visitor.structure;

public class TestEntry {
	public static void main(String[] args) {
		ObjectStructure o = new ObjectStructure();

		o.attach(new ConcreteElementA());
		o.attach(new ConcreteElementA());
		o.attach(new ConcreteElementB());

		o.accept(new ConcreteVisitor1());
		o.accept(new ConcreteVisitor2());

	}
}
