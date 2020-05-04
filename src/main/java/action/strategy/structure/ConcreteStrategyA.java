package action.strategy.structure;

/**
 * 具体算法A
 */
public class ConcreteStrategyA extends Strategy {
	/**
	 * 实现A的算法细节
	 */
	@Override
	public void algorithmInterface() {
		System.out.println("实现算法A");
	}
}
