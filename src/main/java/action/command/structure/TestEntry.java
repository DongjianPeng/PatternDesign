package action.command.structure;

public class TestEntry {
	public static void main(String[] args) {

		Receiver receiver = new Receiver();

		Command command = new ConcreteCommand(receiver);

		Invoker invoker = new Invoker();
		invoker.setCommand(command);

		invoker.executeCommand();
	}
}
