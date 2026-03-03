package logics;

public class ReverseEntireString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String iS =  "I  am  Rahul"; // luhaR  ma  I; op: "luhaR ma I"
		String[] sL = iS.split(" ");
		
		StringBuilder sbO = new StringBuilder();
		
		for(int i = sL.length - 1; i >= 0; i--) {
			//System.out.println(sb.toString());			
			sbO.append(getReverseString(sL[i]));
			if(i != 0) {
				sbO.append(" ");
			}
		}
		System.out.println(sbO.toString());
	}

	private static String getReverseString(String string) {
		// TODO Auto-generated method stub
		String reversedString = "";
		StringBuilder sb =  new StringBuilder();
		for(int i = string.length() -1; i >= 0; i--) {
			//reversedString += string.charAt(i); concatenation will create more string in string pool
			sb.append(string.charAt(i));
		}
		//return reversedString;
		return sb.toString();
	}

}
