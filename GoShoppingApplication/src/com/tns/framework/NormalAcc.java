package com.tns.framework;

public abstract class NormalAcc extends ShopAcc
{
	public NormalAcc(int actNo, String accNm, float charges) {
		super(actNo, accNm, charges);
		// TODO Auto-generated constructor stub
	}
	float deliveryCharge;
	public void bookProduct(float deliveryCharges)
	{
		
	}
	@Override
	public String toString() {
		return "NormalAcc [deliveryCharge=" + deliveryCharge + ", actNo=" + actNo + ", accNm=" + accNm + ", charges="
				+ charges + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
}
