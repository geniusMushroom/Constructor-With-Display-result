package com.iSoftware.BankCustomer.Bank;

class BankCustomer {

	// Properties
	int custAcctNumber;
	String accountType;
	float custAcctBalance;

	/**
	 * Default Constructor for BankCustomer
	 * 
	 */

	public BankCustomer() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Parameterized constructor
	 * 
	 * @param custAcctNumber;
	 * @param AccountType;
	 * @param custAcctBalance
	 */
	public BankCustomer(int custAcctNumber, String AccountType, float custAcctBalance) {
		this.custAcctNumber = custAcctNumber;
		this.accountType = AccountType;
		this.custAcctBalance = custAcctBalance;

	}

	// Functionality

	int getAccountNumber() {
		return custAcctNumber;
	}

	String getAccountType() {
		return accountType;
	}

	float getCustBalance() {
		return custAcctBalance;
	}

	/**
	 * This method is going to check the monthly minimum deposit
	 * 
	 * @param month
	 * @return
	 */
	int getMinimumDeposit(String month) {

		return 100;
	}

	// Main
	public static void main(String[] args) {

		BankCustomer vladimirAccount = new BankCustomer(0001, "Checking", 900.00f);

		System.out.println("Vladimir Putin Account Details");
		System.out.println(vladimirAccount.custAcctNumber);
		System.out.println(vladimirAccount.accountType);
		System.out.println(vladimirAccount.custAcctBalance);

		BankCustomer trumpAcct = new BankCustomer(0002, "Saving", 500.00f);
		System.out.println("Donald Trump Account Details");
		System.out.println(trumpAcct.custAcctNumber);
		System.out.println(trumpAcct.accountType);
		System.out.println(trumpAcct.custAcctBalance);

		BankCustomer modiAcct = new BankCustomer(0003, "Saving", 5000.00f);
		System.out.println("Narendra Modi Account Details");
		System.out.println(modiAcct.custAcctNumber);
		System.out.println(modiAcct.accountType);
		System.out.println(modiAcct.custAcctBalance);
	}
}