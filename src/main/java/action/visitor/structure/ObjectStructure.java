package action.visitor.structure;

import java.util.ArrayList;
import java.util.List;

/**
 * 对象结构类<br>
 * 能枚举元素，提供一个高层接口允许访问者访问它的元素
 */
public class ObjectStructure {
	private List<Element> elements = new ArrayList<>();

	public void attach(Element element) {
		elements.add(element);
	}

	public void detach(Element element) {
		elements.remove(element);
	}

	public void accept(Visitor visitor) {
		for (Element e : elements) {
			e.accept(visitor);
		}
	}
}
