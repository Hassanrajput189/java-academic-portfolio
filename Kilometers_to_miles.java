import java.util.Scanner;
public class Kilometers_to_miles {
    public static void main(String[] args){
        float Unit=1.609344f;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of kilometers");
        float km=sc.nextFloat();
        float miles = km/Unit;
        System.out.println(km+" in miles = "+ miles);                
        sc.close();

        // Scanner sc= new Scanner(System.in);
        // System.out.println("Enter a number");
        // boolean s= sc.hasNextInt();
        // if(s==true){
        //     System.out.println("Your number is an Integer");
        // }
        // else {
        //     System.out.println("Your number is not an Integer");
        // }
    }    
}