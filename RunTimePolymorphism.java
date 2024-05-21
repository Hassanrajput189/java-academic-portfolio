
abstract class Quadrilateral{
    double s1,s2,s3,s4;
    Quadrilateral(double s1,double s2,double s3,double s4){
        this.s1=s1;
        this.s2=s2;
        this.s3=s3;
        this.s4=s4;
    }
    abstract double computeArea();
}
class Square extends Quadrilateral{
    Square(double s1){
        super(s1,s1,s1,s1);
    }
    @Override
    public double computeArea(){
        return (s1*s1);
    }
}
class Rectangle extends Quadrilateral{
    Rectangle(double s1,double s2){
        super(s1, s2, s1, s2);
    }
    @Override
    public double computeArea(){
        return(s1*s2);
    }
}
public class RunTimePolymorphism {
    /*create a burger class containing attributes
     meat type(String)
     price(String)
     fries(boolean)
    cheese (String)
    methods:
    make burger
    class:
    child class
    beaf burger
    anda wala burger
    pickels(boolean) 
    */
    public static void main(String[] args) {
        Quadrilateral refVar;
        Square s1 = new Square(2.0);
        Rectangle r1 = new Rectangle(1.0,2.0);
        System.out.println(r1.computeArea());
        refVar = new Rectangle(1.0,2.0);
        System.out.println("Area of rectangle "+refVar.computeArea());
        refVar = s1;
        System.out.println("Area of square " + refVar.computeArea());
    }   
}
