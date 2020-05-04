package build.factorymethod.structure;

public class TestEntry {
	public static void main(String[] args) {
		Creator creator = new ConcreteCreatorA();
		Product productA = creator.factoryMethod();
		creator = new ConcreteCreatorB();
		Product productB = creator.factoryMethod();
		creator = new ConcreteCreatorC();
		Product productC = creator.factoryMethod();
		productA.operation();
		productB.operation();
		productC.operation();

		creator = () -> null;
		Product productDefault = creator.defaultFactoryMethod();
		productDefault.operation();
	}
}
