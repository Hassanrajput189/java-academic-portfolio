import java.util.Scanner;
public class Even_number{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter no of terms");
        int n=sc.nextInt();
        for(int i=2;i<n;i+=2){
            System.out.println(i);
        }
    }
}