package build.builder.structure;

/**
 * 抽象建造者类，定义产品确定的建造方法和拿到产品建造后结果的方法
 */
public abstract class Builder {

	public abstract void buildPartA();

	public abstract void buildPartB();

	public abstract Product getResult();

}