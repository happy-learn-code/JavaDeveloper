package day3;

public class WrapperExample {
    public static void main(String[] args) {
        // 1. Autoboxing: Primitive to Wrapper
        int primitiveInt = 25;
        Integer wrappedInt = primitiveInt; 

        // 2. Unboxing: Wrapper to Primitive
        Double wrappedDouble = 99.99;
        double primitiveDouble = wrappedDouble;

        // 3. Useful Utility Methods
        String priceText = "150";
        int convertedPrice = Integer.parseInt(priceText); // String to int conversion

        System.out.println("Wrapped Integer: " + wrappedInt);
        System.out.println("Parsed Price: " + convertedPrice);
        
        // Checking Character properties
        char myChar = 'a';
        System.out.println("Is Uppercase? " + Character.isUpperCase(myChar));
    }
}
