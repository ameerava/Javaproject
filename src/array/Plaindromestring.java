package array;

import java.util.Scanner;

public class Plaindromestring {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String s=sc.next();
		String rev="";
		//to reverse
		for(int i=s.length()-1;i<=0;i--)
		{
			rev=rev+s.charAt(i);            //first we get the last char of string
		}
		
		if(s.equals(rev))                //check
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
		
		
		
		
		
		
		
		

	}

}
