import java.util.Arrays;

public class FibonacciSeries {
    public static int[] calFibonacciSeries(int n) {
        int[] fibonacciSeries = new int[n];
        for (int i = 0; i < n; i++) {
            fibonacciSeries[i] = calculateFibonacci(i);
        }
        return fibonacciSeries;
    }

    public static int calculateFibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return calculateFibonacci(n - 1) + calculateFibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 10; 
        int[] febo = calFibonacciSeries(n);
        System.out.println(Arrays.toString(febo));
    }
}
