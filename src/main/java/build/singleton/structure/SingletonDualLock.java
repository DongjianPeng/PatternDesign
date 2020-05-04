package build.singleton.structure;

/**
 * 双重锁单例模式<br>
 * 懒汉/饱汉模式的改良版，不必每次都加锁
 */
public class SingletonDualLock {
	private static SingletonDualLock instance;

	private SingletonDualLock() {

	}

	/**
	 * 需要双重判断
	 *
	 * @return
	 */
	public static SingletonDualLock getInstance() {
		if (instance == null) {
			synchronized (SingletonDualLock.class) {
				if (instance == null)
					instance = new SingletonDualLock();
			}
		}
		return instance;
	}

}
