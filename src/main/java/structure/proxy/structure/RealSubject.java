package structure.proxy.structure;

public class RealSubject extends Subject {
	@Override
	public void request() {
		System.out.println("real subject..");
	}
}
