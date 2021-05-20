package com.linecomparison;


public class LineComparison {
	public static void main(String[] args) {
		System.out.println("Wecome To Line Comparison Problem");

		Line Line1 = new Line(4, 7, 10, 12);
		Line Line2 = new Line(5, 9, 11, 15);

		Double length1 = Length.calculateLength(Line1);
		Double length2 = Length.calculateLength(Line2);

		System.out.println(Equality.equalsTo(length1, length2));

		System.out.println(Comparison.compareTo(length1, length2));
	}
}

class Line {
	int x1;
	int y1;
	int x2;
	int y2;

	public Line(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}

}

class Length {
	public static Double calculateLength(Line line) {
		return Math.sqrt(Math.pow((line.x2 - line.x1), 2) + Math.pow((line.y2 - line.y1), 2));
	}
}

class Equality {
	public static String equalsTo(Double L1, Double L2) {
		boolean result = L1.equals(L2);
		if (result == true)
			return "Lines are Equal";
		else
			return "Lines are not Equal";
	}
}

class Comparison {
	public static String compareTo(Double L1, Double L2) {
		int result = L1.compareTo(L2);
		if (result < 0)
			return "Line 2 is greater than Line 1";
		else if (result > 0)
			return "Line 1 is greater than Line 2";
		else
			return "Lines are Equal";
	}
}