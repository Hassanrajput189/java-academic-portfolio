import java.util.Scanner;
public class Patterns{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int rows,col;
        System.out.println("Enter number of rows");
        rows = sc.nextInt();
        col = 5;
        // System.out.println("Enter number of Columns");
        // cols = sc.nextInt();
        //     Rectangle pattern

        //    for(int i=0;i<rows;i++){
        //     for(int j=0;j<col;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // Hollow Rectangle pattern

        // for(int i=1;i<=rows;i++){
        //     for(int j=1;j<=cols;j++){
        //         if(i==1 || i==rows || j==1 || j==cols){
        //             System.out.print("*");
        //         }
        //         else {
        //             System.out.print(" ");
        //         }
        //     }System.out.println();
        // }

        // Triangle pattern

        // for(int i=1;i<=rows;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }System.out.println();
        // }

        // Inverted Triangle pattern

        // for(int i=1;i<=rows;i++){
        //     for(int j=rows;j>=i;j--){
        //         System.out.print("*");
        //     }System.out.println();
        // }
         
        // Rotated Triangle pattern 

        // for(int i=1;i<=rows;i++){
        //     for(int j=1;j<=rows;j++){
        //         if(j<=rows-i){
        //             System.out.print(" ");
        //         }
        //         else{
        //             System.out.print("*");
        //         }
        //     }System.out.println();
        // }
    
    // OR

    // for(int i=1;i<=rows;i++){
    //     for(int j=1;j<=rows-i;j++){
    //         System.out.print(" ");
    //     }
    //     for(int j=1;j<=i;j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }

    // Triangle of numbers
        
    // for(int i=1;i<=rows;i++){
    //     for(int j=1;j<=i;j++){
    //         System.out.print(j + " ");
    //     }
    //     }System.out.println();
    
    // Inverted Triangle of numbers

    // for(int i=1;i<=rows;i++){
    //     for(int j=rows;j>=i;j--){
    //         System.out.print(j + " ");
    //     }
    //     System.out.println();
    // }
    
    //OR 

    // for(int i=1;i<=rows;i++){
    //         for(int j=1;j<=rows-i+1;j++){
    //             System.out.print(j + " ");
    //         }
    //         System.out.println();
    //     }
    
    // Floyd's triangle pattern
 
    // int counter =1;
    // for(int i=1;i<=rows;i++){
    //     for(int j=1;j<=i;j++){
    //         System.out.print(counter + " ");
    //         counter++;
    //     }
    //     System.out.println();
    // }

    // 0-1 Triangle pattern

//    for(int i=1;i<=rows;i++){
//     for(int j=1;j<=i;j++){
//         int sum = i+j;
//         if(sum % 2 == 0){
//             System.out.print('1' + " ");
//         }
//         else{
//             System.out.print('0' + " ");
//         }
//     }
//     System.out.println();
//    }
    }
    
}