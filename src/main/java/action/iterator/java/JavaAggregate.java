package action.iterator.java;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class JavaAggregate implements Iterable<JavaAggregate> {

	private final static int DEFAULT_SIZE = 8;

	private int size;
	private int[] values;


	@Override
	public Iterator iterator() {
		return new Iterator() {
			@Override
			public boolean hasNext() {
				return false;
			}

			@Override
			public Object next() {
				return null;
			}
		};
	}

	@Override
	public void forEach(Consumer action) {

	}

	@Override
	public Spliterator spliterator() {
		return null;
	}


}
