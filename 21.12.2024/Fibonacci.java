public class Fibonacci {
    public static int fibRecursive(int n) {
        if (n <= 1) return n;
        return fibRecursive(n - 1) + fibRecursive(n - 2);
    }
    public static int fibIterative(int n) {
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }

    public static void main(String[] args) {
        System.out.println(fibRecursive(7)); 
        System.out.println(fibIterative(7));  
    }
}
