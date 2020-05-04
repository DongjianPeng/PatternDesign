package structure.facade.structure;

/**
 * 外观类
 */
public class Facade {
	private SubSystemOne subSystemOne;
	private SubSystemTwo subSystemTwo;
	private SubSystemThree subSystemThree;
	private SubSystemFour subSystemFour;

	public Facade() {
		subSystemOne = new SubSystemOne();
		subSystemTwo = new SubSystemTwo();
		subSystemThree = new SubSystemThree();
		subSystemFour = new SubSystemFour();
	}

	public void methodA() {
		subSystemOne.methodOne();
		subSystemTwo.methodOne();
		subSystemThree.methodOne();
	}

	public void methodB() {
		subSystemTwo.methodOne();
		subSystemThree.methodOne();
		subSystemFour.methodOne();
	}
}
