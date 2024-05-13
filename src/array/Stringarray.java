package array;

import java.util.Scanner;

public class Stringarray {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter value");
		int n=sc.nextInt();
		
		String[] ar= new String[n];
System.out.println("enter string");

		for(int i=0;i<n;i++)
			
			
		{
			ar[i]=sc.next();
			}
		System.out.println("entered string is");
//		for(int i=0;i<n;i++)
	//	{
		// System.out.println(ar[i]);
	//	}
		
		for(String v:ar)           // for each loop, its size will automatically take the size of array
			System.out.println(v); 
	}
}

