package build.builder.structure;

/**
 * 指挥者
 */
public class Director {

	/**
	 * 指挥建造过程
	 * @param builder
	 */
	public void construct(Builder builder) {
		builder.buildPartA();
		builder.buildPartB();
	}
}
