package structure.decorator.example;

public class BitTrouser extends Finery {

	@Override
	public void show() {
		super.show();
		System.out.println(getClass().getSimpleName());
	}
}
