import java.util.ArrayList;

class Student {
    private String name;
    Student(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }
}

class Department {
    private String name;
    Department(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }
}

public class University_b {
    private String name;
    private ArrayList<Student> studentList = new ArrayList<>();
    private ArrayList<Department> depList = new ArrayList<>();
    public University_b(String sname[], String dname[]) {
        for (int i = 0; i < sname.length; i++) {
            studentList.add(new Student(sname[i]));
        }
        for (int i = 0; i < dname.length; i++) {
            depList.add(new Department(dname[i]));
        }
    }

    Department getDepartment(String dkey) {
        for (int i = 0; i < depList.size(); i++) {
            if (depList.get(i).getName().equals(dkey)) {
                return depList.get(i);
            }
        }
        return null;
    }

    public void enrollstd(String dname,String sname){
        Department dep = new Department(dname);
        Student std = new Student(sname);
        depList.add(dep);
        studentList.add(std);
    }
    public void display() {
        for (int i = 0,j=0; i < depList.size()&&j<studentList.size(); i++,j++) {
           System.out.println("The Department for Student "+studentList.get(i).getName()+" is "+depList.get(i).getName());
        }
    }
       public static void main(String[] args) {
        String sname[] = {"Hassan", "Dayan", "Mohsin"};
        String dname[] = {"CS", "SW","EL"};
        University_b muet = new University_b(sname, dname);
        muet.display();
    }
}
