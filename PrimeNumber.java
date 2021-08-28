package com.bl;

import java.util.Scanner;

    public class PrimeNumber {
	public static void main(String[] args) {
		int number;
		boolean isPrime=true;
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter any number:");
		int num=scan.nextInt();
	        scan.close();
		for(int i=2;i<=num/2;i++)
		{
	           number=num%i;
		   if(number==0)
		   {
		      isPrime=false;
		      break;
		   }
		}
		
		if(isPrime)
		   System.out.println(" Yes the number Prime Number  :" + num);
		else
		   System.out.println(num + " number is not a Prime Number");
	   
	}

}


