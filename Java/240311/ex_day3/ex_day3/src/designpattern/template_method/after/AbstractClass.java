package designpattern.template_method.after;

public abstract class AbstractClass {

	final void templateMethod() {
		primitiveOperation1();
		primitiveOperation2();
		concreteOperation();
		hook();
	}

	abstract void primitiveOperation1();
	abstract void primitiveOperation2();

	void concreteOperation() {
		System.out.println("AbstractClass.concreteOperation()");
	}

	void hook() {
	}

}
