package structure.decorator.example;

public class TestEntry {

	public static void main(String[] args) {
		Person person = new Person("pdj");
		BitTrouser bitTrouser = new BitTrouser();
		TShirts tShirts = new TShirts();
		bitTrouser.decorate(person);
		tShirts.decorate(bitTrouser);
		tShirts.show();
		System.out.println("-----second---");
		tShirts.decorate(person);
		bitTrouser.decorate(tShirts);
		bitTrouser.show();
	}
}
