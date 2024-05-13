package oops;

import java.util.Scanner;

interface Pet{
	public void breed();
	public void price();
	public void order();
	
}
class cat implements Pet{
    
	Scanner sc=new Scanner(System.in);
	String Breedname=sc.next();
	int persiancat=4;
	int normalcat=2;
	@Override
	public void breed() {
		System.out.println("Available breeds are "+Breedname);
	}

	@Override
	public void price() {
		System.out.println("Persian cat:1000"+"Normal cat:500");
	}

	
	@Override
	public void order() {
		Scanner sc1=new Scanner(System.in);
		String catorder=sc1.next();
		int a=sc1.nextInt();
		int b=sc1.nextInt();
		if(catorder=="persiancat")
		{
			if(a<=persiancat) {
				System.out.println("order available");
			}
			else {
				System.out.println("not available");
			}
		}
			else if(catorder=="normalcat") {
				if(b<=normalcat) {
					System.out.println("order available");
				}
				else {
					System.out.println("not available");
				}
			}
			else {
				System.out.println("breed unavailable");
		}
		
	}
	


public class Petshop {

	public static void main(String[] args) {
		cat ob=new cat();
		ob.breed();
		ob.order();
		ob.price();
	}
	
		
	}

}



