package jumpingstatements;

public class Reverseofnumber {

	public static void main(String[] args) {
		int n=2768;
				int rev=0,i;
				
				
			
				while (n>0)
				{
					i=n%10;
					rev=rev*10+i;
					n=n/10;
					
						
				}
				
			System.out.println(rev);	
				
				

	}

}
