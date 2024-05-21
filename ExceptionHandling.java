import java.util.InputMismatchException;
import java.util.Scanner;
public class ExceptionHandling {
    float divide(float a, float b) throws ArithmeticException,InputMismatchException {
        if (b == 0) {
            throw new ArithmeticException();
        }
            return a / b;
    }
    boolean accessArray(int n) {
        Scanner input = new Scanner(System.in);
        int arr[] = new int[5]; // You can increase the array size if needed
        if (n >= arr.length) {
            throw new IndexOutOfBoundsException();
            
        }
        else{
            for (int i = 0; i < n && i < arr.length; i++) {
                System.out.println("Enter the element " + i);
                arr[i] = input.nextInt();
        }
        }
        input.close();
        return true;
    }
   

    public static void main(String[] args) {
        ExceptionHandling eh = new ExceptionHandling();
        // System.out.print("Enter the index: ");
        // Scanner scanner = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        // float arr[]  = new float[3];
        System.out.println("Enter first number");
        float a = sc.nextFloat();
        System.out.println("Enter second number");
        float b;
        // char b;
        try{ 
            b = sc.nextFloat();
            // b = sc.next().charAt(0);
            System.out.println( eh.divide(a, b));
        // int index = scanner.nextInt();
        // if (eh.accessArray(index)) {
        //     System.out.println("Array access successful.");
        // }
    }
        catch(ArithmeticException e){ 
            System.out.println("This is an ArithmaticException");
        }
        catch(IllegalArgumentException e){
            System.out.println("This is an IllegalArgumentException");
        }
        catch(InputMismatchException e){
             System.out.println( "this is not an InputMismatchException");
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("This is an arrayIndexOutOfBounds Exception");
        }
        finally{
            // scanner.close();
            sc.close();
        }
    }
}
