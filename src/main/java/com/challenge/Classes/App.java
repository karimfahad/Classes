package com.challenge.Classes;

/**
 * 1. Default return value is NULL for a class
 * and for String datatype because String datatype is 
 * also a class 
 * 2. setting values using BankAccount() constructor while initialization
 * 3. when we put name of the class after NEW keyword. java calls a special method to create the class
 * its objective is to create the object from the class
 * 4. constructor only have the access modifier and class name... 
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	BankAccount bankAccount = new BankAccount(); //BankAccount() 
    	//bankAccount.deposit(1000); 							//is a constructor which is automatically created by java					
    	System.out.println(bankAccount.getAccountNumber());
    	System.out.println(bankAccount.getBalance());
    	System.out.println(bankAccount.getCustomerName());
    	bankAccount.withdraw(500);
    	
    	bankAccount.deposit(50);
    	bankAccount.withdraw(100);
    	
    	bankAccount.deposit(51);
    	bankAccount.withdraw(100);
    		
    	BankAccount timAccount = new BankAccount("Tim", "tim@email,com", 123456789);
    	System.out.println("Print " + timAccount.getAccountNumber()+" "+ timAccount.getBalance()+" "+  timAccount.getCustomerName()+" "+  
    						timAccount.geteMail()+" "+ timAccount.getPhoneNumber());
    /*	int finalBalance = depositFunds(1000);
    	finalBalance = withdrawFunds(finalBalance, 1500);
    	System.out.println( "Final Balance = " +  finalBalance); */
    	
    }
    
    /* public static int depositFunds(int deposit) {
		
    	BankAccount bankAccount = new BankAccount();
    	bankAccount.setBalance(100);
    	int currentBalance = bankAccount.getBalance();
    	System.out.println( "Current Balance = " +  currentBalance);
    	int finalBalance = currentBalance + deposit;
    	System.out.println( "Final Balance = " +  finalBalance);
    	bankAccount.setBalance(finalBalance);
    	return finalBalance;
	}
    
    public static int withdrawFunds (int finalBalance, int withdraw) {
		
    	BankAccount bankAccount = new BankAccount();
    	
    	//bankAccount.setBalance(100);
    	//int currentBalance = bankAccount.getBalance();
    	System.out.println( "Final Balance = " +  finalBalance);
    	finalBalance = finalBalance - withdraw;
    	if (finalBalance < 0) {
    		System.out.println( "Insufficient Funds");
    	} else {
    		System.out.println( "Final Balance = " +  finalBalance);
        	bankAccount.setBalance(finalBalance);
 
    	}
       	return finalBalance;
    	
	} */
}
