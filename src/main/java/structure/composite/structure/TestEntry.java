package structure.composite.structure;

import java.text.MessageFormat;

public class TestEntry {
	public static void main(String[] args) {
		Composite root = new Composite("root");

		root.add(new Leaf("Leaf A"));
		root.add(new Leaf("Leaf B"));

		Composite compX = new Composite("Composite X");

		compX.add(new Leaf("Leaf XA"));
		compX.add(new Leaf("Leaf XB"));

		root.add(compX);


		root.display(1);

	}
}
