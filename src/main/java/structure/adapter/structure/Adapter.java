package structure.adapter.structure;

/**
 * 通过包装一个适配的对象，把原接口转换成目标接口
 */
public class Adapter extends Target {
	private Adaptee adaptee = new Adaptee();

	@Override
	public void request() {
		adaptee.specificRequest();
	}
}
