package action.iterator.structure;

/**
 * 具体的迭代器类
 */
public class ConcreteIterator extends Iterator {

	private ConcreteAggregate aggregate;
	private int current = 0;

	public ConcreteIterator(ConcreteAggregate aggregate) {
		this.aggregate = aggregate;
	}

	@Override
	public Object first() {
		return null;
	}

	@Override
	public Object next() {
		return null;
	}

	@Override
	public boolean isDone() {
		return false;
	}

	@Override
	public Object currentItem() {
		return null;
	}
}
