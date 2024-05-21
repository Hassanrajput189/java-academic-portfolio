import java.util.ArrayList;
import java.util.Scanner;

public class Aggrigation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of your University");
        String name = sc.next();        
        System.out.println("Enter the no of Departments");
        int departments = sc.nextInt();
        University u1 = new University(name, departments);
        System.out.println("Enter the name of student");
        String stdName = sc.next();
        System.out.println("Enter the Age of the student");
        int age = sc.nextInt();
        System.out.println("Enter the roll no of the student");
        int rollNo = sc.nextInt();
        Student s1 = new Student(stdName, age, rollNo);
        u1.addStd(s1);
        u1.displayStd();
    }
}
class University{
    private String name;
    private int noOfDep;
    private ArrayList<Student> stdList = new ArrayList<>();
    University(String name,int noOfDep){
        this.name = name;
        this.noOfDep = noOfDep;
        stdList = new ArrayList<>();
    }
    String getName(){
        return name;
    }
    int getNoOfDep(){
        return noOfDep;
    }
    void addStd(Student d){
        stdList.add(d);
    }
    void displayUniInfo(){
        System.out.println("The Name of the University is "+name);
        System.out.println("The Departments in the University are "+noOfDep);
    }
    void displayStd(){
        displayUniInfo(); 
        for(Student s :stdList){
            System.out.println("The Name of the Student is "+s.getName());
            System.out.println("The age of the student is "+s.getAge());
            System.out.println("The Roll No of the student is "+s.getRollNo());
        }
    }
}
class Student{
    private String name;
    private int age;
    private int rollNo;
    Student(String name,int age,int rollNo){
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
    }
    String getName(){
        return name;
    }
    int getAge(){
        return age;
    }
    int getRollNo(){
        return rollNo;
    }
}
