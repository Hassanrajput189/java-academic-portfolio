// public class Inheritance {
//     Inheritance(){
//         System.out.println("This is the Constructor of Inheritance");
//     }
//     void print(){
//         System.out.println("This is the print method for the Inheritance class");
//     }
//     public static void main(String[] args) {
//         Inherited i1 = new Inherited();
//         Inheritance i2 = new Inherited();
//         i2.print(); 
//     }
// }
// class Inherited extends Inheritance{
//     Inherited(){
//         System.out.println("This is the Constructor of Inherited");
//     }
//     void print(){
//         System.out.println("This is the print method for the Inherited class");
//     }
// }

class Bag{
    String name;
    int size;
    Bag(String name,int size){
        this.name = name;
        this.size = size;
    }
}
class Zipper extends Bag{
    Boolean zipOn;
    Zipper(String name,int size,Boolean zipOn){
        super(name , size);
        this.zipOn = zipOn;
    }
    void display(){
        System.out.println(name);
        System.out.println(size);
    }    
}
public class Inheritance{
    public static void main(String[] args) {
        String name = "Hassan";
        int size = 5;
        Zipper z = new Zipper(name,size,true);
        z.display();
    }
}