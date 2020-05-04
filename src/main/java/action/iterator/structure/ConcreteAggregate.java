package action.iterator.structure;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体的聚集类
 */
public class ConcreteAggregate extends Aggregate {
	private List<Object> items = new ArrayList<>();

	@Override
	public Iterator createIterator() {
		return new ConcreteIterator(this);
	}

	public int count() {
		return items.size();
	}
}
