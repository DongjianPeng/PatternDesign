package build.abstractfactory.structure;

/**
 * 具体工厂2
 */
public class ConcreteFactory2 extends AbstractFactory {
	@Override
	public AbstractProductA createProductA() {
		return new ProductA2();
	}

	@Override
	public AbstractProductB createProductB() {
		return new ProductB2();
	}
}
