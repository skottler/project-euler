public class projecteuler3 {

    public static void main(String[] args) {
        long constant_num = 600851475143L;
        while (true) {
            long x = min_factor(constant_num);
            if (x < constant_num) {
                constant_num /= x;
            }
            else {
                break;
            }
        }
        System.out.println(constant_num);
    }

    private static long min_factor(long to_factor) {
        for (long i = 2, end = squareroot(to_factor); i <= end; i++) {
            if (to_factor % i == 0)
                return i;
        }
        return to_factor;
    }


    private static long squareroot(long to_factor) {
        long value = 0;
        for (long i = 1L << 31; i != 0; i >>>= 1) {
            value |= i;
            if (value > 3037000499L || value * value > to_factor)
                value ^= i;
        }
        return value;
    }

}

// Solution: 6857
