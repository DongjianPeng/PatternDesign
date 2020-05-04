package structure.facade.structure;

public class TestEntry {

	public static void main(String[] args) {
		Facade facade = new Facade();
		facade.methodA();
		System.out.println("=========");
		facade.methodB();
	}
}
