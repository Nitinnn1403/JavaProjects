package com.darshan;

abstract class BankAccount{
	abstract void calculateIntrest();
	
	public void showBalance() {
		System.out.println("Showing Balance");
	}
}
class SavingAccount extends BankAccount{
	public void calculateIntrest() {
		System.out.println("Intrest For Saving Account is 4%");
	}
}
class FixedDepositAccount extends BankAccount{
	public void calculateIntrest() {
		System.out.println("Intrest For Fixed Deposit is 6.9%");
	}
}
public class BankSimulation {

	public static void main(String[] args) {
		BankAccount acc1=new SavingAccount();
		BankAccount acc2=new FixedDepositAccount();
		
		acc1.showBalance();
		acc1.calculateIntrest();
		
		acc2.showBalance();
		acc2.calculateIntrest();
	}

}
