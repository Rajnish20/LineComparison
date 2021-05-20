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

		System.out.println("Line 2");
		System.out.println("Enter x1");
		int l2x1 = scanner.nextInt();
		System.out.println("Enter y1");
		int l2y1 = scanner.nextInt();
		System.out.println("Enter x2");
		int l2x2 = scanner.nextInt();
		System.out.println("Enter y2");
		int l2y2 = scanner.nextInt();

		Double length2 = Math.sqrt(Math.pow((l2x2 - l2x1), 2) + Math.pow((l2y2 - l2y1), 2));

		boolean isEqual = length1.equals(length2);
		if (isEqual == true)
			System.out.println("Lines are Equal");
		else
			System.out.println("Lines are not Equal");
		
		int result = length1.compareTo(length2);
		if(result < 0)
			System.out.println("Line 2 is greater than Line 1");
		else
			System.out.println("Line 1 is greater than Line 2");

	}

}
