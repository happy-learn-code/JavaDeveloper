package day1;

public class ExamplePrivateMethods {
	
	public static void main(String[] args) {
		ExamplePrivateMethods obj = new ExamplePrivateMethods();
		obj.publicMethod();
	}

	public void publicMethod() {
		System.out.println("This is a public method.");
		privateMethod();
	}

	private void privateMethod() {
		System.out.println("This is a private method.");
	}

}
