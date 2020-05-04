package structure.decorator.example;

public class TShirts extends Finery {
	@Override
	public void show() {
		super.show();
		System.out.println(getClass().getSimpleName());
	}
}
