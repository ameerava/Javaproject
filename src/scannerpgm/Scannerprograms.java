package scannerpgm;

import java.util.Scanner;

public class Scannerprograms {

	public static void main(String[] args) {
	
		System.out.println("enter a number");
		Scanner sc=new Scanner(System.in);
		int a= sc.nextInt();
		int b=sc.nextInt();
		int sum=a+b;
		char c=sc.next().charAt(2);
		System.out.println("sum ="+sum);
		System.out.println("value="+c);

	}

}
