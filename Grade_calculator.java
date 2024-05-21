import java.util.Scanner;

public class Grade_calculator {
    public static int percentage_cal(int oop, int laag, int is, int ps, int pp) {
        if (oop < 0 || laag < 0 || is < 0 || ps < 0 || pp < 0){
            System.out.println("invalid input");
            return -1; // Returning -1 to indicate an error in input
        } else {
            System.out.println("Your percentage is");
            int total = 400;
            int percentage = (oop + laag + is + ps + pp) * 100 / total;
            System.out.println(percentage);
            return percentage; // Returning the calculated percentage
        }
    }

    public static void grade_calculator(int oop, int laag, int is, int ps, int pp) {
        int per=percentage_cal(oop, laag, is, ps, pp);
        if(per >=90){
            System.out.println("Congrats you secure A+ Grade with 4.0 GPA");
        }
        else if(per<90 && per >=81){
            System.out.println("Congrats you secure A Grade with 3.5 GPA");
        }
        else if(per<=80&& per >=73){
            System.out.println("Congrats you secure B+ Grade with 3.0 GPA");
        }
        else if(per <= 72&& per >=65){
            System.out.println("Congrats you secure B Grade with 2.5 GPA");
        }
        else if(per<= 64 && per >=60){
            System.out.println("Your Grade is C+ and GPA is 2.0");
            System.out.println("Nice effort but try to improve");
        }
        else if(per<=59&&per>=55){
            System.out.println("Your Grade is C and GPA is 1.5");
            System.out.println("Try to improve");
        }
        else if(per<=54&&per>=50){
            System.out.println("Your Grade is C- and GPA is 1.0");
            System.out.println("Try to improve");
        }
        else if(per<=50){
            System.out.println("Your Grade is F and GPA is 0.0");
            System.out.println("What are you doing");
        }
    }

    public static void main(String args[]){
        int major = 100, minor= 50;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter OOP marks: ");
        int oop = scanner.nextInt();
        if(oop>major){
            System.out.println("OOP is major");
            System.exit(0);
        }
        System.out.print("Enter LAAG marks: ");
        int laag = scanner.nextInt();
        if(laag > major){
            System.out.println("LAAG is major");
            System.exit(0);
        }
        System.out.print("Enter IS marks: ");
        int is = scanner.nextInt();
        if(is>minor){
            System.out.println("IS is minor");
            System.exit(0);
        }
        System.out.print("Enter PS marks: ");
        int ps = scanner.nextInt();
        if(ps>minor){
            System.out.println("PS is minor");
            System.exit(0);
        }
        System.out.print("Enter PP marks: ");
        int pp = scanner.nextInt();
        if(pp>major){
            System.out.println("PP is major");
            System.exit(0);
        }

        grade_calculator(oop, laag, is, ps, pp);
    }
}
