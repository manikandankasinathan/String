package stringprevie;

public class Primenumbers {
	public static void main(String args[])
	{
 int temp=0;
	int no=7;
	
	for(int i=2;i<=no-1;i++)
	{
		if(no%i==0)
		{
			temp=temp+1;
		}
	}
	if(temp==0)
			{
		System.out.println("no is prime");
			}
	else
	{
		System.out.print("not prime");
	}
}
}
