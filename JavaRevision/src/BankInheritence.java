class Account{
	private String accNo,name;
	private String address,phNo,dob;
	protected double balance;
	public Account(String accNo,String name){
		this.accNo=accNo;
		this.name=name;
	}  
	public String getAccNo() {
		return accNo;
		
	}
	
	public double getBalance() {
		return balance;
	}

	
	public String getName() {
		return name;
	}
	public void setName(String namee) {
		name=namee;
	}
	public void setAddress(String addresss) {
		address=addresss;
		
	}	
	public void setPhoneNo(String phoneNoo) {
		phNo=phoneNoo;
	}	
	public void setDob(String dobb) {
		dob=dobb;
	}
	public String getAddress() {return address;}
	public String getPhoneNo() {return phNo;}
	public String getDob() {return dob;}
} 

class SavingsAccount extends Account{
	private String type;
	private double fixedDeposit;
	
	public SavingsAccount(String accNo, String name,String type) {
		super(accNo, name);
		// TODO Auto-generated constructor stub
		this.type=type;
	}
	public void deposit(double n) {
		balance+=n;
	}
	public void withdraw(double x) {
		balance-=x;
	}
	public double getFixedDeposit() {
		return fixedDeposit;
	}
	public void setFixedDeposit(double n) {
		fixedDeposit=n;
	}
	public void liquidate() {
		fixedDeposit=0;
		System.out.println("Your fixed deposit has been successfully liquidated.");
	}

}
class LoanAccount extends Account{
	private double currDue;
	private String type;
	public LoanAccount(String accNo,String name,String type) {
		super(accNo,name);
		this.type=type;
		
	}
}

public class BankInheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
