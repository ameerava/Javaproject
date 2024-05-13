package methods;

import java.util.Scanner;

public class Vowelcount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s=sc.next();
		int vowelcount=countvowels(s);
		System.out.println("vowels count: "+vowelcount);
		
		
	}
	public static int countvowels(String str)
	{
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=Character.toLowerCase(str.charAt(i));
			if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				count++;
				
			}
			
		}
		return count;
		
	}

}
