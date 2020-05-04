package build.simplefactory.example;

public class OperationAdd extends Operation {
	@Override
	public double getResult() {
		return getNumberA() + getNumberB();
	}
}
