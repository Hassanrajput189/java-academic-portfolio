import java.util.Scanner;
 class sum_three_num {
    public static void main(String[] args){
         Scanner sc =new Scanner(System.in);
        System.out.println("Enter first number");
        int num1=sc.nextInt();
        System.out.println("Enter second number");
        int num2=sc.nextInt();
        System.out.println("Enter thrid number");
        int num3=sc.nextInt();
        int total =num1+num2+num3;
        System.out.println("The sum is:"+total);
        sc.close();

        // Scanner sc= new Scanner(System.in);
        // System.out.println("Enter no of inputs");
        // int input = sc.nextInt();
        // int sum =0;
        // for(int i=1;i<=input;i++){
        //     System.out.println("Enter number "+ i);
        //     int num=sc.nextInt();
        //     sum +=num;
        // }
        // System.out.println("sum :"+ sum);
    }
}
