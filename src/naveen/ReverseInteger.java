package naveen;

public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=12345;
		int r=0;
		while(num !=0)
		{
			r=r*10+num%10;
			num=num/10;
		}
System.out.println(r);
//2 method

long num1=12345;
System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
	}

}


