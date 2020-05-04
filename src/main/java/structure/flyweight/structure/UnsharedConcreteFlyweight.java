package structure.flyweight.structure;

public class UnsharedConcreteFlyweight extends Flyweight {
	@Override
	public void operation(int extrinsicState) {
		System.out.println("不共享的具体Flyweight："+extrinsicState);
	}
}
