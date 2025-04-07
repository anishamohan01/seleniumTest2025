package course; 

public class Calculator {
	
	public int add(int x, int y) {
		System.out.println("Adding: " + x + " and " + y);
		return x + y;
	}
	public int subtract(int x, int y) {
		return x - y;
	}
	public int multiply(int x, int y) {
		return x * y;
	}
	public int divide(int x, int y) {
		return x / y;
	}
	
	
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		int result = calc.add(10, 9);
		System.out.println("Addition: " + result);
		
		result = calc.subtract(5, 3);
		System.out.println("Subtraction: " + result);
		
		result = calc.multiply(6, 4);
		System.out.println("Multiplication: " + result);
		
		result = calc.divide(24, 2);
		System.out.println("Division: " + result);

	}
	
	

}
