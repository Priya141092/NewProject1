package Arraylistconcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Removeduplicateelementsofarraylist {

	public static void main(String[] args) {
		
		ArrayList<Integer>  numbers = new ArrayList<Integer>(Arrays.asList(1,2,2,2,3,3,4,4,5,5,6,6));
		//Linked hash set to remove duplicate elemnents
		
		LinkedHashSet<Integer> linkedhashset = new LinkedHashSet<Integer>(numbers);
		ArrayList<Integer>  numbers2 = new ArrayList<Integer>(linkedhashset);
		
		System.out.println(numbers2);
		
		ArrayList<Integer>  numberslist = new ArrayList<Integer>(Arrays.asList(1,2,2,2,3,3,4,4,5,5,6,6));
		List<Integer> numberslist2 = numberslist.stream().distinct().collect(Collectors.toList());
		System.out.println(numberslist2);
		
		

	}

}
