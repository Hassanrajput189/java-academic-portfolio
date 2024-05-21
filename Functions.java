import java.util.Scanner;
public class Functions {

    // Function to print your Name

    public static String printName(String name){
        return(name);
    }

    // Function to add two numbers

    public static int addNum(int a , int b){
        int sum = a+b;
        return(sum);
    }

    // Function to multiply two numbers

    public static int productNum(int a , int b){
        int pro = a*b;
        return(pro);
    }

    // Function to find even number

    public static void isEven(int num){
        if(num%2==0){
            System.out.println(num+" is Even number");
        }
        else{
            System.out.println(num+" is not an Even number");
        }
    }

    //Function to get the table of a number

    public static void table(int num){
        int total=0;
        for(int i =1; i<=10; i++){
            total+=num;
            System.out.println(total);
        }
    }

    // Function to find the prime number

    public static void isPrime(int num){
        boolean isPrime = true;
        for(int i = 2;i<=num/2;i++){
            if(num%i==0){
                isPrime=false;
            }
        }
        if(isPrime == true){
            System.out.println(num+" is Prime number");
        }
        else{
            System.out.println(num + " is non Prime number");
        }
    }
    public static int sumToN(int n){
        if(n==0){
            return 0;
        }
        else{
            return n+sumToN(n-1);
        }

    }
    // Function to print factorial of a number through iteration
    public static int factorialThroughIteration(int num) {
        if (num < 0) {
            System.out.println("Invalid number");
            return -1;
        } else if (num == 0 || num==1) {
            return 1;
        } else {
            int fact = 1;
            for (int i = num; i >= 1; i--) {
                fact *= i;
            }
            return fact;
        }
    }
    // function to print factorial of a number thorugh recursion
    public static int factorialThroughRecursion(int n){
        if(n==0|| n == 1){
            return 1;
        }
        else{
            return n*factorialThroughRecursion(n-1);
        }
    }
    public static int calPower(int x,int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int total = x*calPower(x,n-1); 
        return total;
    }

    //function to calculate power having stack height logn
    
    public static int calcPower(int x,int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        if(n%2==0){
            return calPower(x,n/2)*calPower(x,n/2);
        }
        else{
            return calPower(x,n/2)*calPower(x,n/2)*x;
        }
    }
    public static void main(String args[]){
    System.out.println(calcPower(2,5)); 
        // System.out.println(factorialThroughRecursion(5));
        // System.out.println(sumToN(5));
        // System.out.println("Enter your name");
        // String name = sc.nextLine();
        // System.out.println("Your name is " + printName(name));
        // System.out.println("Enter first number");
        // int a = sc.nextInt();
        // System.out.println("Enter second number");
        // int b = sc.nextInt();
        // int sum = addNum(a,b);
        // int pro= productNum(a,b);
        // System.out.println("The sum of "+ a +" and " + b + " is " + sum);
        // System.out.println("The product of "+ a +" and " + b + " is " + pro);
        // System.out.println("The factorial of " + a +" is " + factorial(a));
        // System.out.println("The factorial of " + a +" is " + factorial(b));
        // isEven(a);
        // isEven(b);
        // table(a);
        // table(b);
        // isPrime(a);
        // isPrime(b);
    }
}

