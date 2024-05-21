import java.util.Arrays;

public class FebonacciSeries {
    public static int[] calFebonacciSeries(int n){
        if(n < 2){
            return new int[] n;
        }
        return new int[]calFebonacciSeries(n-1)+""+calFebonacciSeries(n-2);
    }
    public static void main(String[] args) {
        int[] febo = calFebonacciSeries(2);
        System.out.println(Arrays.toString(febo));
    }
}
