package build.abstractfactory.structure;

/**
 * 具体工厂1
 */
public class ConcreteFactory1 extends AbstractFactory {
	@Override
	public AbstractProductA createProductA() {
		return new ProductA1();
	}

	@Override
	public AbstractProductB createProductB() {
		return new ProductB1();
	}
}
