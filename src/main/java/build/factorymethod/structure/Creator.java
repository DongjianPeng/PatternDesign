package build.factorymethod.structure;

/**
 * 声明工厂方法，该方法返回一个Product类型的对象，Creator也可以定义一个工厂方法的默认实现，返回一个默认的ConcreteProduct对象
 */
public interface Creator {
	public Product factoryMethod();

	/**
	 * 可选，默认的工厂方法实现
	 * @return
	 */
	default Product defaultFactoryMethod() {
		System.out.println("default factory method.");
		return new ConcreteProductA();
	}
}
