package maniprogramtest;

public class Palin {
	
	public static void palin(int tnum)
	{
		int r=0;
		int sum=0;
		int t;
		t=tnum;
		
		while(tnum>=0)
		{
			r=tnum%10;
			sum=(sum*10)+r;
			tnum=tnum/10;
		}
		if(t==sum)
		{
			System.out.println("palindarome");
		}
	else
	{
		System.out.println("not palindrome");
	}
	}
public static void main(String args[])
{
	palin(121);
}

}
