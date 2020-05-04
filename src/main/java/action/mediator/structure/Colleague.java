package action.mediator.structure;

/**
 * 抽象需要中介的类
 */
public abstract class Colleague {
	protected Mediator mediator;

	/**
	 * 得到中介者对象
	 *
	 * @param mediator
	 */
	public Colleague(Mediator mediator) {
		this.mediator = mediator;
	}
}
