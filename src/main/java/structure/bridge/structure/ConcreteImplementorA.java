package structure.bridge.structure;

/**
 * 具体实现
 */
public class ConcreteImplementorA extends Implementor {
	@Override
	public void operation() {
		System.out.println(getClass().getSimpleName() + "-> specific op.");
	}
}
