package core;

public class FactoryPatternDemoClass {
	public static FactoryPatternDemoInterface getType(int inputValue) {
		FactoryPatternDemoInterface factory = null;
		switch(inputValue) {
		case 1:
			factory = new FactoryPatternDemoImpClass1();
			break;
		case 2:
			factory = new FactoryPatternDemoImpClass2();
			break;
		default:
			throw new RuntimeException("Enter proper value to get the impl class.");
		}
		return factory;
		
	}
	
	public static FactoryPatternDemoInterface getType(String shape) {
		FactoryPatternDemoInterface factory = null;
		switch(shape) {
		case "1":
			factory = new FactoryPatternDemoImpClass1();
			break;
		case "2":
			factory = new FactoryPatternDemoImpClass2();
			break;
		default:
			throw new RuntimeException("Enter proper value to get the impl class.");
		}
		return factory;
		
	}

}
