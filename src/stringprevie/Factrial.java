package stringprevie;

public class Factrial {
 public static int fact(int n)
 {
	 int fact=1;
for(int i=1;i<=n;i++)
{
	fact=fact*i;
}
return fact;
 }
	public static void main(String[] args) {
		System.out.print(fact(5));
		
		// TODO Auto-generated method stub

	}

}


