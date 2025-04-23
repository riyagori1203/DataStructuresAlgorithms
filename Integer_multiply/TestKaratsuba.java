package Integer_multiply;

public class TestKaratsuba {
    public static void main(String[] args) {
        runTest(5678L, 1234L, 7006652L);
        runTest(12345678L, 87654321L, 1082152022374638L);
        runTest(0L, 9999999L, 0L);
        runTest(1L, 9999999L, 9999999L);
        runTest(999L, 999L, 998001L);
    }

    private static void runTest(long a, long b, long expected) {
        karatsuba k = new karatsuba();
        long result = k.multiply(a, b);

        if (result == expected) {
            System.out.println("PASS: " + a + " * " + b + " = " + result);
        } else {
            System.out.println("FAIL: " + a + " * " + b);
            System.out.println("Expected: " + expected);
            System.out.println("Got:      " + result);
        }
    }
}
