package structure.flyweight.structure;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂<br>
 * 用来创建并管理享元对象
 */
public class FlyWeightFactory {
	private Map<String, Flyweight> flyweightMap = new HashMap<>();

	public FlyWeightFactory() {
		flyweightMap.put("X", new ConcreteFlyweight());
		flyweightMap.put("Y", new ConcreteFlyweight());
		flyweightMap.put("Z", new ConcreteFlyweight());
	}

	public Flyweight getFlyweight(String key) {
		if (!flyweightMap.containsKey(key)) {
			flyweightMap.put(key, new ConcreteFlyweight());
		}
		return flyweightMap.get(key);
	}
}
