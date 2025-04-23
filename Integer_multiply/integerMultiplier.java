package Integer_multiply;
// Question: Given two arrays a and b, return the result after multiplying the 2 numbers without using the operator (*). 

public class integerMultiplier {

    public static int[] multiplyIntegers(int[] a, int[] b) {
        int m = a.length, n = b.length;
        int[] result = new int[m + n];
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                int mul = a[i] * b[j];
                int p1 = i + j;
                int p2 = i + j + 1;
                int sum = mul + result[p2];

                result[p2] = sum % 10;
                result[p1] += sum / 10;
            }
        }
        int start = 0;
        while (start < result.length - 1 && result[start] == 0) {
            start++;
        }
        int len = result.length - start;
        int[] trimmedResult = new int[len];
        for (int i = 0; i < len; i++) {
            trimmedResult[i] = result[start + i];
        }

        return trimmedResult;
    }
}
