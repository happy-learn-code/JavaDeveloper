/**
 * This is the StringAddress class in day5 package
 */
package day5;

/**
 * 
 */
public class StringAddress {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s1 = "Java";               // In String Constant Pool
        String s2 = "Java";               // Points to the same object in Pool
        String s3 = new String("Java");   // Forced new object in Heap

        // Printing "Internal Addresses" (Identity Hash Codes)
        System.out.println("s1 ID: " + Integer.toHexString(System.identityHashCode(s1)));
        System.out.println("s2 ID: " + Integer.toHexString(System.identityHashCode(s2)));
        System.out.println("s3 ID: " + Integer.toHexString(System.identityHashCode(s3)));

        // Verification
        System.out.println("\nDoes s1 point to the same memory as s2? " + (s1 == s2));
        System.out.println("Does s1 point to the same memory as s3? " + (s1 == s3));
	}

}
