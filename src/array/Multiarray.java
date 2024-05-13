package array;

import java.util.Scanner;

public class Multiarray {

	public static void main(String[] args) {
	
		int mul [][]=new int[2][3];
		System.out.println("enter numbers");
		Scanner sc=new Scanner(System.in);
		for (int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				mul[i][j]=sc.nextInt();
			}
		}
	//	for(int i=0;i<2;i++)
	//{
		//	for (int j=0;j<3;j++)
		
//		{
	//		System.out.print(mul[i][j] + " ");
		//}
		
	//	System.out.println();
		//}
		
		//by for each loop
		
		for(int v[]:mul)           //fetching first row data into single array
		{
			for(int v1:v)               //fetching array data into variable
			{
				System.out.print(v1+" ");           //print first row
			}
			System.out.println();                 //go to next line and process continous
		}
	}

}
