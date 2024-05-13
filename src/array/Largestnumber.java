package array;

import java.util.Scanner;

public class Largestnumber {

	public static void main(String[] args) {
		System.out.println("enter numbers");
		int temp=0;
		int ar[]=new int[4];
		Scanner sc=new Scanner(System.in);
		
		for (int i=0;i<4;i++)
		{
			ar[i]=sc.nextInt();
			}
		for (int i=0;i<4;i++)
		{
			
			if (temp<ar[i])
			{
				temp=ar[i];
			}
		}
		System.out.println("largest number is " + temp);

	}

}
