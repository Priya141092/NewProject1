package Arraylistconcepts;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> stuname = new ArrayList<String>();
		stuname.add("tom");//0
		stuname.add("pria");//1
		stuname.add("saxena");//2
		stuname.add("amita");//3
		
		for(int i=0;i<stuname.size();i++)
		{
			System.out.println(stuname.get(i));
		}
		
		//For each loop
		
		for(String s:stuname)
		{
			System.out.println(s);
		}
		
      //JDK 8 //Streams with lambda
		stuname.stream().forEach(ele -> System.out.println(ele));
		
		//iterator
		 Iterator<String>it = stuname.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	
	}

}
