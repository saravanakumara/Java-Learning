package core;

public class AccessModifier1 {
	public void publicAccessMethod() {
		System.out.println("public method from another class AccessModifier1");
		//privateAccessMethod(); If publicAccessMethod is static, we need to use class name to access this privateAccessMethod.
	}
	
	private void privateAccessMethod() {
		System.out.println("private method from another class AccessModifier1");
	}
	
	protected void protectedAccessMethod() {
		System.out.println("protected method from another class AccessModifier1");
	}
	
	void defaultAccessMethod() {
		System.out.println("default method from another class AccessModifier1");
	}

}
