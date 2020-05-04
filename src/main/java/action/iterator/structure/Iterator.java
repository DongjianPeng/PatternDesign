package action.iterator.structure;

/**
 * 跌代抽象类，用于定义：<br>
 * - 得到开始对象<br>
 * - 得到下一个对象<br>
 * - 判断是否到结尾<br>
 * - 判断是否是当前对象<br>
 */
public abstract class Iterator {
	public abstract Object first();

	public abstract Object next();

	public abstract boolean isDone();

	public abstract Object currentItem();
}
