package action.memento.structure;

/**
 * 备忘录，负责存储Originator对象的内部状态并可防止除了Originator对象以外的其它对象访问Memento
 */
public class Memento {

	private String state;

	public Memento(String state) {
		this.state = state;
	}

	public String getState() {
		return state;
	}
}
