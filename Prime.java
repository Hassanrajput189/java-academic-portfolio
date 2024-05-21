import java.util.Scanner;

public class Prime {
    public boolean isPrime(int n) {
        for(int i = 2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Prime p = new Prime();
        System.out.println("Enter the number");
        int n = sc.nextInt();
        if(p.isPrime(n)==true){
            System.out.println(n+" is a prime number");
        }
        else {
            System.out.println(n + " is not a prime number");
        }
    }
}
