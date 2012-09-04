import java.lang.String;
import java.lang.System;

/**
 * Interate over values less than 1000 that are divisible by 3 or 5, and if
 * they meet the criteria, then add then to the total.
 */
public class projecteuler1 {
    public static void main(String[] args) {
        int total = 0;
        // The values less than 1000.
        for (int i=0; i < 1000; i++) {
          // If the value is divisible by 3 or 5 add it to the total.
            if (i % 3 == 0 || i % 5 == 0) {
                total += i;
            }
        }
        // Write the total to stdout.
        System.out.println(total);
    }
}
