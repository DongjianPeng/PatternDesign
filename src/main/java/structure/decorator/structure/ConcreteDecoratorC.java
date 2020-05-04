package structure.decorator.structure;

public class ConcreteDecoratorC extends Decorator {

	
	@Override
	public void operation() {
		super.operation();

		System.out.println("具体装饰对象C的操作");
	}
}
