package action.state.structure;

public class ConcreteStateA extends State {
	@Override
	public void handle(Context context) {
		context.setState(new ConcreteStateB());
	}
}
