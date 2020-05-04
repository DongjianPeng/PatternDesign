package action.visitor.structure;

/**
 * 具体的元素类，实现访问者的接口，把自身通过这个接口传入访问者中
 */
public class ConcreteElementB extends Element {
	@Override
	public void accept(Visitor visitor) {
		visitor.visitConcreteElementB(this);
	}

	public void operatorB(){
		System.out.println(getClass().getSimpleName()+"->opB");
	}
}
