package build.builder.structure;

public class ConcreteBuilderTwo extends Builder {

	private Product product = new Product();

	@Override
	public void buildPartA() {
		product.add("OP1");
	}

	@Override
	public void buildPartB() {
		product.add("OP2");
		product.add("OP3");
	}

	@Override
	public Product getResult() {
		return product;
	}
}
