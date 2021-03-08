package Arraylistconcepts;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Synchronised_Array_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		List<String> names = Collections.synchronizedList(new ArrayList<String>());
		
		names.add("pri");
		names.add("saxena");
		
		//add, remove - we do not need explicit synchronization
		// to fetch/traverse avles of list - we have to use explicit synchronization
		
		synchronized(names)
		{
			Iterator<String> it = names.iterator();
			
			while(it.hasNext())
			{
				System.out.println(it.next());
			}
		}
		
		//2.copyonwritearraylist - its a class alreadt thread safe/synchronized
		CopyOnWriteArrayList<String> emplist = new CopyOnWriteArrayList<String>();
		emplist.add("pri");
		emplist.add("saxena");
		// We do not need any explicit  synchronozation
		

	}

}
