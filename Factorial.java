public class Factorial {
    public static long factorial(long n) {
        if (n < 0) {
            throw new IllegalArgumentException("negative integer n");
        } else if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        try {
            factorial(-1);
        } catch (IllegalArgumentException e) {
            System.out.println("this is fine");
        }
    }
}