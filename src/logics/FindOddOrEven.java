package logics;

public class FindOddOrEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "1024";
		isOddOrEven(s);
	}

	private static void isOddOrEven(String s) {
		int in = Integer.parseInt(s);
		if((in & 1) == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
		
	}

}
