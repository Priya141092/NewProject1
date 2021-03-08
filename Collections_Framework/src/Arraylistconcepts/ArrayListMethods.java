package Arraylistconcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("Java");
		ar.add("python");
		ar.add("Mathematics");
		ar.add("English");
		
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("testing");
		ar2.add("concepts");
		
//		//ar.addAll(ar2);
//		
//		ar.addAll(2, ar2);
//		
//		System.out.println(ar);
//		ar.clear();//clear array list
//		System.out.println(ar);
		
		ArrayList<String> clonelist = (ArrayList<String>)ar.clone();
		System.out.println(clonelist);
		
		System.out.println(ar.contains("pyhton"));
		System.out.println(ar.indexOf("English")>0);
		
		ArrayList<String> list1 = new ArrayList<String>(Arrays.asList("nav","tom","yu","nav","te","nav"));
		int i = list1.lastIndexOf("nav");
		//in case object is not present it will return -1
		
		list1.remove(0);
		list1.remove("tom");
		
		ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		list2.removeIf(num -> num%2==0);
		System.out.println(list2);
		
		ArrayList<String> list3 = new ArrayList<String>(Arrays.asList("nav","tom","yu","nav","te","nav"));
		list3.retainAll(Collections.singleton("nav"));
		System.out.println(list3);
		
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14));
		
		ArrayList<Integer> sublist = new ArrayList<Integer>(numbers.subList(2, 6));//will exclude 6th value
		System.out.println(sublist);
		
		ArrayList<String> newlist = new ArrayList<String>(Arrays.asList("nav","tom","yu","nav","te","nav"));
		Object arr[] = newlist.toArray();
		System.out.println(Arrays.toString(arr));
		
		for(Object o : arr)
		{
			System.out.println((String)o);
		}
		
		
	}

}
