package structure.adapter.structure;

public class TestEntry {
	public static void main(String[] args) {
		Target target = new Adapter();
		target.request();
	}
}
