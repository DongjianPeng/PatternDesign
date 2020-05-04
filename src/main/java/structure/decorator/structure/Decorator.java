package structure.decorator.structure;

/**
 * 装饰抽象类Component，继承了Component，从外部的类来扩展Component的功能，但是Component无需知道Decorator的存在
 */
public class Decorator extends Component {

	protected Component component;

	public void setComponent(Component component) {
		this.component = component;
	}

	@Override
	public void operation() {
		if (component != null)
			component.operation();
	}
}
