package action.visitor.structure;

/**
 * 具体的元素类，实现访问者的接口，把自身通过这个接口传入访问者中
 */
public class ConcreteElementA extends Element {
	@Override
	public void accept(Visitor visitor) {
		visitor.visitConcreteElementA(this);
	}

	public void operatorA() {
		System.out.println(getClass().getSimpleName() + "->opA");
	}
}
