package week1.day2;

public class Calculator {

	public int add(int a, int b) {
		return a + b;
	}

	public double subtract(double a, double b) {
		return a - b;
	}

	public double multiply(double a, double b) {
		return a * b;
	}

	public int divide(int a, int b) {
		return a / b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator calc = new Calculator();
		int num1 = 12, num2 = 6;
		double num3 = 5.6, num4 = 2.8;
		int sum = calc.add(num1, num2);
		double diff = calc.subtract(num3, num4);
		double mult = calc.multiply(num3, num4);
		int div = calc.divide(num1, num2);

		System.out.println("Sum of " + num1 + " and " + num2 + " is " + sum);
		System.out.println("Diff of " + num3 + " and " + num4 + " is " + diff);
		System.out.println("Product of " + num3 + " and " + num4 + " is " + mult);
		System.out.println("Divison of " + num1 + " and " + num2 + " is " + div);
	}

}
