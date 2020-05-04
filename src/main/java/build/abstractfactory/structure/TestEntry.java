package build.abstractfactory.structure;

public class TestEntry {
	public static void main(String[] args) {
		// 用具体工厂1创建产品系列1
		AbstractFactory factory = new ConcreteFactory1();
		AbstractProductA productA = factory.createProductA();
		AbstractProductB productB = factory.createProductB();

		System.out.println(productA.getClass().getSimpleName());
		System.out.println(productB.getClass().getSimpleName());

		// 用具体工厂2创建产品系列2
		AbstractFactory factory2 = new ConcreteFactory2();
		AbstractProductA productA2 = factory2.createProductA();
		AbstractProductB productB2 = factory2.createProductB();

		System.out.println(productA2.getClass().getSimpleName());
		System.out.println(productB2.getClass().getSimpleName());
	}
}
