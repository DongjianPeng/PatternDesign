package action.templateMethod.structure;

public abstract class AbstractClass {

	public void templateMethod() {
		primitiveOperation1();
		primitiveOperation2();
		System.out.println("finished");
	}

	public abstract void primitiveOperation1();

	public abstract void primitiveOperation2();
}
