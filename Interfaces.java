
interface Example{
    final int a = 0;
    static int b = 0;
    int c = 0;
    int d = 0;
    int e = 0;
    int f = 0;
    void modifyAttr(int a, int b);
    void printAll();
    private static int printInt(){
        return 3;
    }
}
interface Example2{ 
    public int add();
    public int sub();
    public int mul();
    public int div();
}

public class Interfaces implements Example,Example2{
    int a;
    int b;
    Interfaces(int a ,int b){
        this.a= a;
        this.b = b;
    }
    public int add(){
        System.out.println("this is "+ a + " + " + b);
        return a+b;
    }
     public int sub(){
        System.out.println("this is "+ a + " - " + b);
        return a-b;
    }
     public int mul(){
        System.out.println("this is "+ a + " * " + b);
        return a*b;
    }
     public int div(){
        System.out.println("this is "+ a + " + " + b);
        return a/b;

    }
    public void printAll(){
        System.out.println(add());
        System.out.println(sub());
        System.out.println(mul());
        System.out.println(div());
    }
    public void modifyAttr(int a ,int b){
        System.out.println("Now a = " + a + " and b = "+ b);
        this.a = a;
        this.b = b;
    }
        public static void main(String[] args) {
            int a = 2;
            int b = 4;
            Interfaces i1 = new Interfaces(a, b);
            i1.add();
            i1.sub();
            i1.mul();
            i1.div();
            i1.printAll();
            a = 1;
            b = 4;
            i1.modifyAttr(a, b);
            i1.add();
            i1.sub();
            i1.mul();
            i1.div();
            i1.printAll();
        }
    
}
