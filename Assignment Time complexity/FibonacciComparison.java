import java.util.*;

class FibonacciComparison {

    static int fibRec(int n) {
        if (n <= 1) return n;
        return fibRec(n - 1) + fibRec(n - 2);
    }

    static int fibItr(int n) {
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long start = System.nanoTime();
        fibRec(n);
        long end = System.nanoTime();
        System.out.println("Recursive Time: " + (end - start));

        start = System.nanoTime();
        fibItr(n);
        end = System.nanoTime();
        System.out.println("Iterative Time: " + (end - start));
        sc.close();
    }
}
