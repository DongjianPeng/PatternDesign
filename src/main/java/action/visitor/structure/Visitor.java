package action.visitor.structure;

/**
 * 抽象访问者类<br>
 * 为具体的元素申明一系列操作
 */
public abstract class Visitor {

	public abstract void visitConcreteElementA(ConcreteElementA concreteElementA);

	public abstract void visitConcreteElementB(ConcreteElementB concreteElementB);
}
