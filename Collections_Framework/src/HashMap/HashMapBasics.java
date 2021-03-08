package HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//No indexing order
		// Store values - key value
		//no duplicate key
		//can store null values but only one null key
		//Hashmap is not thread safe
		
		
		
		
		HashMap<String,String> capitalmap = new HashMap<String,String>();
		capitalmap.put("India", "New Delhi");
		capitalmap.put("USA", "Washington");
		capitalmap.put("UK", "London");
		capitalmap.put("UK", "London11");
		capitalmap.put(null, "Berlin");
		capitalmap.put(null, "London");
		capitalmap.put("Russia", null);
		capitalmap.put("South Africa", null);
		capitalmap.remove("Russia");
		
		System.out.println(capitalmap.get("UK"));
		System.out.println(capitalmap.get(null));
//		System.out.println(capitalmap.get("Russia"));
//		System.out.println(capitalmap.get("South Africa"));
		
		//Iterator : over the set keys: keys
		
		Iterator<String> it = capitalmap.keySet().iterator();
		
		while(it.hasNext())
		{
			String key = it.next();
			String value = capitalmap.get(key);
			System.out.println("Key is ->"+key+ "value is ->"+value);
			
		}
		
		
		//Set : giving results in pair over the entry pair, entry set
		
		Iterator <Entry<String, String>> it1 = capitalmap.entrySet().iterator();
        while(it.hasNext())
     {
	  Entry<String,String> entry =  it1.next();
	  System.out.println("key is "+entry.getKey()+"value is "+entry.getValue());
     }
        
        //Iterator java 8 for each & lambda
        
        
        capitalmap.forEach((k,v)-> System.out.println("key is "+k+"value is "+v));
	}
	
	

}
