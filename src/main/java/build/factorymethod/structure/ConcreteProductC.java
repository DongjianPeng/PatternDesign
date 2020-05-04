package build.factorymethod.structure;

/**
 * 实现工厂方法所创建的对象C
 */
public class ConcreteProductC extends Product {
	@Override
	public void operation() {
		System.out.println(getClass().getSimpleName() + " operation...");
	}
}
