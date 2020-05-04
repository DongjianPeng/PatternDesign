package action.mediator.structure;

/**
 * 具体同事类
 */
public class ConcreteColleague2 extends Colleague{
	/**
	 * 得到中介者对象
	 *
	 * @param mediator
	 */
	public ConcreteColleague2(Mediator mediator) {
		super(mediator);
	}

	public void send(String message) {
		System.out.print(getClass().getSimpleName() + " send to ");
		mediator.send(message, this);
	}

	public void notify(String message) {
		System.out.println(getClass().getSimpleName() + ":" + message);
	}

}
