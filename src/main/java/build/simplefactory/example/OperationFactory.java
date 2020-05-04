package build.simplefactory.example;

public class OperationFactory {

	public static Operation createOperation(String operate) {
		if (operate == null || operate.isEmpty()) {
			throw new IllegalArgumentException("operate can not be empty.");
		}
		Operation operation = null;
		switch (operate) {
			case "+": {
				operation = new OperationAdd();
			}
			break;
			case "-": {
				operation = new OperationSub();
			}
			break;
			case "*": {
				operation = new OperationMul();
			}
			break;
			case "/": {
				operation = new OperationDiv();
			}
			break;
			default:
				throw new IllegalArgumentException("The operate not support.");
		}
		return operation;
	}
}
