import java.util.Scanner;
public class Calculator{
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter first numbers");
        int num1 = sc.nextInt();
        System.out.println("Enter the operator( +, - , * , / , % )");
        char ch = sc.next().charAt(0);
        System.out.println("Enter second number");
        int num2 = sc.nextInt();
        int sum  = num1 +num2 ;
        int diff = num1 - num2;
        int pro = num1 * num2;
        int quo = num1 / num2;
        int rem = num1 % num2;
        switch (ch){
            case '+':
             System.out.println("The sum of " + num1 + " and " + num2 + " is : " + sum);
            break;
            case '-':System.out.println("The difference of " + num1 + " and " + num2 + " is : " + diff);
            break;
            case '*':System.out.println("The product of " + num1 + " and " + num2 + " is : " + pro);
            break;
            case '/':System.out.println("The quotient of " + num1 + " and " + num2 + " is : " + quo);
            break;
            case '%':System.out.println("The remainder of " + num1 + " and " + num2 + " is : " + rem);
            break;
            default:System.out.println("Invalid operator");        
        }

    }

}