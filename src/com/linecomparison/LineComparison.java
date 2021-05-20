package com.linecomparison;

import java.util.Scanner;

public class LineComparison {
	public static void main(String[] args) {
		System.out.println("Welcome To Line Comparison");
		
		System.out.println("Line 1");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter x1");
		int l1x1 = scanner.nextInt();
		System.out.println("Enter y1");
		int l1y1 = scanner.nextInt();
		System.out.println("Enter x2");
		int l1x2 = scanner.nextInt();
		System.out.println("Enter y2");
	    int l1y2 = scanner.nextInt();
		
	    Double length1 = Math.sqrt(Math.pow((l1x2 - l1x1), 2) + Math.pow((l1y2 - l1y1), 2));
		
		
	}

}
