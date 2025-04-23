package Integer_multiply;
// TestIntegerMultiplier.java
import java.util.Arrays;

public class TestIntegerMultiplier {
    public static void main(String[] args) {
        runTest(new int[]{1, 2, 3, 4, 5}, new int[]{3, 4, 5, 6, 7}, new int[]{4, 2, 6, 7, 2, 9, 6, 1, 5});
        runTest(new int[]{9, 9, 9}, new int[]{9, 9, 9}, new int[]{9, 9, 8, 0, 0, 1});
        runTest(new int[]{0}, new int[]{1, 2, 3}, new int[]{0});
        runTest(new int[]{1, 0, 0}, new int[]{0}, new int[]{0});
        runTest(new int[]{1}, new int[]{1}, new int[]{1});
    }

    private static void runTest(int[] a, int[] b, int[] expected) {
        int[] result = integerMultiplier.multiplyIntegers(a, b);
        if (Arrays.equals(result, expected)) {
            System.out.println("PASS: " + Arrays.toString(a) + " * " + Arrays.toString(b) + " = " + Arrays.toString(result));
        } else {
            System.out.println("FAIL: " + Arrays.toString(a) + " * " + Arrays.toString(b));
            System.out.println("Expected: " + Arrays.toString(expected));
            System.out.println("Got:      " + Arrays.toString(result));
        }
    }
}
