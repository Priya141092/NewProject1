package Arraylistconcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Sort and then equals
		
     ArrayList<String> l1 = new ArrayList<String>(Arrays.asList("A","B","D","C","F")); 
     ArrayList<String> l2 = new ArrayList<String>(Arrays.asList("A","B","D","C","E"));  
     ArrayList<String> l3 = new ArrayList<String>(Arrays.asList("A","B","D","C","E"));
     
     Collections.sort(l1);
     Collections.sort(l2);
     
     System.out.println(l1.equals(l2));
     Collections.sort(l3);
     System.out.println(l2.equals(l3));
     
     //2.Compare 2 lists and find out the additional element
     ArrayList<String> l4 = new ArrayList<String>(Arrays.asList("A","B","D","C","F")); 
     ArrayList<String> l5 = new ArrayList<String>(Arrays.asList("A","B","D","C","E"));
     
     l4.removeAll(l5);
     System.out.println(l4);//e
     
     //3.Finding out the missing elements
     
     l5.removeAll(l4);//f
     
     //4.find out the common elements
     
     ArrayList<String> l6 = new ArrayList<String>(Arrays.asList("A","B","D","C","F")); 
     ArrayList<String> l7 = new ArrayList<String>(Arrays.asList("A","B","D","C","E"));
     l6.retainAll(l7);
     
	}

}
