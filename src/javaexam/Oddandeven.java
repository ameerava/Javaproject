package javaexam;

import java.util.Scanner;

public class Oddandeven {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter numbers");
		int[] ar=new int[10];
		for(int i=0;i<10;i++)
		{
			ar[i]=sc.nextInt();
		}
		System.out.println("even numbers are:");
		for(int i=0;i<10;i++)
			if(ar[i]%2==0) {
				System.out.println(ar[i]);
			}
		System.out.println("odd numbers are:");
		for(int i=0;i<10;i++)
			if(ar[i]%2!=0) {
		System.out.println(ar[i]);
			}
	}

}
