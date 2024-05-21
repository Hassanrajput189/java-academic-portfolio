import java.util.Scanner;

class ChickenBurger extends Burger {
    private boolean addKetchup;
    private  boolean addMayo;
    ChickenBurger(String meatType, int price, boolean addFries, boolean addCheese, boolean addKetchup, boolean addMayo) {
    super(meatType, price, addFries, addCheese);
    this.addKetchup = addKetchup;
    this.addMayo = addMayo;
    }
    boolean getKetchup(){
        return addKetchup;
    }
    boolean getMayo(){
        return addMayo;
    }
    void makeBurger() {
        System.out.println("Here is your order");
        System.out.print(getMeatType()+" Burger with ");
        if(!getFries()&& !getCheese() && !getKetchup() && !getMayo()){
            System.out.println("nothing");
        }
        if(getFries()){
            System.out.print("Fries ");
        }
        if(getCheese()){
            System.out.print("Cheese ");
        }
        if(getKetchup()){
            System.out.print("Ketchup ");
        }
        if(getMayo()){
            System.out.print("Mayoneese ");
        }
        System.out.println();
    }
}
class BeefBurger extends Burger {
    private  boolean addKetchup;
    private boolean addMayo;

    BeefBurger(String meatType, int price, boolean addFries, boolean addCheese, boolean addKetchup, boolean addMayo) {
    super(meatType, price, addFries, addCheese);
    this.addKetchup = addKetchup;
    this.addMayo = addMayo;
}
    boolean getKetchup(){
        return addKetchup;
    }
    boolean getMayo(){
        return addMayo;
    }
    @Override
    void makeBurger() {
        System.out.println("Here is your order");
        System.out.print(getMeatType()+" Burger with ");
        if(!getFries()&& !getCheese() && !getKetchup() && !getMayo()){
            System.out.println("nothing");
        }
        if(getFries()){
            System.out.print("Fries ");
        }
        if(getCheese()){
            System.out.print("Cheese ");
        }
        if(getKetchup()){
            System.out.print("Ketchup ");
        }
        if(getMayo()){
            System.out.print("Mayoneese ");
        }
        System.out.println();
    }
}
abstract public class Burger {
    private String meatType;
    private  int price;
    private  boolean addFries;
    private  boolean addCheese;

    Burger(String meatType, int price, boolean addFries, boolean addCheese) {
        this.meatType = meatType;
        this.price = price;
        this.addFries = addFries;
        this.addCheese = addCheese;
    }
    String getMeatType(){
        return meatType;
    }
    int getPrice(){
        return price;
    }
    boolean getFries(){
        return addFries;
    }
    boolean getCheese(){
        return addCheese;
    }
    abstract void makeBurger();

    public static void main(String[] args) {
        System.out.println("Works");
        Scanner sc = new Scanner(System.in);
        String choose;
        boolean addFries = false , addCheese = false , addKetchup = false , addMayo = false;
        System.out.println("Enter your meat type"); 
        String meatType = sc.next();
        if (meatType.equals("chicken") || meatType.equals("beef")) {    
            System.out.println("Do you want Fries : (yes/no)");
            choose = sc.next();
            if(choose.equals("yes")){
                addFries = true;
            }
            System.out.println("Do you want Cheese : (yes/no)");
            choose = sc.next();
            if(choose.equals("yes")){
                addCheese = true;
            }
            System.out.println("Do you want Ketchup : (yes/no)");
            choose = sc.next();
            if(choose.equals("yes")){
                addKetchup = true;
            }
            System.out.println("Do you want Mayoneese : (yes/no)");
            choose = sc.next();
            if(choose.equals("yes")){
                addMayo = true;
            }
            if (meatType.equals("chicken")) {
                ChickenBurger ch = new ChickenBurger("Chicken",200,addFries, addCheese , addKetchup, addMayo);
                ch.makeBurger();
            } else {
                BeefBurger bf = new BeefBurger("Beef",250,addFries, addCheese , addKetchup, addMayo);
                bf.makeBurger();
            }
        } else {
            System.out.println("We dont have this type of meet");
        }
        sc.close();
    }
}
