package com.tns.framework;

public abstract class CurrentAcc extends BankAcc
{
	
   public CurrentAcc(int accNo, String accNm, float accBal) {
		super(accNo, accNm, accBal);
		// TODO Auto-generated constructor stub
	}

protected float creditLimit;
   
   public void withdraw(float creditLimit)
   {
	   
   }

@Override
public String toString() {
	return "CurrentAcc [creditLimit=" + creditLimit + ", accNo=" + accNo + ", accNm=" + accNm + ", accBal=" + accBal
			+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
}
}
