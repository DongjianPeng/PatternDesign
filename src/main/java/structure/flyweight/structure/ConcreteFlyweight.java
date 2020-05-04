package structure.flyweight.structure;

/**
 *
 */
public class ConcreteFlyweight extends Flyweight {
	@Override
	public void operation(int extrinsicState) {
		System.out.println("共享的具体Flyweight："+extrinsicState);
	}
}
