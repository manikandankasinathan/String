package maniprogramtest;

public class Maniprimetest {

public static boolean prime(int num)
{
	if(num<=1)
	{
		return false;
	}
for(int i=2;i<num;i++)
{
	if(num % i==0)
	{
		return false;
	}
}
	return true;
}

public static void main(String args[])
{
	System.out.print(prime(3));
}

}

