package stringbuffer;

public class Student {
	int rollno;
	String name;
	String city;
	
	Student(int r,String n,String c)
	{
		rollno=r;
		name=n;
		city=c;
	}
	
	public String toString()
	{
		return rollno+" "+name+" "+city;
		
	}
	
	public static void main(String[] args) {
		Student s1=new Student(1,"mani","tn");
		Student s2=new Student(2,"mni","vdl");
		
		
		System.out.println(s1);
		System.out.println(s2);
	}

}
