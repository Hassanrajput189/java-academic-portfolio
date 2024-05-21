import java.util.Scanner;
public class Permutations {
    void printPerm(String str, String permutations) {
        if (str.length() == 0) {
            System.out.println(permutations);
        }
        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            printPerm(newStr, permutations + currChar);
        }
    }
    
    public static void main(String[] args) {
        Permutations p = new Permutations();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Stirng");
        String str = sc.next();
        System.out.println("The Permutations for the Stirng "+str +" are:");
        p.printPerm(str, "");
    }
}
