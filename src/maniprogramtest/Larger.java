package maniprogramtest;

import java.util.Arrays;

public class Larger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp;
		int[] arr={10,20,30,40,50};

		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;i<arr.length;j++)
			{
				if(arr[i]>arr[j])
						{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
						
						Arrays.sort(arr);
						System.out.println("Arrays of:"  +Arrays.toString(arr));
						}
		

	}

}
		System.out.println(arr[arr.length-2]);
	}
}
