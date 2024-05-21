abstract class Kohsar {
    int noOfHouses;
    String address;

    public Kohsar(int noOfHouses, String address) {
        this.noOfHouses = noOfHouses;
        this.address = address;
    }

    abstract void display();
}

class Phase_1 extends Kohsar {
    String area;

    public Phase_1(int noOfHouses, String address, String area) {
        super(noOfHouses, address);
        this.area = area;
    }

    void display() {
        System.out.println(noOfHouses);
        System.out.println(address);
        System.out.println(area);
    }
}

public class Association {
    public static void main(String[] args) {
        Phase_1 p1 = new Phase_1(20, "House no c 72", "150 gz");
        p1.display(); // Call the display method of Phase_1
    }
}
