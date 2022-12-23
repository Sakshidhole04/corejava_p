package com.tns.application;

import com.tns.framework.NormalAcc;

public class GSNormalAcc extends NormalAcc
{

	public GSNormalAcc(int actNo, String accNm, float charges, float deliveryCharge) {
		super(actNo, accNm, charges);
		// TODO Auto-generated constructor stub
	}
	public void bookProduct(float charges)
	{
		
	}
	@Override
	public String toString() {
		return "GSNormalAcc [actNo=" + actNo + ", accNm=" + accNm + ", charges=" + charges + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	}
