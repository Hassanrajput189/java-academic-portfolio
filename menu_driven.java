import java.util.Scanner;
public class menu_driven {
        // public static void main(String[] args){
        //     Scanner sc = new Scanner(System.in);
        // System.out.println("Enter two number (1 or 0)");
        // int num = sc.nextInt();
        //     if(num==1){
        //         for(int i=1;i!=0;i++){
        //             System.out.println("Enter marks for student " + i + " out of 100");
        //             int marks= sc.nextInt();
        //             if(marks > 100){
        //                 System.out.println("Marks cannot be greater than 100");
        //                 break;
        //             }
        //             else if(marks == 0 ){
        //                 break;
        //             }
        //             else if(marks>=90){
        //                 System.out.println("This is Good");
        //             }
        //             else if(marks >= 70){
        //                 System.out.println("This is also Good");
        //             }
        //             else if(marks>=50){
        //                 System.out.println("This is fine");
        //             }
        //             else if(marks<50 && marks >0) {
        //                 System.out.println("Good but try to improve");
        //             }
        //             else {
        //                 System.out.println("try to improve");
        //             }
        //         }
        //     }
        //     else {
        //         System.out.println("Invalid number");
        //     }
        // }

        // OR

            public static void main(String[] args){
            Scanner sc = new Scanner (System.in);
            System.out.println("Enter two number (0 or 1)");
            int input = sc.nextInt();
            int counter =1;
            int marks;
            if(input==1){
            do{ 
                    System.out.println("Enter marks for student " + counter);
                    marks = sc.nextInt();
                    counter++;
                    if(marks <= 100 && marks >= 0 ){ 
                    if(marks>=90){
                        System.out.println("This is Good");
                    }
                    else if(marks <= 89 && marks >= 60){
                        System.out.println("This is also Good");
                    }
                    else {
                        System.out.println("This is Good as well");
                    }
                }
                else {
                    System.out.println("Marks cannot be greater than 100");
                }
                System.out.println("Press 1 for another input");
                input = sc.nextInt();
            }while(input == 1);
        }
    }    
}
