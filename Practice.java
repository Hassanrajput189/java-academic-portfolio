import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringJoiner;
import java.util.List;
class Calculator{
    Calculator(){}
    Calculator(int a,int b,char c){
        if(c =='+'){
            System.out.println(a+b);
        }
    }
    int add(int a,int b){
        return(a/b);
    }
    int sub(int a,int b){
        return(a-b);
    }
    int mul(int a,int b){
        return(a*b);
    }
    int div(int a,int b){
        return(a/b);
    }
    int mod(int a,int b){
        return(a%b);
    }
    float parallenogram(float base,float height){
        float area = base*height;
        return(area);
    }
    float circle(float radius){
        float area = 3.142f*radius*radius;
        return(area);
    }
    float triangle(float base,float height){
        float area = (base*height)/2;
        return(area);
    }
    float square(float sides){
        float area = sides*sides;
        return(area);
    }

}
class A{
    public void display1(){
        System.out.println("This is display 1");
    }
    public void display2(){
        System.out.println("This is display 2");
    }
}
class B extends A{
    public void run(){ 
    for(int i = 0;i<10;i++){
        try{
            display1();
            Thread.sleep(1000);
            display2();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    }
}
class A implements Runnable {
    
}
class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class ThreadAlt {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class Practice{
    public static int calAvg(int ...n){
        int total = 0;
        for(int i = 0 ;i<n.length;i++){
            total+=n[i];
        }
        return (total/n.length);
    }
    public static void main(String[] args){
        MyThread mt1 = new MyThread();
        MyThread mt2 = new MyThread();
        ThreadAlt ta1 = new ThreadAlt();
        ThreadAlt ta2 = new ThreadAlt();
        ta1.run();
        ta2.run();
        // mt1.start();
        // mt2.start();
        // A a = new A();
        // B b = new B();
        // c.displayA();
        // c.displayB();
        // print2 p = new print2();
        //int a = 500;
        // byte b;
        // b=(byte)a;
        // System.out.println(b);
        // Scanner sc = new Scanner(System.in);
        // int[] arr = new int[5];
        // System.out.println("Enter 5 integer values:");
        // for (int i = 0; i < arr.length; i++) {
        //     arr[i] = sc.nextInt();
        // }
        // Selection Sort
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = i + 1; j < arr.length; j++) {
        //         if (arr[j] < arr[i]) {
        //             int temp = arr[i];
        //             arr[i] = arr[j];
        //             arr[j] = temp;
        //         }
        //     }
        // }        
        // System.out.println("Sorted array:");
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + " ");
        // }
        // System.out.println();
    
        // for (int i = 0; i < arr.length; i++) {
        //     if(arr[i]%2==0){
        //         System.out.print(arr[i]+" ");
        //     }            
        // }
        // System.out.println("Enter number in Fahrenheit");
        // int f = sc.nextInt();
        // int c = (f-32)*5/9;
        // System.out.println("The value in celcius is "+ c);
        // int x = 2;
        // int y = 3;
        // x = x + y;//x = 5
        // y = x-y;//y = 2
        // x = x - y;//x = 3
        // System.out.println(x + " " + y);
        //     String s1,s2;
        //     System.out.println("Enter first String");
        //     s1= sc.nextLine;
        //     System.out.println("Enter second String");
        //     s2= sc.nextLine();
        //     if(s1.compareTo(s2)>0){
        //         System.out.println("First string is greater");
        //     }
        //     else if(s1.compareTo(s2)<0){
        //         System.out.println("Second String is greater");
        //     }
        //     else{
        //         System.out.println("Both are equal");
        //     }
        // int arr[][]= new int[10][2];
        // int a = 0,b= 1, c = 2,d=3,e=4,f=5,g= 6,h=7,i=8,j=9,k=10,l=11,m=12,n=13,o=14,p=15,q=16,r=17,s=18,t=19,u=20;
        // arr[0][0]=a;
        // arr[0][1]=b;
        // arr[1][0]=c;
        // arr[1][1]=d;
        // arr[2][0]=e;
        // arr[2][1]=f;
        // arr[3][0]=g;
        // arr[3][1]=h;
        // arr[4][0]=i;
        // arr[4][1]=j;
        // arr[5][0]=k;
        // arr[5][1]=l;
        // arr[6][0]=m;
        // arr[6][1]=n;
        // arr[7][0]=o;
        // arr[7][1]=p;
        // arr[8][0]=q;
        // arr[8][1]=s;
        // arr[9][0]=t;
        // arr[9][1]=u;
        // for(int x = 0;x<=9;x++){
        //     for(int  z= 0;z<=1;z++){
        //         System.out.print(arr[x][z]+" ");
        //     }System.out.println();
        // }
        // int array[][]=new int[500][2];
        // for(int i = 0,j= 500;i<=500&&j>=0;i++,j--){
        //    array[i][0]=i;
        //    array[i][1]=j;
        //     System.out.println(array[i][0]+" "+ array[i][1]);           
        // }
        // System.out.println();
        // System.out.println("Enter size of the matrix");
        // int size = sc.nextInt();
       // int m1[][]= new int[size][size];
       // int m2[][]=new int[size][size];
       // int res[][]= new int[size][size];
       // for(int i = 0;i<size;i++){
       //  for(int j = 0 ;j<size;j++){
       //      System.out.println("Enter size of matrix 1 at:("+i+","+j+")");
       //      m1[i][j]= sc.nextInt();
       //  }
       // }
       // for(int i = 0;i<size;i++){
       //  for(int j = 0 ;j<size;j++){
       //      System.out.println("Enter size of matrix 2 at:("+i+","+j+")");
       //      m2[i][j]= sc.nextInt();
       //  }
       // }
       // for(int i = 0;i<size;i++){
       //  for(int j = 0 ;j<size;j++){
       //  res[i][j]= m1[i][j]+m2[i][j];
       //  }
       // }
       // for(int i = 0;i<size;i++){
       //  for(int j = 0 ;j<size;j++){
       //  System.out.print(res[i][j]);
       //  }System.out.println();
       // }
        // int arr[]= new int[10];
        // for(int i =0;i<=9;i++){
        //     System.out.println("Enter no "+i+" Element");
        //     arr[i]=sc.nextInt(); 
        // }
        // for(int n:arr){
        //     System.out.println(n);
        // }
        // System.out.println("Enter a number");
        // int  a = sc.nextInt();
        // String res=Integer.toBinaryString(a);
        // System.out.println(res);
        // int a=64,b=5;
        // System.out.println(a|b);
        // ArrayList<String> arrl = new ArrayList<>();
        // for(int i = 0;i<arrl.size();i++){
        // arrl=sc.next();
        // }
        // System.out.println("The elements are");
        // for(String s:arrl){
        //     System.out.println(s);
    //     ArrayList<Integer> arr= new ArrayList<>();
    //     arr.add(2);
    //     arr.add(1);
    //     arr.add(13);
    //     arr.add(42);
    //     arr.add(0);
    //     arr.add(65);
    //     arr.add(23);
    //     arr.add(72);
    //     arr.add(84);
    //     arr.add(6);
    //     // Collections.sort(arr);
    //     arr.forEach(a->{
    //         System.out.println(a);
    //     })
    // String s = "import";
    // s = "JAVA";
    // s = "util";
    // int  i = 1;
    // i = 2; 
    // i = 3;
    // System.out.println(i);
        // for(int i = arr.length-1;i>=0;i--){
        //     System.out.println(arr[i]);
        // }
        // StringJoiner sj = new StringJoiner(":","[","]");
        // sj.add("Hassan");
        // sj.add("anas");
        // sj.add("ayan");
        // System.out.println(sj);
        // Calculator c = new Calculator();
        // Calculator c2 = new Calculator(2,3,'+');
        // System.out.println(c.add(5,2));
        // System.out.println(c.sub(2,6));
        // System.out.println(c.mul(3,8));
        // System.out.println(c.div(9,2));
        // System.out.println(c.mod(2,3));
        // System.out.println(c.triangle(1.0f,4.0f));
        // System.out.println(c.circle(2.5f));
        // System.out.println(c.square(4.8f));
        // System.out.println(c.parallelogram(2.1f,8.3f));
        //     Integer a =1;
            
        // System.out.println(a);
        // a = 3;
        // System.out.println(a);

    }
}