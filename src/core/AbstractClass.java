package core;

public abstract class AbstractClass {

	public abstract void abstractTest();
	public static void nonAbstractStatic() {
		System.out.println("Abstract class static method.");
	}
	public final void nonAbstractFinal() {
		System.out.println("Abstract class final method.");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nonAbstractStatic();
	}

}
