package structure.bridge.structure;

/**
 * 抽象
 */
public abstract class Abstraction {
	protected Implementor implementor;

	public void setImplementor(Implementor implementor) {
		this.implementor = implementor;
	}

	public void operation() {
		implementor.operation();
	}
}
