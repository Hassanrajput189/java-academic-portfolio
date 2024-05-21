public class ThreadSync {
    public static void main(String[] args) {
        CountryCapital cc = new CountryCapital();
        CountryCapital cc1 = new CountryCapital();
        MyThread mt1 = new MyThread();
        MyThread mt2 = new MyThread();
        mt1.setValue(cc);
        mt2.setValue(cc1);
        mt1.start();
        mt2.start();
        try{
            mt1.join();
            mt2.join();
        }   
        catch(Exception e ){
            System.out.println("This is an Exception");
        }
        System.out.println("Done");
    }
}
class CountryCapital{
    static int x = 0;

    public static synchronized void displayInt(){
        for(int i =0;i<4;i++){
                try{
            Thread.sleep(1000);
        }
        catch(Exception e){
            e.printStackTrace();          
        }
        System.out.println("The value of the number now is " + x++);
        }
        x = 0;
    }
    public synchronized void display(){
        System.out.println("This is Capital of Pakistan");
        try{
            Thread.sleep(1000);}
            catch(Exception e){
                System.out.println("Islamabad");
                System.out.println("This is captial of China");
                System.out.println("Beijing");
            }
        }
    }
    class MyThread extends Thread{
        CountryCapital cc;
        public void setValue(CountryCapital cc){
            this.cc = cc;
        }
        
        public void run(){
            cc.displayInt();
        }//end main Thread
    }