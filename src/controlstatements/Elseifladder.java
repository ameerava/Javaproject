package controlstatements;

public class Elseifladder {

	public static void main(String[] args) {
		int a=4,b=8,c=10;
				if(a>b && a>c)
				{
					System.out.println("a is bigger");
				}
				else if(b>a && b>c)
				{
					System.out.println("b is bigger");
				}
				else
				{
					System.out.println("c is bigger");
				}
	}

}
