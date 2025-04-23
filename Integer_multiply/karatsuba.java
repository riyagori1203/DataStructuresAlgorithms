package Integer_multiply;

public class karatsuba {

    public static void main(String[] args) {
        karatsuba karatsubaObj = new karatsuba();
        long x = 5678;
        long y = 1234;

        long result = karatsubaObj.multiply(x, y);
        System.out.println("Product: " + result);
    }

    public long multiply(long x, long y) {
        if (x < 10 || y < 10) {
            return x * y;
        }

        int lenX = Long.toString(x).length();
        int lenY = Long.toString(y).length();
        int maxLen = Math.max(lenX, lenY);
        int halfLength = maxLen / 2;

        long a = x / (long) Math.pow(10, halfLength);
        long b = x % (long) Math.pow(10, halfLength);
        long c = y / (long) Math.pow(10, halfLength);
        long d = y % (long) Math.pow(10, halfLength);

        long ac = multiply(a, c);
        long bd = multiply(b, d);
        long abcd = multiply(a + b, c + d);

        long middle = abcd - ac - bd;

        return ac * (long) Math.pow(10, 2 * halfLength)
             + middle * (long) Math.pow(10, halfLength)
             + bd;
    }
}
