package build.factorymethod.structure;

/**
 * 工厂方法的实现类，ConcreteCreatorA创建并返回一个ConcreteProductA实例
 */
public class ConcreteCreatorA implements Creator {
	@Override
	public Product factoryMethod() {
		return new ConcreteProductA();
	}
}
