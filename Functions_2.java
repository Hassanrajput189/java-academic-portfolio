import java.util.Scanner;
public class Functions_2{

// function to print the average of three numbers

public static float average(float a , float b , float c){
        float avg = (a+b+c)/3;
        return avg; 
}
// function to get the sum of all odd number till num 

public static int sumOdd(int num){
    int total=0;
    for(int i = 1;i<=num;i++){ 
    if(i%2!=0){
        total +=i;
    }
}
    return total;
}

// function to get greater number

public static int isGreater(int num1,int num2){
    if(num1>num2){
        return num1;
    }
    else{
        return num2;
    }
}

//function to calculate the Circumference of circle

public static float circumference(float r){
    float circum = 2*3.142f*r;
    return circum;
}

//function to indicate if a person is eligible to vote

public static String voteEligibility(int age){
    if(age >= 0){ 
    if(age>=18){
        return ("You are eligible to vote");
    }
    else{
        return( "You are not eligible to vote");
    }
    }
    else{
        return("Invalid age");
    }
}

//function to find the febonacci series

public static void febonacci(int n){
    int t1=0,t2=1;
    int total;
    System.out.print(t1+" ");
    for(int i =1;i<=n;i++){
        total = t1 + t2;
        t2 = t1;
        t1 = total;
        System.out.print(total + " ");
    }
    System.out.println();
}

//function to find power of a number r times n

public static int power(int r,int n){
    int total=1;
    for(int i =1;i<=n;i++){
       total*=r;
    }
    return total;
}

// function to find the count of positive , negative and zeros

public static void numberCounter(){
    Scanner sc = new Scanner (System.in);
    int input;
    int positive=0;
    int negative=0;
    int zero=0;
    int n;
    do{
        System.out.println("Enter your number");
        n=sc.nextInt();
        if(n==0){
            zero++;
        }
        else if(n%2==0){
            positive++;
        }
        else{
            negative++;
        }
        System.out.println("Enter 1 for another input and 0 to stop");
        input=sc.nextInt();
    }while(input==1);
    System.out.println("Positive numbers : "+ positive);
    System.out.println("Negative numbers : "+ negative);
    System.out.println("Zeros : "+ zero);
}
    public static void main(String[] args){
        
    }   
}