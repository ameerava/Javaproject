package controlstatements;

public class Switchcalculator {

	public static void main(String[] args) {
		int a=1,b=2;
		int operation = 1;
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
