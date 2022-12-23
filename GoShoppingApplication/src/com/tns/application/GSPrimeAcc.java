package com.tns.application;

import com.tns.framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc
{
	private static final float charges=0;
  public GSPrimeAcc(int actNo, String accNm, float charges) {
		super(actNo, accNm, charges);
		// TODO Auto-generated constructor stub
	}
public void bookProduct(float charges)
{
	
}
@Override
public String toString() {
	return "GSPrimeAcc [actNo=" + actNo + ", accNm=" + accNm + ", charges=" + charges + ", toString()="
			+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
}

}
