package com.tns.application;

import com.tns.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc
{
   public MMSavingAcc(int accNo, String accNm, float accBal) {
		super(accNo, accNm, accBal);
		// TODO Auto-generated constructor stub
	}


void Withdraw(float accBal)
   {
	   
   }

@Override
public String toString() {
	return "MMSavingAcc [isSalary=" + isSalary + ", accNo=" + accNo + ", accNm=" + accNm + ", accBal=" + accBal
			+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
}
}
