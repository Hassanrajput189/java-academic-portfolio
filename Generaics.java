public class Generaics{
    public static void main(String[] args) {
        GeneraicsDemo<String> g1 = new GeneraicsDemo("Hassan", "Rajput");
        GeneraicsDemo<Integer> g2 = new GeneraicsDemo(19, 20);
        GeneraicsDemo<Float> g3 = new GeneraicsDemo(2.0, 3.0);
        g1.displayVal();
        g2.displayVal();
        g3.displayVal();
    }
}
class GeneraicsDemo<T>{
    private T val1;
    private T val2;
    public GeneraicsDemo(T val1,T val2){
        this.val1 = val1;
        this.val2 = val2;
    }
    public void displayVal(){
        System.out.println("The value of val1 is "+val1);
        System.out.println("The value of val2 is "+ val2);
    }
}   
