package action.visitor.structure;

/**
 * 抽象元素类<br>
 * 定义一个接口传入抽象访问者<br>
 */
public abstract class Element {
	public abstract void accept(Visitor visitor);
}
