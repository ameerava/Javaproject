package scannerpgm;

import java.util.Scanner;

public class Scannerdowhilecalculator {

	public static void main(String[] args) {

		int ch;
		
		do
		{
			Scanner sc= new Scanner(System.in);
			System.out.println("enter numbers");
			int a=sc.nextInt();
			int b=sc.nextInt();			
			System.out.println("enter choice");
			ch=sc.nextInt();
			switch (ch)
			{
		case 1:System.out.println("a+b="+(a+b));
		break;
		case 2:System.out.println("a-b="+(a-b));
		break;
		case 3:System.out.println("a*b="+(a*b));
		break;
		case 4:System.out.println("a/b="+(a/b));
		break;
			}
		}
		while (ch>0 && ch>=4);

	}

}
