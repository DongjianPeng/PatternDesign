package action.state.structure;

public class TestEntry {
	public static void main(String[] args) {
		Context context = new Context(new ConcreteStateA());
		System.out.println(context.getState().getClass().getSimpleName());
		context.request();
		System.out.println(context.getState().getClass().getSimpleName());
	}
}
