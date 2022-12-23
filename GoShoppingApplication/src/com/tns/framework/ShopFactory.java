package com.tns.framework;

public abstract class ShopFactory
{
	public abstract PrimeAcc getNewPrimeAccount(int AccNo,String accNo,float charges,boolean isPrime );
	public abstract NormalAcc getNormalAccount(int AccNo,String accNo,float charges,boolean isPrime,float deliveryCharges);

}
