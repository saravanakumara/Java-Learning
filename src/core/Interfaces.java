package core;

//Used to achieve abstraction 100%
//Used for loose coupling
//Supports multiple inheritance
//class should be implemented
//it has final static constants and abstract methods
//In latest java, interfaces can have default methods which ruin the 100% abstraction
//Why is it implemented?
public interface Interfaces {
	public static final int a = 02;
	public static final int b = 23;
    public abstract void add();
    void add1(); //internally abstract
    default int method1() {
    	System.out.println("interface default method is called.");
    	return a; //can not be assigned as it is final, only can refer it and not updated.
    }

}
