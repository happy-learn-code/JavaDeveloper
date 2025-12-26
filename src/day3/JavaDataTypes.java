package day3;

public class JavaDataTypes {

	public static void main(String[] args) {
		JavaDataTypes demo = new JavaDataTypes();

		demo.displayDataTypes();
		//demo.demonstrateTypeCasting();
		//demo.showWrapperClasses();
		//demo.demonstrateAutoboxingUnboxing();
		//demo.displayTypeLimits();
		//demo.demonstrateTypeConversion();
		//demo.showCharAndBoolean();
		//demo.demonstrateArithmeticOperations();
		//demo.demonstrateIncrementDecrement();
		//demo.demonstrateCompoundAssignments();
		//demo.demonstrateRelationalOperators();
		//demo.demonstrateLogicalOperators();
		//demo.demonstrateBitwiseOperators();
		//demo.demonstrateTernaryOperator();
		//demo.demonstrateStringConversion();
		//demo.demonstrateParsingStrings();
		//demo.demonstrateMathClass();
		//demo.demonstrateFinalKeyword();

	}

	private void displayDataTypes() {
		byte byteVar = 100;
		short shortVar = 10000;
		int intVar = 100000;
		long longVar = 100000L;
		float floatVar = 10.5f;
		double doubleVar = 20.99;
		char charVar = 'A';
		boolean boolVar = true;

		System.out.println("Byte Value: " + byteVar);
		System.out.println("Short Value: " + shortVar);
		System.out.println("Integer Value: " + intVar);
		System.out.println("Long Value: " + longVar);
		System.out.println("Float Value: " + floatVar);
		System.out.println("Double Value: " + doubleVar);
		System.out.println("Character Value: " + charVar);
		System.out.println("Boolean Value: " + boolVar);
	}

	private void demonstrateTypeCasting() {
		int intVar = 100;
		double doubleVar = intVar; // Implicit casting

		System.out.println("Implicitly casted double value: " + doubleVar);

		double anotherDoubleVar = 9.78;
		int anotherIntVar = (int) anotherDoubleVar; // Explicit casting

		System.out.println("Explicitly casted integer value: " + anotherIntVar);
	}

	private void showWrapperClasses() {
		Integer intObj = Integer.valueOf(100);
		Double doubleObj = Double.valueOf(20.99);
		Character charObj = Character.valueOf('A');
		Boolean boolObj = Boolean.valueOf(true);

		System.out.println("Integer Object: " + intObj);
		System.out.println("Double Object: " + doubleObj);
		System.out.println("Character Object: " + charObj);
		System.out.println("Boolean Object: " + boolObj);
	}

	private void demonstrateAutoboxingUnboxing() {
		// Autoboxing
		int intVar = 50;
		Integer intObj = intVar; // Automatic conversion from int to Integer

		System.out.println("Autoboxed Integer Object: " + intObj);

		// Unboxing
		Integer anotherIntObj = Integer.valueOf(100);
		int anotherIntVar = anotherIntObj; // Automatic conversion from Integer to int

		System.out.println("Unboxed int value: " + anotherIntVar);
	}

	private void displayTypeLimits() {
		System.out.println("Byte Min: " + Byte.MIN_VALUE + ", Max: " + Byte.MAX_VALUE);
		System.out.println("Short Min: " + Short.MIN_VALUE + ", Max: " + Short.MAX_VALUE);
		System.out.println("Integer Min: " + Integer.MIN_VALUE + ", Max: " + Integer.MAX_VALUE);
		System.out.println("Long Min: " + Long.MIN_VALUE + ", Max: " + Long.MAX_VALUE);
		System.out.println("Float Min: " + Float.MIN_VALUE + ", Max: " + Float.MAX_VALUE);
		System.out.println("Double Min: " + Double.MIN_VALUE + ", Max: " + Double.MAX_VALUE);
	}

	private void demonstrateTypeConversion() {
		String intString = "123";
		int intVar = Integer.parseInt(intString);

		System.out.println("Converted integer value: " + intVar);

		String doubleString = "45.67";
		double doubleVar = Double.parseDouble(doubleString);

		System.out.println("Converted double value: " + doubleVar);
	}

