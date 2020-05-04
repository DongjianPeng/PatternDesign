package build.singleton.structure;

class MyThread extends Thread {

	public MyThread() {
	}

	public MyThread(int name) {
		super(String.valueOf(name));
	}

	public MyThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		SingletonDualLock instance = SingletonDualLock.getInstance();
		System.out.println(instance.hashCode() + " : " + getName());
	}
}

public class TestEntry {
	public static void main(String[] args) {
		for (int i = 0; i < 1000; i++) {
			new MyThread(i).start();
		}
	}
}
