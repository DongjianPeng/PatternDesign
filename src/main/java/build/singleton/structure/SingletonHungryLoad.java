package build.singleton.structure;

/**
 * 饿汉单列模式<br>
 * 加载类时就初始化实例
 */
public class SingletonHungryLoad {
	/**
	 * 实例化会占用内存，过多的实例需要考虑资源配比
	 */
	private static final SingletonHungryLoad instance = new SingletonHungryLoad();

	private SingletonHungryLoad() {

	}

	public SingletonHungryLoad getInstance() {
		return instance;
	}
}
