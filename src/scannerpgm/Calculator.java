package scannerpgm;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("operation");
		int operation=sc.nextInt();
		switch(operation)
		{
		case 1:System.out.println("a+b="+(a+b));
		break;
		case 2:System.out.println("a-b="+(a-b));
		break;
		case 3:System.out.println("a*b="+(a*b));
		break;
		case 4:System.out.println("a/b="+(a/b));
		break;
		default:System.out.println("invalid");
		}
	
	}

}
