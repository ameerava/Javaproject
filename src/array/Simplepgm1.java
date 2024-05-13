package array;

import java.util.Scanner;

public class Simplepgm1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter numbers");
		int[] ar=new int[3] ;
		
		for(int i=0;i<3;i++)
		{
			ar[i]=sc.nextInt();
		}
		System.out.println("entered numers=");
		for (int v:ar)
			System.out.println(v);
 

         
	}

}
