package Arraylistconcepts;

import java.util.ArrayList;
import java.util.Arrays;

public class Arr_List_Pro {

	public static void main(String[] args) {

//Default generics could store all values as  boolean, string, integer etc
		
		ArrayList<Object> sr = new ArrayList<Object>();
		sr.add(true);
		sr.add(1);
		sr.add(12.33);
		sr.add("Priya");
		System.out.println(sr.get(2));
		System.out.println("Highest indesx"+(sr.size()-1));
		sr.add(110);
		sr.add(200);
		System.out.println(sr.size());
		//ArrayList are dynamic in nature
		
		ArrayList<Integer> numb = new ArrayList<Integer>(Arrays.asList(10,20,30,40));
		
	}

}
