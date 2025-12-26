package day5;

public class StringMastery {
    public static void main(String[] args) {
        // 1. Literal vs New Keyword
        String s1 = "Java";               // Stored in String Pool
        String s2 = "Java";               // Points to the same object in Pool
        String s3 = new String("Java");   // Created in Heap (outside Pool)

        System.out.println(s1 == s2);      // true (Same memory reference)
        System.out.println(s1 == s3);      // false (Different memory locations)
        System.out.println(s1.equals(s3)); // true (Same content)

        // 2. Demonstrating Immutability
        String str = "Hello";
        str.concat(" World"); 
        System.out.println("After concat: " + str); // Still prints "Hello"

        str = str.concat(" World"); 
        System.out.println("After reassignment: " + str); // Now "Hello World" (new object)

        // 3. Common Operations
        String text = "   JDK 1.8 Features   ";
        System.out.println("Length: " + text.length());
        System.out.println("Trimmed: '" + text.trim() + "'");
        System.out.println("Substring: " + text.trim().substring(0, 3)); // Prints "JDK"
        System.out.println("Contains '1.8': " + text.contains("1.8"));
    }
}