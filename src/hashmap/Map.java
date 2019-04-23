package hashmap;

import java.util.HashMap;
import java.util.Map.Entry;

public class Map {
public static final String Entry = null;

public static void main(String args[])
{
	HashMap<Integer,String> map=new HashMap<Integer,String>();
	{
		map.put(1,"mani");
		map.put(2,"Surya");
		
		for(Entry<Integer, String> n:map.entrySet())
		{
			System.out.println(n.getKey()+" "+n.getValue());
		}
	}
	
}
}
