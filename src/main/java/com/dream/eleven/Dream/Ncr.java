package com.dream.eleven.Dream;
import java.math.BigInteger;

public class Ncr {

	
	
	// Java program To calculate 
	// The Value Of nCr 

	static BigInteger nCr(int n, int r) 
	{ 
		return fact(n).divide(fact(r).multiply(fact(n - r)));
	} 

	// Returns factorial of n 
	static BigInteger fact(int n) 
	{ 
		BigInteger res = new BigInteger("1"); 
		for (int i = 2; i <= n; i++) 
			res = res.multiply(BigInteger.valueOf(i));
		return res; 
	} 

	// Driver code 
	public static void main(String[] args) 
	{ 
		int n = 22, r = 11; 
		System.out.println(nCr(n, r)); 
	} 
	} 

