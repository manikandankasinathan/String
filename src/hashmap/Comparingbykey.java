package hashmap;

import java.util.HashMap;

public class Comparingbykey {
	
	public static void main(String args[])
	{
		HashMap<Integer,String>map=new HashMap<Integer,String>();
		map.put(1, "one");
		map.put(2, "two");
		map.put(3,"zebra");
		map.put(4, "owl");
		
		map.entrySet().stream()
		.sorted(Map.Entry.comparingByKey())
		.for(System.out::println);
		
	}

}
