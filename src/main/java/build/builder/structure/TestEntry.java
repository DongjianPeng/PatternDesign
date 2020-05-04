package build.builder.structure;

public class TestEntry {

	public static void main(String[] args) {
		Director director = new Director();
		Builder b1 = new ConcreteBuilderOne();
		Builder b2 = new ConcreteBuilderTwo();
		//使用者不需要知道建造过程
		director.construct(b1);
		director.construct(b2);
		//建造完毕后拿到产品就行
		Product p1 = b1.getResult();
		Product p2 = b2.getResult();
		p1.show();
		p2.show();
	}
}
