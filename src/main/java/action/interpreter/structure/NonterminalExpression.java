package action.interpreter.structure;

public class NonterminalExpression extends AbstractExpression {
	@Override
	public void interpret(Context context) {
		System.out.println(getClass().getSimpleName()+" -> input:"+context.getInput());
		context.setOutput(getClass().getSimpleName());
	}
}
