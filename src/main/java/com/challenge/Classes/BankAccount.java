package com.challenge.Classes;

public class BankAccount {
	private String accountNumber;
	private double balance;
	private String customerName;
	private String eMail;
	private int phoneNumber;
	
	public BankAccount() {
		this("12345", 0.00, "Fahad","some@some.com", 123456789); //overloaded constructor was called using this
		System.out.println("This is empty constructor");		//if calling overloaded constructor, need to make sure
																//its the first line in the empty constructor
	}
	
	public BankAccount(String customerName, String eMail, int phoneNumber) {
		this ("99999", 50.0, customerName, eMail, phoneNumber);
		
	}

	public BankAccount (String accountNumber, double balance, String customerName, String eMail, int phoneNumber  ) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.customerName = customerName;
		this.eMail = eMail;
		this.phoneNumber = phoneNumber;
		System.out.println("constructor with parameters was called");
	}
	
	public void deposit(double depositV) {
		this.balance += depositV;
		System.out.println( depositV + " deposit. " + this.balance + " balance available");
	}
	
	public void withdraw(double withdraw) {
		if (this.balance -  withdraw < 0) {
			System.out.println( "Insufficient Funds " + this.balance + " balance available. withdraw will not get processed");
		} else {
			this.balance -= withdraw;
			System.out.println( withdraw + " Withdraw processed. " + this.balance + " balance available");
		}
		
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
}
