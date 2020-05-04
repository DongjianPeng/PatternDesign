package action.strategy.structure;

/**
 * 上下文
 */
public class Context {
	private Strategy strategy;

	/**
	 * 用一个具体算法来配置
	 *
	 * @param strategy 传入的算法类型
	 */
	public Context(Strategy strategy) {
		this.strategy = strategy;
	}

	/**
	 * 根据算法类型调用相应算法
	 */
	public void ContextInterface() {
		strategy.algorithmInterface();
	}
}
