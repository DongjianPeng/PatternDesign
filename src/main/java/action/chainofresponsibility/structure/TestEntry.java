package action.chainofresponsibility.structure;

public class TestEntry {
	public static void main(String[] args) {
		Handler h1 = new ConcreteHandle1();
		Handler h2 = new ConcreteHandle2();
		Handler h3 = new ConcreteHandle3();

		h1.setSuccessor(h2);
		h2.setSuccessor(h3);


		h1.handleRequest(15);
		h1.handleRequest(2);
		h1.handleRequest(30);
	}
}
