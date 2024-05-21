import java.util.Scanner;
public class Arrays { 
    // public static void displayName(String arr[]) {
    //     System.out.println("The names are:");
    //     for (int i = 0; i < arr.length; i++) {
    //         System.out.println(arr[i]);
    //     }
    // }

    // public static void input(int arr[]){
    //     for (int i = 0; i < arr.length; i++) {
    //         System.out.println("Enter number:");
    //         arr[i] = sc.nextLine();
    //     }
    // }
    // public static void isSorted(int arr[]){
    //     for(int i =0;i<arr.length;i++){
    //         if(arr[i]<arr[i+1]){
    //             System.out.println("This array is sorted");
    //             break;
    //         }
    //         else{
    //             System.out.println("This array is not sorted");
    //             break;
    //}
        public static void bubbleSort(int arr[]){
            for(int i = 0;i<arr.length;i++){
                for(int j = 0;j<arr.length;j++){ 
                    if(arr[j]>arr[j+1]){
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1]=temp;
                    }
                }
            }
        }
        public static void selectionSort(int arr[]){
            for(int i = 0 ;i<arr.length;i++){
                for(int j = 0 ;j<arr.length;j++){
                    if(arr[i]<arr[j]){
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
        public static void insertionSort(int arr[]){
            for(int i = 1;i<arr.length;i++){
                int current = arr[i];
                int j = i-1;
                while(j>=0 && arr[j] > current){
                        arr[j+1] = arr[j];
                        j--;
                }
                  arr[j+1] = current;
             }
        }
        public static void displayArray(int arr[]){
            for(int i: arr){
                System.out.print(i+" ");
            }System.out.println();
        }
        public static void input2D(int arr[][],int rows ,int cols){
            Scanner input = new Scanner(System.in);
            for(int i = 0 ;i<rows;i++){
                for(int j = 0 ;j< cols;j++){
                    System.out.println("Enter input at : ("+i+","+j+")");
                    arr[i][j]= input.nextInt();
                }
            }
        }
         public static void display2D(int arr[][],int rows,int cols){
            for(int i = 0 ;i<rows;i++){
                for(int j = 0 ;j< cols;j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
        }
        public static void printTranspose(int arr[][],int rows,int cols){
            for(int i = 0 ;i<cols;i++){
                for(int j = 0; j<rows;j++){
                    System.out.print(arr[j][i]+" ");
                }
                System.out.println();
            }
        }
        
    public static void main(String[] args){
        int arr[] = {2,1,4,3,0};
        Scanner sc = new Scanner(System.in);
        // bubbleSort(arr);
        // selectionSort(arr);
        insertionSort(arr);
        displayArray(arr);
        // int rows,cols;
        // System.out.println("Enter no of rows");
        // rows= sc.nextInt();
        // System.out.println("Enter no of columns");
        // cols= sc.nextInt();
        // int arr[][]= new int [rows][cols];
        // input2D(arr,rows,cols);
        //  input2D(arr,rows,cols);
        //  printTranspose(arr,cols,rows);
        // display2D(arr,rows,cols);
        // isSorted(arr);
        // inputName(arr);
        // displayName(arr);
    }
}

