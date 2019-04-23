package hashmap;

import java.util.ArrayList;
import java.util.List;

public class Bookobject {
int id;
String name,author,publisher;
int quantity;

public Bookobject(int id,String name,String author,String publisher,int quantity)
{
	this.id=id;
	this.name=name;
	this.author=author;
	this.publisher=publisher;
	this.quantity=quantity;
}
public static void main(String[] args) {
	List<Bookobject> l1=new ArrayList<Bookobject>();
	Bookobject b1=new Bookobject(1,"mani","suryapu","suryapiblisher",2);
	Bookobject b2=new Bookobject(2,"suji","suryapu","suryapiblisher",3);
	Bookobject b3=new Bookobject(3,"new","suryapu","suryapiblisher",4);
	l1.add(b1);
	l1.add(b2);
	l1.add(b3);
	
	for(Bookobject b:l1)
	{
		System.out.println(b.id+""+b.name+""+b.author+""+b.publisher+""+b.quantity);
	}
}
}
