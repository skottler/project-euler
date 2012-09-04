import java.lang.System;

/**
 * Setup the class
 */
public class projecteuler2 {

    /*
     * Main
     *
     * This is where validation of range takes place.
     */
    public static void main(String[] args) {
        int total = 0;
        for (int i = 0; ; i++) {
            int current_number = fib_it(i);
            if (current_number > 4000000) {
                // It's not possible to just return here since the method
                // returns void, so a break is the next best option.
                break;
            }

            if (current_number % 2 == 0) {
                total += current_number;
            }
        }

        // Print the total integer value to stdout.
        System.out.println(total);
    }


    private static int fib_it(int to_be_fibbed) {
        if (to_be_fibbed < 0 || to_be_fibbed > 46) {
            return(1);
        }
        else {
            // Setup some initial variables to be used for the "fibatization"
            int integer1 = 0;
            int integer2 = 1;
            for (int i = 0; i < to_be_fibbed; i++) {
                int integer3 = integer1 + integer2;
                integer1 = integer2;
                integer2 = integer3;
            }

            return integer1;
        }
    }
}

// Result: 4613732
