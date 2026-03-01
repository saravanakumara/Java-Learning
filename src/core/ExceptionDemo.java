package core;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ExceptionDemo {
	
	//Checked or compile time exception extends Exception directly
	//Unchecked or runtime exception extends RuntimeException
	//Errors or Exceptions in Java and 
	//Throwable is a super class
	//throws - delegate the exception handling
	//throw - throw a new exception action
	//catch - catch the particular exception
	//main throws - JVM will close the app abruptly
	
	public void delegatedException() throws FileNotFoundException, IOException {
		checkedException();
		unCheckedException();
	}
	public void checkedException() { //exception handled at compile time
		try {
			File f =  new File("");
			FileInputStream fs = new FileInputStream(f);
			Properties pro = new Properties();
			pro.load(fs);
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println("No file");
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	public int unCheckedException() throws ArithmeticException { //runtime exception
		int i = 0, j = 10;
		return j/i;
	}
	
	//public static void main(String[] args) throws FileNotFoundException, IOException {//this still disrupt the code flow, need to handle at the main always
	public static void main(String[] args) {
		ExceptionDemo ed = new ExceptionDemo();
		try {
			ed.delegatedException(); //Handled exception here.
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("catched exception in main");
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			System.out.println("catched runtime exception in main");
		}
		
	}
}
