package structure.composite.structure;

/**
 * 组合中表示叶子结点的对象，叶子结点没有子节点
 */
public class Leaf extends Component {

	public Leaf(String name) {
		super(name);
	}

	@Override
	public void add(Component c) {
		System.out.println("Cannot add to a leaf.");
	}

	@Override
	public void remove(Component c) {
		System.out.println("Cannot remove to a leaf.");

	}

	@Override
	public void display(int depth) {
		System.out.println(depth + "-" + name);
	}
}
