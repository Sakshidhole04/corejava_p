package com.tns.framework;

public abstract class PrimeAcc extends ShopAcc
{
	public PrimeAcc(int actNo, String accNm, float charges) {
		super(actNo, accNm, charges);
		// TODO Auto-generated constructor stub
	}
	private boolean isPrime;
	public void bookProduct(float charges)
	{
		
	}
	@Override
	public String toString() {
		return "PrimeAcc [isPrime=" + isPrime + ", actNo=" + actNo + ", accNm=" + accNm + ", charges=" + charges
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}

}
