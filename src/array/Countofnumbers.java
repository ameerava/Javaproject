package array;

import java.util.Scanner;

public class Countofnumbers {

	public static void main(String[] args) {
		int a=0,b=0,c=0;
		int ar[]=new int[9];
		System.out.println("enter nmbers");
		Scanner sc=new Scanner (System.in);
		for (int i=0;i<9;i++)
		{
			ar[i]=sc.nextInt();
		}
		for(int i=0;i<9;i++) {
			
			if(ar[i]==0)
			{
				a++;
			}
			
			
			else if(ar[i]<0)
				{
					b++;
				}
			else
			{
				c++;
			}
			
				
			
	
			
			
		}
		System.out.println("zero count:" +a);
		System.out.println("negative count:" +b);
		System.out.println("positive count:" +c);
		

	}

}
