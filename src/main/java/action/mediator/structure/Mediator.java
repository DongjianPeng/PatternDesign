package action.mediator.structure;

/**
 * 抽象中介者
 */
public abstract class Mediator {
	public abstract void send(String message, Colleague colleague);
}
