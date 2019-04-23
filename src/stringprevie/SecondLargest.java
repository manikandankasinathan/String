`package stringprevie;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int numbers[]={10,-24,50,-88,9999};

int largest=numbers[0];
int smallest=numbers[0];
for(int i=1;i<numbers.length;i++)
{
	if(numbers[i]>largest)
	{
		largest=numbers[i];
	}
	if(numbers[i]<smallest){
	smallest=numbers[i];
	}
}
System.out.println("number is:" +Arrays.toString(numbers));
System.out.println("largest is"+largest);
System.out.println("smmalest is"+smallest);
	}
}
