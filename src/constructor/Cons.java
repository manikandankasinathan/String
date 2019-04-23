package constructor;

public class Cons {
	
	int id;
	String name;
	Cons(int i,String n)
	{
		id=i;
		name=n;
	}
Cons(Cons c)
{
	id=c.id;
	name=c.name;
}
void display()
{
	System.out.println(id+ " "+name);
}

public static void main(String[] args)
{
	Cons c1=new Cons(1,"mani");
	Cons c2=new Cons(c1);
	c1.display();
	c2.display();
}
}
