package maniprogramtest;

public class Dup1 {
	public static void main(String[] args) {
		
		int[] arr={10,10,20,20,30,30,50};
		for(int i=0;i<arr.length;i++)
			for(int j=i+1;i<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[i]);
				}
		}
		
	}
}

