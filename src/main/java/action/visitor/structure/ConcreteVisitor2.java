package action.visitor.structure;

/**
 * 具体访问者，实现具体元素的处理操作
 */
public class ConcreteVisitor2 extends Visitor {
	@Override
	public void visitConcreteElementA(ConcreteElementA concreteElementA) {
		concreteElementA.operatorA();
	}

	@Override
	public void visitConcreteElementB(ConcreteElementB concreteElementB) {
		concreteElementB.operatorB();
	}
}
