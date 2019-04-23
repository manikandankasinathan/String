package hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;

public class Book {
	
	int id;
	String name,author,publisher;
	int quantity;
	
	 Book(int id,String name,String author,String publisher,int quantity)
	{
		this.id=id;
		this.author=author;
		this.publisher=publisher;
		this.quantity=quantity;
	}

		public static void main(String aregs[])
		{
			HashMap<Integer,Book>map=new HashMap<Integer,Book>();
			Book b1=new Book(101,"thuthui","mani","kila",2);
			Book b2=new Book(102,"danda","mani","kila",2);
			map.put(1, b1);
			map.put(2, b2);
	
for(Entry<Integer,Book> e:map.entrySet())
{
	 int key=e.getKey();  
     Book b=e.getValue();  
     System.out.println(key+" Details:");  
     System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
   
}
	
	
		}
}
