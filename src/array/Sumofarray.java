package array;

import java.util.Scanner;

public class Sumofarray {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int[] ar = new int[5];
		System.out.println("enter numbers");
		int sum=0;
		for (int i=0;i<5;i++)
		{
			ar[i]=sc.nextInt();
			 sum=sum+ar[i];
		}
		
		
		System.out.println("sum="+sum);
		
		
		

	}

}
