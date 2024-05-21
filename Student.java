import java.util.Scanner;
class Student{
	String name;
	// void changeName(Student s1,Student s2){
	// 	s1.name=s2.name;
	// 	s2.name = this.name;
	// 	temp = s1.name;
	// 	System.out.println(s1.name);
	// 	System.out.println(s2.name);
	// 	System.out.println(this.name);
	// }
    void changeName(Student s1, Student s2){
        System.out.println("Before swapping");
        System.out.println("s1 = "+this.name);
        System.out.println("s2 = "+s1.name);
        System.out.println("s3 = "+s2.name);
        String temp = this.name;
        this.name = s1.name;
        s1.name = s2.name;
        s2.name = temp;
        System.out.println("After swapping");
        System.out.println("s1 = "+this.name);
        System.out.println("s2 = "+s1.name);
        System.out.println("s3 = "+s2.name);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        s1.name = "hassan";
        s2.name = "anas";
        s3.name = "ayan";

        s1.changeName(s2, s3);
    }
}
