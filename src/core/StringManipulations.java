package core;

public class StringManipulations {
	public static void main(String[] args) {
		//Java will use special memory area inside heap memory called StringPool. 
		//when creating a String using literal, memory is created inside string pool, that is first it will check the string availability in the StringPool.
		//If available, it will use the same reference otherwise it will create a new string in the StringPool and use this new reference.
		String name = "Test";
		//Concatination
		String newName = name;
		if(name == newName) {
			System.out.println("same value and same reference.");
		}
		newName = name + "value";
		if((name + "value").equalsIgnoreCase(newName)) {
			System.out.println("same value.");
		}
		if((name + "value") == (newName)) {
			System.out.println("same value and same reference.");
		} else {
			System.out.println("same value and differnet reference.");
		}
	}
	
}
