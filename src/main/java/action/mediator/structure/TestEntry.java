package action.mediator.structure;

public class TestEntry {
	public static void main(String[] args) {
		ConcreteMediator m = new ConcreteMediator();

		ConcreteColleague1 c1 = new ConcreteColleague1(m);
		ConcreteColleague2 c2 = new ConcreteColleague2(m);

		m.setColleague1(c1);
		m.setColleague2(c2);

		c1.send("Hello!");
		c2.send("I am fine! Still alive!");

	}
}
