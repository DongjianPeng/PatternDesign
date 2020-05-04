package structure.decorator.structure;

/**
 * 具体的装饰对象A
 */
public class ConcreteDecoratorA extends Decorator {


	/**
	 * 先运行原Component的operation()再执行本类的功能
	 */
	@Override
	public void operation() {
		super.operation();

		System.out.println("具体装饰对象A的操作");
	}
}
