package build.factorymethod.structure;

/**
 * 实现工厂方法所创建的对象B
 */
public class ConcreteProductB extends Product {
	@Override
	public void operation() {
		System.out.println(getClass().getSimpleName() + " operation...");
	}
}
