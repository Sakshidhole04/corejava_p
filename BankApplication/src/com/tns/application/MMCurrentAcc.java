package com.tns.application;

import com.tns.framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc
{
	public MMCurrentAcc(int accNo, String accNm, float accBal) {
		super(accNo, accNm, accBal);
		// TODO Auto-generated constructor stub
	}

	public void withdraw(float creditLimit)
	   {
		   
	   }

	@Override
	public String toString() {
		return "MMCurrentAcc [creditLimit=" + creditLimit + ", accNo=" + accNo + ", accNm=" + accNm + ", accBal="
				+ accBal + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
}
