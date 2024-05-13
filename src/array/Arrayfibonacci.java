package array;

public class Arrayfibonacci {

	public static void main(String[] args) {
		int ar[]=new int[10];
		ar[0]=0;
	    ar[1]=1;
		
		for (int i=2;i<10;i++)
		{
			ar[i]=ar[0]+ar[1];
			ar[0]=ar[1];
			ar[1]=ar[i];
		}
		for(int i=0;i<10;i++)
			
		{
			System.out.print(ar[i]+" ");
		}

	}

}
