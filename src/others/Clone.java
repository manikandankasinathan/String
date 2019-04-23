package others;

public class Clone {
	String name;
	int age;
	Clone(String name,int age){
	this.name=name;
	this.age=age;
	}
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
		
	}
	
	public static void main(String args[]){
		
	try{
		Clone c1=new Clone("mani",36);
		Clone c2=(Clone)c1.clone();
		System.out.println("name annd ageis"  +"  "+c1.age+"  "+c1.name);
		System.out.println("name annd ageis"  +c2.age+""+c2.name);
		
	}
	catch(Exception e){}
}
}



