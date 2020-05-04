package structure.decorator.structure;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class TestEntry {
	public static void main(String[] args) {
		ConcreteComponent c = new ConcreteComponent();

		ConcreteDecoratorA d1 = new ConcreteDecoratorA();
		ConcreteDecoratorB d2 = new ConcreteDecoratorB();
		ConcreteDecoratorC d3 = new ConcreteDecoratorC();

		d1.setComponent(c);
		d2.setComponent(d1);
		d3.setComponent(d2);
		d3.operation();

		
	}
}
