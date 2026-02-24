package core;

public class BasicConcepts {

	public static void main(String[] args) {
		//Main method is the entry point for program execution. We can change the position of the static & public identifiers.
		System.out.println("Main method is the entry point for program execution. We can change the position of the static & public identifiers.");
		System.out.println("Testing without static identifier for main method");
		//We can not access it directory as it non-static method. If static method we can call it by classname from other classes or directly can call within the same class.
		privateStaticMethodInClass(); 
		//If want to use non-static method inside main method, we need to have object of the class to access it.		
		BasicConcepts basicConceptsObj = new BasicConcepts();
		basicConceptsObj.privateMethodInClass();
		
		publicStaticMethodInClass();
		basicConceptsObj.publicMethodInClass();
		
		AccessModifier1 accessModifier1Obj = new AccessModifier1();
		accessModifier1Obj.publicAccessMethod();
		//accessModifier1Obj.privateAccessMethod(); //Private method is not accessible from other classes.
		accessModifier1Obj.protectedAccessMethod(); //Accessible to the same package and inherited classes.
	}
	
	private static void privateStaticMethodInClass() {
		System.out.println("Private static method in the class.");
	}
	
	private void privateMethodInClass() {
		System.out.println("Private method in the class using its object.");
	}
	public static void publicStaticMethodInClass() {
		System.out.println("Public static method in the class.");
	}
	
	public void publicMethodInClass() {
		System.out.println("Public method in the class using its object.");
	}
}
