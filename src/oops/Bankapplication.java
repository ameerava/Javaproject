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

public class Bankapplication {

	public static void main(String[] args) {
		Federalbank ob=new Federalbank();
		System.out.println("enter your choice 1.accountdetails 2.balance 3.deposit 4.withdrawal");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("account details ");
			ob.accountno();
		case 2:
			System.out.println("balance is ");
			ob.balance();
		case 3:
			System.out.println("deposit amount is ");
			ob.deposit();
		case 4:
			System.out.println("withdrawal amount is ");
			ob.withdrawalamount();
			default:
				System.out.println("invaid choice");
		}
		
		
		
		
		
		
	
	}

}

