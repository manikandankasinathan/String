package stringprevie;

public class Palindrome {
	
	public static void palin(int num)
	{
		int r=0;
		int sum=0;
		int t;
		t=num;
		while(num>=0)
			
			{
			r=num%10;//getremainder
			sum=(sum*10)+r;
			num=num/10;
			}
		if(t==sum){
			System.out.println("palindrome number");
		}
		else{
		System.out.println("not palindrome");
		
	}

}
	public static void main(String args[])
	{
		palin(121);
	}
}