	private void showCharAndBoolean() {
		char charVar = 'Z';
		boolean boolVar = false;

		System.out.println("Character Value: " + charVar);
		System.out.println("Boolean Value: " + boolVar);
	}

	private void demonstrateArithmeticOperations() {
		int a = 10;
		int b = 3;

		System.out.println("Addition: " + (a + b));
		System.out.println("Subtraction: " + (a - b));
		System.out.println("Multiplication: " + (a * b));
		System.out.println("Division: " + (a / b));
		System.out.println("Modulus: " + (a % b));
	}

	private void demonstrateIncrementDecrement() {
		int a = 5;

		System.out.println("Original Value: " + a);
		System.out.println("Post-increment: " + (a++));
		System.out.println("After Post-increment: " + a);
		System.out.println("Pre-increment: " + (++a));
		System.out.println("After Pre-increment: " + a);

		System.out.println("Post-decrement: " + (a--));
		System.out.println("After Post-decrement: " + a);
		System.out.println("Pre-decrement: " + (--a));
		System.out.println("After Pre-decrement: " + a);
	}

	private void demonstrateCompoundAssignments() {
		int a = 10;

		a += 5;
		System.out.println("After += 5: " + a);

		a -= 3;
		System.out.println("After -= 3: " + a);

		a *= 2;
		System.out.println("After *= 2: " + a);

		a /= 4;
		System.out.println("After /= 4: " + a);

		a %= 3;
		System.out.println("After %= 3: " + a);
	}

	private void demonstrateRelationalOperators() {
		int a = 10;
		int b = 20;

		System.out.println("a == b: " + (a == b));
		System.out.println("a != b: " + (a != b));
		System.out.println("a > b: " + (a > b));
		System.out.println("a < b: " + (a < b));
		System.out.println("a >= b: " + (a >= b));
		System.out.println("a <= b: " + (a <= b));
	}

	private void demonstrateLogicalOperators() {
		boolean x = true;
		boolean y = false;

		System.out.println("x && y: " + (x && y));
		System.out.println("x || y: " + (x || y));
		System.out.println("!x: " + (!x));
	}

	private void demonstrateBitwiseOperators() {
		int a = 5; // 0101 in binary
		int b = 3; // 0011 in binary

		System.out.println("a & b: " + (a & b)); // AND
		System.out.println("a | b: " + (a | b)); // OR
		System.out.println("a ^ b: " + (a ^ b)); // XOR
		System.out.println("~a: " + (~a)); // NOT
		System.out.println("a << 1: " + (a << 1)); // Left shift
		System.out.println("a >> 1: " + (a >> 1)); // Right shift
	}

	private void demonstrateTernaryOperator() {
		int a = 10;
		int b = 20;

		int max = (a > b) ? a : b;

		System.out.println("Maximum value: " + max);
	}

	private void demonstrateStringConversion() {
		int intVar = 123;
		double doubleVar = 45.67;

		String intString = Integer.toString(intVar);
		String doubleString = Double.toString(doubleVar);

		System.out.println("Integer to String: " + intString);
		System.out.println("Double to String: " + doubleString);
	}

	private void demonstrateParsingStrings() {
		String intString = "456";
		String doubleString = "78.90";

		int intVar = Integer.parseInt(intString);
		double doubleVar = Double.parseDouble(doubleString);

		System.out.println("Parsed Integer: " + intVar);
		System.out.println("Parsed Double: " + doubleVar);
	}

	private void demonstrateMathClass() {
		double num = 16.0;

		System.out.println("Square root of " + num + ": " + Math.sqrt(num));
		System.out.println("Power of 2^3: " + Math.pow(2, 3));
		System.out.println("Absolute value of -10: " + Math.abs(-10));
		System.out.println("Ceiling of 4.3: " + Math.ceil(4.3));
		System.out.println("Floor of 4.7: " + Math.floor(4.7));
		System.out.println("Random number between 0 and 1: " + Math.random());
	}

	private void demonstrateFinalKeyword() {
		final int CONSTANT_VAR = 100;
		System.out.println("Final constant value: " + CONSTANT_VAR);
		// Uncommenting the next line will cause a compilation error
		// CONSTANT_VAR = 200;
	}
}
