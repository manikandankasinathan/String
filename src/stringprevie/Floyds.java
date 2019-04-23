package stringprevie;

import java.util.Scanner;

public class Floyds {
public static void main(String args[])
{
	//int rows=5;
    System.out.println("How many rows you want in Floyd's Triangle?");
	int rows=4;
    
    /*Scanner sc = new Scanner(System.in);
    
    int Rows = sc.nextInt();
    */
	int value=0;
	for(int i=1;i<=rows;i++)
	{
		for(int j=1;j<=i;j++)
		{
			 System.out.print(value+"\t");
			value++;
		}
        System.out.println();
	}
	
}
}
