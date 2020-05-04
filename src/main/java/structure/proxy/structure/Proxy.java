package structure.proxy.structure;

public class Proxy extends Subject {

	private RealSubject realSubject;

	public Proxy() {
	}

	@Override
	public void request() {
		System.out.println("proxy start");
		if (realSubject == null) {
			realSubject = new RealSubject();
		}
		realSubject.request();
		System.out.println("proxy end");
	}
}
