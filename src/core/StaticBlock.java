package core;

public class StaticBlock extends AbstractClass{ //private, protected are not allowed for class but final, abstract, public, default are allowed
	int a = 10;
	static int b;
	//Static block will be excuted before running main().
	//This is executed while loading class itself. Only one instance will be created and reused the values. Class level.
	static {
		b = 20;
		//a = 30; //Only static variable is accessed in the static method or block
		System.out.println("Static block - variable value: " + b);
	}
	
	static final int c = 100;
	final int d; //not initialized
	//d = 5; error when initialized other than constructor
	//static {
	//	c = 18; //final variable can not be assigned in static block
	//}
	
	private StaticBlock() { //Can not be static, final and abstract
		this.d = 0;
		System.out.println("Default constructor.");
	}
	
	public static void main(String[] args) {
		b = 30;
		System.out.println("Static variable value after update in main() - " + b);
		System.out.println("main method.");
		StaticBlock sbO = new StaticBlock();
		System.out.println("private contructor used to access the property in the same class. " + sbO.a);
		System.out.println("Final variable value: " + c);
		//c = c + 10;//final can not be changed
		//AbstractClass abc = new AbstractClass(); //Abstract class can not instantiate
		sbO.abstractTest();
		StaticBlock.nonAbstractStatic();
		
	}
	
	public static void main(String[] args, String str) {
		System.out.println("main method overload.");
	}

	//@Override - Can not override the static method of the parent class
	public static void nonAbstractStatic() {
		System.out.println("Non abstract method of abstract class but created same in the subclass too. accessed by object of subclass.");
	}
	@Override
	public void abstractTest() {
		System.out.println("Abstract class inherited.");
		AbstractClass.nonAbstractStatic(); //static method access is not overridden here.
		nonAbstractFinal(); //non static final method is inherited from the class not overridden.
		
	}

}
