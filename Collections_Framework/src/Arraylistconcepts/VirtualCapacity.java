package Arraylistconcepts;

import java.util.ArrayList;

public class VirtualCapacity {

	public static void main(String[] args) {
		
		
		//default capacity is 10 i .e virtual capacity
		
		ArrayList<Object> ar = new ArrayList<Object>(20);//virtual capacity
		System.out.println(ar.size());//PC=0
		ar.add(100);
		System.out.println(ar.size());//PC=1
	}

}
