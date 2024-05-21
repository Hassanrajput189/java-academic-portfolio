import java.util.Arrays;
public class Employee{
        String name;
        int age;
        Employee(){
            name = "Ali";
            age = 20;
        }
        Employee(String name, int age){
            this.name = name;
            this.age = age;
        }
        public void display(Employee e[]){
           for(Employee et: e){
            System.out.println(et.name+" "+ et.age);
           }
        }
        public static void main(String args[]){
            Employee e1 = new Employee();
            Employee e2 = new Employee();
            Employee e3 = new Employee();
            Employee e4 = new Employee();
            Employee e5 = new Employee();
            Employee e6 = new Employee("Hassan",18);
            Employee e7 = new Employee("Dayan",20);
            Employee e8 = new Employee("Zain",50);
            Employee e9 = new Employee("Safi",21);
            Employee e10 = new Employee("Yousuf",20);
            Employee arr[] = {e1,e2,e3,e4,e5,e6,e7,e8,e9,e10};
                e1.display(arr);
            }
      }