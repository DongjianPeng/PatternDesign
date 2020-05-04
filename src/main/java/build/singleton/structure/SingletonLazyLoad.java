package build.singleton.structure;

/**
 * 懒汉/饱汉单例模式 <br>
 * 等使用时才初始化实例
 */
public class SingletonLazyLoad {
	private static SingletonLazyLoad instance;

	private SingletonLazyLoad() {

	}

	/**
	 * 非线程安全，所以要加锁<br>
	 * 每次都加锁会消耗过多资源
	 *
	 * @return
	 */
	public synchronized SingletonLazyLoad getInstance() {
		if (instance == null)
			instance = new SingletonLazyLoad();
		return instance;
	}
}
