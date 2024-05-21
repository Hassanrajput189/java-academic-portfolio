// City class represents a basic city
class City {
    private String name;
    private int population;
    private String country;

    public City(String name, int population, String country) {
        this.name = name;
        this.population = population;
        this.country = country;
    }

    public void displayInfo() {
        System.out.println("City: " + name);
        System.out.println("Population: " + population);
        System.out.println("Country: " + country);
    }
    
    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    public String getCountry() {
        return country;
    }
}

// Subclass 1: CapitalCity represents a capital city
class CapitalCity extends City {
    private String government;

    public CapitalCity(String name, int population, String country, String government) {
        super(name, population, country);
        this.government = government;
    }

    public void displayGovernment() {
        System.out.println("Government: " + government);
    }
}

// Subclass 2: TouristCity represents a tourist city
class TouristCity extends City {
    private int touristAttractions;

    public TouristCity(String name, int population, String country, int touristAttractions) {
        super(name, population, country);
        this.touristAttractions = touristAttractions;
    }

    public void displayTouristAttractions() {
        System.out.println("Tourist Attractions: " + touristAttractions);
    }
}

// Subclass 3: IndustrialCity represents an industrial city
class IndustrialCity extends City {
    private String majorIndustry;

    public IndustrialCity(String name, int population, String country, String majorIndustry) {
        super(name, population, country);
        this.majorIndustry = majorIndustry;
    }

    public void displayMajorIndustry() {
        System.out.println("Major Industry: " + majorIndustry);
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating instances of City and its subclasses
        City city = new City("Generic City", 1000000, "Generic Country");
        CapitalCity capitalCity = new CapitalCity("Capital City", 2000000, "Capital Country", "Democratic");
        TouristCity touristCity = new TouristCity("Tourist City", 500000, "Tourist Country", 10);
        IndustrialCity industrialCity = new IndustrialCity("Industrial City", 800000, "Industrial Country", "Manufacturing");

        // Demonstrating inheritance and association
        capitalCity.displayInfo();
        capitalCity.displayGovernment();

        touristCity.displayInfo();
        touristCity.displayTouristAttractions();

        industrialCity.displayInfo();
        industrialCity.displayMajorIndustry();
    }
}