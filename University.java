
import java.util.ArrayList;
import java.util.Scanner;
class Student{
	private String name;
	private String rollNo;
	Student(){}
	Student(String name,String rollNo){
		this.name = name;
		this.rollNo = rollNo;
	}
	String getName(){
		return name;
	}
	String getRollNo(){
		return rollNo;
	}
}
class Department{
	private String name;
	private byte noOfClasses;
	private byte noOfLabs;
	private ArrayList <Student> stdList = new ArrayList<>();
	Department(String name,byte noOfClasses,Byte noOfLabs){
		this.name = name;
		this.noOfClasses = noOfClasses;
		this.noOfLabs = noOfLabs;
	}
	String getName(){
		return name;
	}
	byte getNoOfClasses(){
		return noOfClasses;
	}
	byte getNoOfLabs(){
		return noOfLabs;
	}
	void addStudent(String name,String rollNo){
		Student s = new Student(name,rollNo);
		stdList.add(s);
	}
	void getStudInfo(){
		for(Student st:stdList){
			System.out.println("Name : "+st.getName());
			System.out.println("RollNo : "+st.getRollNo());
		}
	}
}
class University{
	private String name;
	private byte noOfDep;
	private long totalStudents=0;
	private ArrayList <Department> depList = new ArrayList<>();
	private ArrayList <Student> studList = new ArrayList<>();
	University(String name,byte noOfDep){
		this.name = name;
		this.noOfDep = noOfDep;
	}
	String getName(){
		return name;
	}
	byte getNoOfDep(){
		return noOfDep;
	}
	long getTotalStudents(){
		for(int i = 0;i<studList.size();i++){
			totalStudents++;
		}
		return totalStudents;
	}
	void addDep(String name,byte noOfClasses,byte noOfLabs){
		Department d = new Department(name,noOfClasses,noOfLabs);
		depList.add(d);
	}
	void addStudent(String name,String rollNo){
		Student s = new Student(name,rollNo);
		studList.add(s);
	}
	void getDepInfo(){
		for(Department dt:depList){
			System.out.println("Department : "+dt.getName());
			System.out.println("No of classes : "+dt.getNoOfClasses());
			System.out.println("No of Labs : "+dt.getNoOfLabs());
		}
	}
	void getStudInfo(){
		for(Student st:studList){
			System.out.println("Name : "+st.getName());
			System.out.println("RollNo : "+st.getRollNo());
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		University test = new University("Mehran",(byte)20);
		char input;
		do{
			System.out.println("Enter first name of the student");
			String firstName = sc.next()+" ";
			System.out.println("Enter last name of the student");
			String lastName = sc.next();
			String fullName = firstName.concat(lastName);
			System.out.println("Enter the roll no of the student");
			String rollNo = sc.next();
			test.addStudent(fullName,rollNo);
			System.out.println("press y for another input or press any key to exit");
			input = sc.next().charAt(0);
		}while(input =='y');
		System.out.println("the total no of students entered are :"+test.getTotalStudents());
		
	}
}