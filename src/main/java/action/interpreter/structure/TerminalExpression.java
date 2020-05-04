package action.interpreter.structure;

public class TerminalExpression extends AbstractExpression {
	@Override
	public void interpret(Context context) {
		System.out.println(getClass().getSimpleName() + " -> input:" + context.getInput());
		context.setOutput(getClass().getSimpleName());
	}
}
