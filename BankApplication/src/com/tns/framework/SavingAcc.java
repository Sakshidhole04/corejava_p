package com.tns.framework;

public abstract class SavingAcc extends BankAcc
{
	public SavingAcc(int accNo, String accNm, float accBal) {
		super(accNo, accNm, accBal);
		// TODO Auto-generated constructor stub
	}

	protected boolean isSalary;
	
	public void withdraw(float accBal)
	{
		
	}

	@Override
	public String toString() {
		return "SavingAcc [isSalary=" + isSalary + ", accNo=" + accNo + ", accNm=" + accNm + ", accBal=" + accBal
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}

}
