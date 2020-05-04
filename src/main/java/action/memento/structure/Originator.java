package action.memento.structure;

/**
 * 发起人，需要被记录的类
 */
public class Originator {

	private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	/**
	 * 可使用备忘录恢复内部状态
	 *
	 * @param m
	 */
	public void setMemento(Memento m) {
		state = m.getState();
	}

	/**
	 * 负责创建一个能记录当前时刻对象状态的的备忘录
	 *
	 * @return
	 */
	public Memento createMemento() {
		return new Memento(state);
	}


	public void showState() {
		System.out.println(state);
	}
}
