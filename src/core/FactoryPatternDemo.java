package core;

public class FactoryPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FactoryPatternDemoInterface fI = FactoryPatternDemoClass.getType(1);
			fI.getType();
			
			FactoryPatternDemoInterface fII = FactoryPatternDemoClass.getType(2);
			fII.getType();
			
			FactoryPatternDemoInterface fI3 = FactoryPatternDemoClass.getType(3);
			fI3.getType();
			
			FactoryPatternDemoInterface fIs = FactoryPatternDemoClass.getType(1);
			fIs.getType();
			
			FactoryPatternDemoInterface fIIs = FactoryPatternDemoClass.getType(2);
			fIIs.getType();
			
			FactoryPatternDemoInterface fI3s = FactoryPatternDemoClass.getType(3);
			fI3s.getType();
			
		} catch (RuntimeException e) {
			System.out.println("Exception occurred, please fix it.");
		} finally {
			System.out.println("Finally executed always. It will override the final return value if any interger return type mentioned.");
		}
	}

}
