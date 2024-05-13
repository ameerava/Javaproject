package packages;

public class Swap {

	public static void main(String[] args) {
		int a=10,b=20;
		System.out.println("a="+a +",b="+b);
		int temp=a;
		a=b;
		b=temp;
		System.out.println("a="+a+ ",b="+b );

		//without variable
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a="+a+ ",b="+b);
		
		
	}

}
