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
		
		//String pool is now as part of Heap memory itself from Java 7.
		//JVM will check first the string literal is available in the pool or not and will use that reference.
		//new String("JAVA"), always create an object in the Heap and also "JAVA" string literal created in the pool if not available.
		//So now we have JAVA in pool as well in heap. both reference are different.
		//In Java, string literal and final identifier variable act as compile-time constants like
		String s = "A" + "B"; //or final string n = name + "Test"; 
		//Here compiler itself computes and add AB in the pool and s will point to the reference of pool memory
		//It will not wait for runtime computation. that is 
		String name1 = name + "Test";
		//This name1 will be computed during runtime only, so first it will check "Test" is already available on the pool 
		//Concat will create StringBuilder object internally and append the values, the reference is in Heap so name1 will reference to Heap object
		//But we can use intern() to check the string value available in the pool or not for String s2 = s1.intern(); this s2 will have reference of pool memory.
		
		//Final summary:
		//In Java, string literals (e.g., String s = "Test";) are stored in the String Pool, and if the same literal already exists, the JVM reuses the reference; 
		//using new String("Test") creates one object in the pool (for the literal "Test") and another separate object in the heap. 
		//The == operator compares references, while .equals() compares values, so always use .equals() for content comparison. 
		//Compile-time concatenation like "A" + "B" is optimized by the compiler into "AB" and stored in the pool, 
		//whereas runtime concatenation like part + "B" uses StringBuilder and creates a heap object. 
		//A final variable is treated as a compile-time constant only if it’s assigned a literal directly (not using new). 
		//The intern() method checks the pool: if the string exists, it returns the pooled reference; if not, in Java 7+ it adds the heap reference to the pool and returns it. 
		//Since Java 7, the String Pool is inside the heap, so pooled strings are also eligible for garbage collection if no references exist.
		
		//Using string literal
		String city = "CHE";
		
		//Using new
		String cityName = new String("TamilNadu"); //Don't use it unnecessarily
		
		//String is immutable, for security reasons this is designed.
		//File paths, URLs, Network connections are mentioned as strings, if it changed by someone that data will be lost, incorrect, corrupted. So that will cause big impact
		//If it is unchanged, multiple thread can access it and use it. So it can be shared with other threads.
		//String immutable is not allow to change the value of it once it is created
		//So string can be used to compute hashcode and it remains consistent, used in HashMap
		String originalStr = "Automation";
		String modifiedStr = originalStr.concat(" with Java.");
		System.out.println("Modified string - " + modifiedStr); //new string.
		System.out.println("Original string - " + originalStr); //original string is not modified.
		
		String city2 = "CHE";
		//city and city2 are pointing to the same memory location in pool area. if city==city2 return false;
		
		String namedStr = new String("Hello Java"); //"Hello Java" string is created in Pool area when class is loaded and heap object also created.
		String sameNamedStr = new String("Hello Java"); //Another heap object is created for this statement, but string pool will not create again the same string during class load
		//if nameStr==sameNamedStr will False as reference is different but value is same.
		//String literal is memory efficient.
		
		//Convert string to mutable? it is possible by StringBuffer and StringBuilder		
		StringBuilder sbd = new StringBuilder(); //It is not thread safe and fast compare to StringBuffer and used in single threaded environment
		sbd.append("Test");
		sbd.append("Java");
		String sbO = sbd.toString();
		System.out.println("StringBuilder: "+sbO);
		
		StringBuffer sbf = new StringBuffer(); //It is thread safe and slow compare to StringBuilder and can be used in multi thread environment
		sbf.append("Test");
		sbf.append("Java");
		String sbu = sbf.toString();
		System.out.println("StringBuffer: "+sbu);
		
		//String methods
		String m1 = " TTest".concat("World ");
		System.out.println("String m1 with space: " + m1);
		System.out.println("Trim both end: " + m1.trim());
		System.out.println("Convert to lower case: " + m1.toLowerCase());
		System.out.println("Convert to upper case: " + m1.toUpperCase());
		System.out.println("Get char of the character at start of the string m1: " + m1.charAt(1));
		System.out.println("Get length of the string m1: " + m1.length());
		System.out.println("Get last char of the string m1: " + m1.charAt(m1.length() - 2));
		System.out.println("Comparison with case string m1: " + m1.equals(" TTestWorld "));
		System.out.println("Comparison without case of the string m1: " + m1.equalsIgnoreCase(" TTestWorld "));
		System.out.println("Get first occurance index of the character from the string m1: " + m1.indexOf('T')); //First occurrence
		System.out.println("Get last occurance index of the character at start of the string m1: " + m1.lastIndexOf('t'));
		System.out.println("Get the substring of the string m1: " + m1.substring(1, m1.length() - 2)); //end index is exclusive & start is inclusive
		System.out.println("Replace all the occurrence of character in the string m1: " + m1.replace('T', 't'));
		System.out.println("Replace all the occurrence of character in the string m1 using RegX: " + m1.replaceAll("T", "t"));
	}
	
}
