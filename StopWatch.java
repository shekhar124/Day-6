package com.bl;

import java.util.Scanner;

public class StopWatch {

	public static void main(String[] args) {
		Scanner sanc = new Scanner(System.in);
		System.out.println("press any key and enter to start stop watch");
		String start = sanc.next();
		long startTime = System.currentTimeMillis();
		System.out.println("press any key and enter to stop the timer");
		String end = sanc.next();
		long stopTime = System.currentTimeMillis();
		long elapseTime = stopTime - startTime;
		System.out.println("Elapsed Time in millisecond is :" + elapseTime);
	}
}

