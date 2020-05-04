package structure.composite.structure;

/**
 * 组合模式中的对象声明接口，在适当的情况下可实现接口的默认行为，声明一个接口来访问和管理Component的子组件
 */
public abstract class Component {

	protected String name;

	public Component(String name) {
		this.name = name;
	}

	/**
	 * 添加子部件
	 *
	 * @param c
	 */
	public abstract void add(Component c);

	/**
	 * 删除子部件
	 *
	 * @param c
	 */
	public abstract void remove(Component c);

	/**
	 * 显示当前节点
	 *
	 * @param depth
	 */
	public abstract void display(int depth);

}
