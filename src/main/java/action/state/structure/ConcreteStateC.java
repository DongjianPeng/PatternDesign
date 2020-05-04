package action.state.structure;

public class ConcreteStateC extends State {
	@Override
	public void handle(Context context) {
		context.setState(new ConcreteStateA());
	}
}
