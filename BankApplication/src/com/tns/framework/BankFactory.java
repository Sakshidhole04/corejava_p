package com.tns.framework;

public abstract class BankFactory 
{
	public abstract SavingAcc getNewSavingAccount();
	public abstract CurrentAcc getNewCurrentAccount();
	

}
