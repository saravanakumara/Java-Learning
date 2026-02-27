package core;

public class StaticBlock {
	int a = 10;
	static int b;
	//Static block will be excuted before running main().
	//This is executed while loading class itself. Only one instance will be created and reused the values. Class level.
	static {
		b = 20;
		//a = 30; //Only static variable is accessed in the static method or block
		System.out.println("Static block.");
	}
	
	private StaticBlock() {
		System.out.println("Default constructor.");
	}
	public static void main(String[] args) {
		System.out.println("main method.");
		StaticBlock sbO = new StaticBlock();
		System.out.println("private contructor used to access the property in the same class. " + sbO.a);
	}

}
