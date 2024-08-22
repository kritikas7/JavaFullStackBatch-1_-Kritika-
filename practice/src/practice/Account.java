package practice;

public class Account {
	int acNumber;
	String name;
	double balance;
	Account(){
		acNumber=999;
		name="bankUser";
		balance=1000;
	}
	public Account(int acNumber, String name, double balance){
		this.acNumber=acNumber;
		this.name=name;
		this.balance=balance;
	}
	
	void deposit(int amt) {
		balance+=amt;
	}
	double withdraw(int amt) {
		balance-=amt;
		return balance;
	}
	double getBalance(int amt) {
		return balance;
	}}
