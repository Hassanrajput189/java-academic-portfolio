public class ThreadingByRunnable {
   public static void main(String[] args)throws InterruptedException {
     ThreadDemo td1 = new ThreadDemo();
     ThreadDemo td2 = new ThreadDemo();
     Thread t1 = new Thread(td1);
     Thread t2 = new Thread(td2);
     td1.display1();
     td2.display2();
    t1.start();
    t1.join();
    t2.start();
    t2.join();     
   
   }
}
class ThreadDemo implements Runnable{
     @Override
    public  void run() {
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j <= i; j++) {
                try {
                    Thread.sleep(1000);
                    System.out.print("*");
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
            System.out.println();
        }
    }
    public void display1(){
        System.out.println("This is display 1");
    }
    public void display2(){
        System.out.println("This is display 2");
    }
}

