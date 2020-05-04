package build.builder.structure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 产品类
 */
public class Product {

	List<String> parts = new ArrayList<>();

	public void add(String part) {
		parts.add(part);
	}

	public void show() {
		System.out.print("Product:");
		System.out.println(Arrays.toString(parts.toArray()));
	}

}
