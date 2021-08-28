package com.bl;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = scan.nextInt();
		int rev=0;
		while(num!=0) {
			rev=rev*1+num%10;
			num=num/10;
			
		}
		System.out.println(rev);

	}
}