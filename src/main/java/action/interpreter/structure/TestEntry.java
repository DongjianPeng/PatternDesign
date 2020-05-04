package action.interpreter.structure;

import java.util.ArrayList;
import java.util.List;

public class TestEntry {
	public static void main(String[] args) {
		Context context = new Context();

		context.setInput("Test input.");
		List<AbstractExpression> abstractExpressions = new ArrayList<>();

		abstractExpressions.add(new TerminalExpression());
		abstractExpressions.add(new TerminalExpression());
		abstractExpressions.add(new NonterminalExpression());
		abstractExpressions.add(new TerminalExpression());
		abstractExpressions.add(new NonterminalExpression());


		for (AbstractExpression item : abstractExpressions) {
			item.interpret(context);
			System.out.println("output:" + context.getOutput());
		}

	}
}
