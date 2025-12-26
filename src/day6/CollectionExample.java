package day6;

import java.util.ArrayList; // Needed to use ArrayList

public class CollectionExample {
    public static void main(String[] args) {
        // This would FAIL: ArrayList<int> list = new ArrayList<>();
        
        // Use the Wrapper class 'Integer'
        ArrayList<Integer> numbers = new ArrayList<>();

        // 1. Autoboxing: We provide a primitive '5', Java stores it as an Integer object
        numbers.add(5); 
        numbers.add(10);
        numbers.add(15);

        System.out.println("List of Integers: " + numbers);

        // 2. Unboxing: Java converts the Integer object back to a primitive int for calculation
        int sum = numbers.get(0) + numbers.get(1); 
        
        System.out.println("Sum of first two elements: " + sum);
        
        // 3. Handling Nulls (Only Wrappers can do this)
        Integer score = null; 
        System.out.println("Current score is: " + score);
    }
}
