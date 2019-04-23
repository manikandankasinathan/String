package stringprevie;

import java.util.ArrayList;

public class Functions {
	
	public static void main(String args[])
	{
		Functions fn=new Functions();
		String country=fn.countrynames("bangalore");
		System.out.println(country);
		int add=fn.sum(10,20);
		System.out.println(add);
		int[] maks=fn.getmarks();
        System.out.println(maks);
	}
	
	public void test()
	{
		System.out.println("System generated");
		
	}
	
	public int sum(int i, int j)
	{
		int a=10;
		int b=20;
		int c=a+b;
		return c;
		}
	public ArrayList<String> getstudentlist()
	{
		
		ArrayList<String> std=new ArrayList<String>();
		std.add("mani");
		std.add("surya");
		std.add("sujji");
		std.add("Moni");
		return std;
	}
	
	public int[] getmarks()
	{
		int marks[]=new int[3];
		marks[0]=10;
		marks[1]=20;
		marks[2]=30;
	return marks;
	}

public String countrynames(String Cityname)
{
	if(Cityname.equals("cuddlaore"))
			{
		return "india"+Cityname;
			}
	return Cityname +"country will be added later";
		
			
}
}