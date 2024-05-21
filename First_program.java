import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("Enter the marks for Maths");
        Scanner sc = new Scanner(System.in);
        int mathsMarks = sc.nextInt();
        
        System.out.println("Enter the marks for Physics");
        int physicsMarks = sc.nextInt();
        
        System.out.println("Enter marks for Chemistry");
        int chemistryMarks = sc.nextInt();
        
        System.out.println("Enter marks for English");
        int englishMarks = sc.nextInt();
        
        System.out.println("Enter marks for Urdu");
        int urduMarks = sc.nextInt();
        
        int totalMarks = 500;
        int obtainedMarks = mathsMarks + physicsMarks + chemistryMarks + englishMarks + urduMarks;
        int percentage = (obtainedMarks * 100) / totalMarks;
        System.out.println("Percentage: " + percentage + "%");
        
        // sc.close();
        // Scanner sc=new Scanner(System.in);
        // int sum =0, max =500;
        // String arr[]={"Maths","Physics","Chemistry","English","Urdu"};
        // for(int i=0;i<=4;i++){
        //     System.out.println("Enter your marks for "+ arr[i]);
        //     int total =sc.nextInt();
        //     sum +=total;
        //     }
        //     int per=(sum*100)/max;
        //     System.out.println("Your percentage is : "+per);
        //     sc.close();
    }
}
