package stringprevie;

import java.util.Arrays;

public class Largest {
	public static void main(String args[])
	{
		int temp,size;
		int[] arr={10,20,30,40,50};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
					/*Arrays.sort(arr);
				      System.out.println("sorted Array ::"+Arrays.toString(arr));*/

				}
			}
		
		
	}
System.out.println("largest no is" +arr[arr.length-2]);
}
}


/*import java.util.Arrays;
public class LargestNumberSample {
   public static void main(String args[]){
      int array[] = {10, 20, 25, 63, 96, 57};
      int size = array.length;
      Arrays.sort(array);
      System.out.println("sorted Array ::"+Arrays.toString(array));
      int max = array[size-3];
      System.out.println("3rd largest element is :"+max);
   }
}*/
