package maniprogramtest;

public class Primenumbers {
	public static void main(String args[])
	{
	//int i=0;
		int num=0;
		String primemnumbers ="";
		for(int i=1;i<100;i++)
		{
			int counter=0;
			for(num=i;num>=1;num--)
			{
				if(i%num==0)
				{
					counter=counter + 1;
				}
			}
		if(counter==2)
		{
			primemnumbers=primemnumbers+i+" ";
		}
	}
		System.out.println(primemnumbers);

}
}