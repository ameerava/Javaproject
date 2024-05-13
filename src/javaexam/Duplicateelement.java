package javaexam;

import java.util.Scanner;

public class Duplicateelement {

	public static void main(String[] args) {
		System.out.println("enter numbers");
		Scanner sc=new Scanner(System.in);
		int[] ar=new int[10];
		for(int i=0;i<10;i++)
		{
			ar[i]=sc.nextInt();
		}
		System.out.println("dupilcate elements are:");
		for(int i=0;i<9;i++)
		{
			for(int j=i+1;j<10;j++)
			{
				if(ar[i]==ar[j])
				{
					System.out.print(ar[j]+" ");
				}
			}
		}
	}

}
