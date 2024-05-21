// public class Threading{
//     public static void main(String[] args) {
//         ThreadDemo mt1= new ThreadDemo(1);
//         mt1.start();
//         ThreadDemo mt2 = new ThreadDemo(2);
//         mt2.start();
//     }
// }
// class ThreadDemo extends Thread{
//     private int n;
//     public ThreadDemo(int n){
//         this.n = n;
//     }
//     @Override
//     public synchronized void run(){
//         int total = 0;
//         System.out.println("The table of " + n +" is ");
//         for(int i = 1;i<=10;i++){
//             try{
//                 Thread.sleep(1000);
//                 total+=n;
//                 System.out.println( total +" ");
//             }
//             catch(Exception e){
//                 e.printStackTrace();
//             }
//         }System.out.println();
//     }
// }
class A extends Thread{
    public void display(){  
        System.out.println("This is display");
    }
    public void run(){
        display();
    }
}
class B implements Runnable{
    public void display(){  
        System.out.println("This is display from implement");
    }
    public void run(){
        for(int i = 0;i<10;i++) {
            try{
            Thread.sleep(1000);
             display();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    }
}
public class Threading {
    public static void main(String[] args) throws InterruptedException {
        A a = new A();
        B b = new B();
        Thread t = new Thread(b);
        t.start();
        // Thread workerThread = new Thread(() -> {
        //     for (int i = 1; i <= 5; i++) {
        //         System.out.println("Worker: " + i);
        //     }
        // });

        // workerThread.start();
        // workerThread.join(); 

        // System.out.println("Main: Worker thread has completed.");
    }
}
