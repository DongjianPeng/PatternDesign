package build.simplefactory.example;

public class OperationSub extends Operation {
	@Override
	public double getResult() {
		return getNumberA() - getNumberB();
	}
}
