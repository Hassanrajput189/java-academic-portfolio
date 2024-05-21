
import java.util.Scanner;

public class Advanced_patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows, cols;
        System.out.println("Enter number of rows");
        rows = sc.nextInt();
        cols = 5;
        // System.out.println("Enter number of Columns");
        // cols = sc.nextInt();

        // Butterfly pattern

        for(int i=1;i<=rows;i++){
        for(int j =1;j<=i;j++){
        System.out.print("*");
        }
        for(int j = 1;j<= 2*(rows-i);j++){
        System.out.print(" ");
        }
        for(int j = 1;j<=i;j++){
        System.out.print("*");
        }
        System.out.println();
        }
        for(int i=rows;i>=1;i--){
        for(int j =1;j<=i;j++){
        System.out.print("*");
        }
        for(int j = 1;j<= 2*(rows-i);j++){
        System.out.print(" ");
        }
        for(int j = 1;j<=i;j++){
        System.out.print("*");
        }
        System.out.println();
        }

        // Hollow Butterfly pattern

        // for (int i = 1; i <= rows; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         if (i <= j || j == 1 ) {
        //             System.out.print("*");
        //         } else {
        //             System.out.print(" ");
        //         }
        //     }
        //     for (int j = 1; j <= 2 * (rows - i); j++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 1; j <= i; j++) {
        //         if (i <= j || j == 1) {
        //             System.out.print("*");
        //         } else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }
        // for (int i = rows; i >= 1; i--) {
        //     for (int j = 1; j <= i; j++) {
        //         if (i <= j || j == 1 ) {
        //             System.out.print("*");
        //         } else {
        //             System.out.print(" ");
        //         }
        //     }
        //     for (int j = 1; j <= 2 * (rows - i); j++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 1; j <= i; j++) {
        //         if (i <= j || j == 1 ) {
        //             System.out.print("*");
        //         } else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        // Solid Rhombus/Parallelogram

        // for(int i=1;i<=rows;i++){
        // for(int j =1; j<= rows-i;j++){
        // System.out.print(" ");
        // }
        // for(int j= 1;j<= rows;j++){
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // Hollow Solid Rhombus/Parallelogram

        // for(int i=1;i<=rows;i++){
        // for(int j =1; j<= rows-i;j++){
        // System.out.print(" ");
        // }
        // for(int j= 1;j<= rows;j++){
        // if(i==1 || i==rows || j==1 || j==rows){
        // System.out.print("*");
        // }
        // else{
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // Number Pyramid pattern

        // for(int i=1;i<=rows;i++){
        // for(int j =1 ;j<=rows-i;j++){
        // System.out.print(" ");
        // }
        // for(int j = 1 ;j<= i;j++){
        // System.out.print(i + " ");
        // }
        // System.out.println();
        // }

        // OR

        // for(int i=1;i<=rows;i++){
        // for(int j = 1;j<=rows-i;j++){
        // System.out.print(" ");
        // }
        // for(int j = 1;j<=i;j++){
        // System.out.print(i);
        // }
        // for(int j=2;j<=i;j++){
        // System.out.print(i);
        // }
        // System.out.println();
        // }

        // Palindromic Pyramid pattern

        // for(int i=1;i<=rows;i++){
        // for(int j = 1;j<=rows-i;j++){
        // System.out.print("  ");
        // }
        // for(int j = i;j>=1;j--){
        // System.out.print(j+" ");
        // }
        // for(int j = 2;j<=i;j++){
        // System.out.print(j+" ");
        // }
        // System.out.println();
        // }

        // Diamond pattern

        // for(int i= 1;i<=rows;i++){
        // for(int j = 1;j<=rows-i;j++){
        // System.out.print(" ");
        // }
        // for(int j = 1;j<= i ;j++){
        // System.out.print("*");
        // }
        // for(int j = 2;j<=i;j++){
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        // for(int i= rows;i>=1;i--){
        // for(int j = 1;j<=rows-i;j++){
        // System.out.print(" ");
        // }
        // for(int j = 1;j<= i ;j++){
        // System.out.print("*");
        // }
        // for(int j = 2;j<=i;j++){
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // OR

        // for (int i = 1; i <= rows; i++) {
        // for (int j = 1; j <= rows - i; j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= 2 * i - 1; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        // for (int i = rows; i >= 1; i--) {
        // for (int j = 1; j <= rows - i; j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= 2 * i - 1; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        
        // Half Pyramid of numbers

        // for(int i =1 ; i<=rows;i++){
        //     for(int j = 1 ;j<= i ;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        // Inverted Half Pyramid of numbers

        // for(int i =1 ; i<=rows;i++){
        //     for(int j = rows ;j>= i ;j--){
        //         System.out.print(i);
                
        //     }
        //     System.out.println();
        // }

        // Pascal's Triangle

        // for (int i = 1; i <= rows; i++) {
        //     int number = 1;
        //     for (int j = 1; j <= rows - i; j++) {
        //         System.out.print(" "); 
        //     }
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(number + " ");
        //         number = number * (i - j) / j;
        //     }
        //     System.out.println();
        // }
    }
}