package oops;

public class Methodoverloading {

	public static void main(String[] args) {
		Methodoverloading ob=new Methodoverloading();
		ob.add();
		ob.add(1.2, 4);
		ob.add(4, 2.88, 85);
		ob.add(56, 71.1);
		

	}
	
	public void add() {
	int a=4;
	int b=5;
	int c=a+b;
	System.out.println(c);
	}
	public void add(int a,double b, int c) {
		double d=a+b+c;
		System.out.println(d);
	}
	public void add (double a,int b) {
		double c=a+b;
		System.out.println(c);
	}
	public void add(int a, double b) {
		double c=a+b;
		System.out.println(c);
	}

}
