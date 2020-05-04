package structure.composite.structure;

import java.util.ArrayList;
import java.util.List;

/**
 * 定义有枝结点行为，用来存储子部件，<br>
 * 在Component接口中实现与子部件有关的操作，比如增加和删除子部件
 */
public class Composite extends Component {

	private List<Component> children = new ArrayList<>();

	public Composite(String name) {
		super(name);
	}

	@Override
	public void add(Component c) {
		children.add(c);
	}

	@Override
	public void remove(Component c) {
		children.remove(c);
	}

	@Override
	public void display(int depth) {
		System.out.println(depth + "-" + name);
		for (Component c : children) {
			c.display(depth + 2);
		}
	}
}
