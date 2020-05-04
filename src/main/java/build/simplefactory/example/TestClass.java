package build.simplefactory.example;

public class TestClass {
	public static void main(String[] args) {
		Operation operation = OperationFactory.createOperation("+");
		operation.setNumberA(11.5);
		operation.setNumberB(32.7);
		System.out.println(operation.getResult());
	}
}
