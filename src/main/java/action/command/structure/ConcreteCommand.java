package action.command.structure;

/**
 * 将一个接收者对象绑定于一个动作，调用接收者相应的操作，实现命令的执行
 */
public class ConcreteCommand extends Command {
	public ConcreteCommand(Receiver receiver) {
		super(receiver);
	}

	@Override
	public void execute() {
		receiver.action();
	}
}
