// Encapsulation: Data hiding and exposing it through getter and setter methods

class Property {
    private String address;
    private double price;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

// Inheritance: Inheriting common features of properties

class House extends Property {
    private int bedrooms;

    public House(String address, double price, int bedrooms) {
        setAddress(address);
        setPrice(price);
        this.bedrooms = bedrooms;
    }
}

class Apartment extends Property {
    private int numberOfRooms;

    public Apartment(String address, double price, int numberOfRooms) {
        setAddress(address);
        setPrice(price);
        this.numberOfRooms = numberOfRooms;
    }
}

// Polymorphism: Using method overriding

class PropertyManager {
    public void manageProperty(Property property) {
        System.out.println("Managing property at " + property.getAddress());
    }
}

// Abstraction: Defining a property management system interface

public interface PropertyManagement {
    void rentProperty();
    void sellProperty();
    public static void main(String args[]){
        System.out.println("Works");
    }
}
