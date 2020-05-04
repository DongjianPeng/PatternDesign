package action.state.structure;

public class ConcreteStateB extends State {
	@Override
	public void handle(Context context) {
		context.setState(new ConcreteStateC());
	}
}
