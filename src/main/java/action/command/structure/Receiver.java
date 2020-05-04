package action.command.structure;

/**
 * 知道如何实施与执行一个与请求相关的操作，任何类都可以作为一个接收者。
 */
public class Receiver {
	public void action() {
		System.out.println("action");
	}
}
