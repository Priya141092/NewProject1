package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class HashMapCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		
		map1.put(1, "A");
		map1.put(2, "B");
		map1.put(3, "C");
		
		
	   HashMap<Integer, String> map2 = new HashMap<Integer, String>();
	   map2.put(3,"C");
	   map2.put(1,"A");
	   map2.put(2,"B");
	   
	   HashMap<Integer, String> map3 = new HashMap<Integer, String>();
	   map3.put(1,"A");
	   map3.put(2,"B");
	   map3.put(3,"C");
	   map3.put(3,"C");
	   
	   //.On te basi sof key vaalue pairs
	   
	   System.out.println(map1.equals(map2));
	   
	   
	   //Compare 2 hashmaps with the same key
	   
	   System.out.println(map1.keySet().equals(map2.keySet()));//true
	   System.out.println(map1.keySet().equals(map3.keySet()));//true
	   
	   //find out the extra key
	   HashMap<Integer, String> map4 = new HashMap<Integer, String>();
	   map4.put(1,"A");
	   map4.put(2,"B");
	   map4.put(3,"C");
	   map4.put(4,"D");
	   
	   //combine keys from boths maps using Hashset
	   HashSet<Integer> combinekeys = new HashSet<Integer>(map1.keySet());
	   combinekeys.addAll(map4.keySet());
	   combinekeys.removeAll(map1.keySet());
	   System.out.println(combinekeys);
	   
	   //Compare maps by values
	   HashMap<Integer, String> map5 = new HashMap<Integer, String>();
		
	   map5.put(1, "A");
	   map5.put(2, "B");
	   map5.put(3, "C");
		
		
	   HashMap<Integer, String> map6 = new HashMap<Integer, String>();
	   map6.put(4,"A");
	   map6.put(5,"B");
	   map6.put(6,"C");
	   
	   HashMap<Integer, String> map7 = new HashMap<Integer, String>();
	   map7.put(1,"A");
	   map7.put(2,"B");
	   map7.put(3,"C");
	   map7.put(4,"C");
	   
	   //duplicates are not allowed
	   System.out.println(new ArrayList<>(map5.values()).equals(new ArrayList<>(map6.values())));
	   
	   //duplicate are allowed
	   
	   //use hashset
	   System.out.println(new HashSet<>(map5.values()).equals(new HashSet<>(map7.values())));
	   

	}

}
