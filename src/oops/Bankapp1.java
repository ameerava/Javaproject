package oops;

import java.util.Scanner;

interface Bankapp{
	public void accountno();
	public void balance();
	public void deposit();
	public void withdrawalamount();
	
	
}
class Federalbank implements Bankapp {
	
	int accountno;
	int balance=5000;
	Scanner sc=new Scanner(System.in);
	

	@Override
	public void accountno() {
		
		accountno=sc.nextInt();
	System.out.println("account no is "+accountno);
	}

	@Override
	public void balance() {
		
		System.out.println("balance is "+balance);
	}

	@Override
	public void deposit() {
		
		int amount=sc.nextInt();
		System.out.println("deposited amount is "+ amount);
		balance=balance+amount;
		System.out.println("balance is "+balance);
	}

	@Override
	public void withdrawalamount() {
		
		int withdrawal = sc.nextInt();
		System.out.println("withdrawal amount is" +withdrawal);
		if(balance>withdrawal) {
			balance=balance-withdrawal;
			System.out.println("balance is "+balance);
	}
		else {
			System.out.println("insufficient balance");

	}
	
}
}


public class Bankapp1 {

	public static void main(String[] args) {
		Federalbank ob=new Federalbank();
		System.out.println("enter account no");
				ob.accountno();
		ob.balance();
		System.out.println("enter deposited amount");
		ob.deposit();
		System.out.println("enter withdrawal amount");
		ob.withdrawalamount();
	}

}
