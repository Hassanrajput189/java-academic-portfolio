import java.util.ArrayList;
public class PaperExample {
    public static void main(String[] args) {
        StudentTest t1 = new StudentTest("Hassan",19);        
    }  
}
class StudentTest{
    String name;
    int age;
    StudentTest(Stirng name,int age){
        this.name = name;
        this.age = age;
    }
    Stirng getName(){
        return name;
    }
    int getAge(){
        return age;
    }
}
class StudentManagement{
    ArrayList<StudentTest> list1 = new ArrayList<>();
    void addStudent(StudentTest s){
        list1.add(s); 
    }
    void displayTest(){
        for(int i = 0 ;i<list1.size();i++){
            System.out.println(list1.get(i).getName());
            System.out.println(list1.get(i).getAge());
        }
    }
}
