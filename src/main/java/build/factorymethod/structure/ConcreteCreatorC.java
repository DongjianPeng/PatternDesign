package build.factorymethod.structure;

public class ConcreteCreatorC implements Creator {
	@Override
	public Product factoryMethod() {
		return  new ConcreteProductC();
	}
}
