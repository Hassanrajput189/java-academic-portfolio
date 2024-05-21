public class PrimeNumberThread {
       public static void main(String[] args) throws InterruptedException {
        int maxPrime = 100;
        PrimeNumberGenerator primeGenerator1 = new PrimeNumberGenerator(maxPrime);
        PrimeNumberGenerator primeGenerator2 = new PrimeNumberGenerator(maxPrime);
        primeGenerator1.start();
    }    
}
class PrimeNumberGenerator extends Thread {
    private int maxPrime;

    public PrimeNumberGenerator(int maxPrime) {
        this.maxPrime = maxPrime;
    }

    @Override
    public void run() {
        for (int i = 2; i <= maxPrime; i++) {
            if (isPrime(i)) {
                System.out.println("Prime number: " + i);
            }
        }
    }

    private boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n <= 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}