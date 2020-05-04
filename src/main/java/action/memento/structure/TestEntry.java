package action.memento.structure;

public class TestEntry {
	public static void main(String[] args) {
		Originator o = new Originator();
		o.setState("S1");
		o.showState();

		Caretaker c = new Caretaker();
		c.setMemento(o.createMemento());

		o.setState("OFF");
		o.showState();

		o.setMemento(c.getMemento());

		o.showState();
	}
}
