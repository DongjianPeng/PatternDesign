package build.builder.structure;

/**
 * 具体建造者类
 */
public class ConcreteBuilderOne extends Builder {

	private Product product = new Product();


	/**
	 * 实现具体的建造方法A
	 */
	@Override
	public void buildPartA() {
		product.add("p1");
	}

	/**
	 * 实现具体的建造方法B
	 */
	@Override
	public void buildPartB() {
		product.add("p2");
	}

	/**
	 * 返回建造结果
	 *
	 * @return
	 */
	@Override
	public Product getResult() {
		return product;
	}
}
