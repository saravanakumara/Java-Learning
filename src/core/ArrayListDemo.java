package core;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		//ArrayList is backed by dynamic array where the default size is 10 when first element is inserted.
		//It's size gets increased by 50% when the array reached the max size
		//Easy to read and add an element in it.
		//Add to last index - O(1)
		//Read by index - O(1)
		//Delete by index in the middle/first - O(n) as shifting required to update the element position
		//It is implemented List interface inturn Collection, Iterable, extends AbstractList.
		//Array references are stored in contiguous memory & values/objects are in heap
		//Allows duplicate values
		//Not thread-safe
		ArrayList<String> aL = new ArrayList<>();
// We can not access capacity directly as private.		
//		try {
//			Field field = ArrayList.class.getDeclaredField("elementData");
//			field.setAccessible(true);
//			for (int i = 1; i <= 20; i++) {
//	            aL.add("" + i);
//	            Object[] elementData = (Object[]) field.get(aL);
//	            System.out.println("Size: " + aL.size() +
//	                               " Capacity: " + elementData.length);
//	        }
//		} catch (NoSuchFieldException | SecurityException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
        
		aL.add("Test1");
		aL.add("Test2");
		aL.add("Test3");
		aL.add("Test4");
		aL.add("Test4");
		aL.add(null);
		aL.add(null);
		aL.add(null);
		aL.add(null);
		aL.add("Test10");
		aL.add("Test11");
		for(String s : aL) {
			System.out.println("before value: " + s);
		}
		System.out.println("ArrayList size is: " + aL.size());
		System.out.println("Get the 4th index value: " + aL.get(4));
		aL.remove(4);
		for(String s : aL) {
			System.out.println("after value: " + s);
		}
		System.out.println("ArrayList size is changed?: " + aL.size());
	}

}
