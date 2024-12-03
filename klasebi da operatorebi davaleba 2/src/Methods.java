public class Methods {
    int sumOfMultiples(int a, int b, int k) {
        if (a > b) return 0;
        return (a % k == 0 ? a : 0) + sumOfMultiples(a + 1, b, k);
    }
    int sumOfNaturalNumbers(int n) {
        if (n == 1) return 1;
        return n + sumOfNaturalNumbers(n - 1);
    }
    int power(int a, int n) {
        if (n == 0) return 1;
        return a * power(a, n - 1);
    }
    int countZeros(int x) {
        if (x == 0) return 1;
        if (x < 10) return 0;
        return (x % 10 == 0 ? 1 : 0) + countZeros(x / 10);
    }
    void checkZeroParity(int x) {
        int zeroCount = countZeros((x));
        if (zeroCount % 2 == 0) {
            System.out.println("The number of zeros is even.");
        } else {
            System.out.println("The number of zeros is odd.");
        }
    }
}
