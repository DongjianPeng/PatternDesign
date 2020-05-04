package build.factorymethod.structure;

/**
 * 实现Product接口
 */
public class ConcreteProductA extends Product {
	@Override
	public void operation() {
		System.out.println(getClass().getSimpleName() + " operation...");
	}
}
