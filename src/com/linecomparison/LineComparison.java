package com.linecomparison;

public class LineComparison {
	public static void main(String[] args) {
		System.out.println("Wecome To Line Comparison Problem");

		Line line1 = new Line(4, 6, 8, 12);
		Line line2 = new Line(4, 6, 8, 12);

		Double length1 = line1.Length(line1);
		Double length2 = line2.Length(line2);

		System.out.println(line1.equalsTo(length1, length2));

		System.out.println(line1.compareTo(length1, length2));
	}
}

