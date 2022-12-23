package com.tns.framework;

public abstract class ShopAcc 
{
	protected int actNo;
	protected String accNm;
	protected float charges;
	
	public ShopAcc(int actNo, String accNm, float charges) {
		super();
		this.actNo = actNo;
		this.accNm = accNm;
		this.charges = charges;
	}
	public void bookProduct(float charges)
	{
		
	}
	public void items(float charges)
	{
		
	}
	@Override
	public String toString() {
		return "ShopAcc [actNo=" + actNo + ", accNm=" + accNm + ", charges=" + charges + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
