+---------------------+       +---------------------+       +---------------------+
|        City         |       |        Town         |       |       Colony        |
+---------------------+       +---------------------+       +---------------------+
| - name: String      |       | - name: String      |       | - name: String      |
| - population: int   |       | - population: int   |       | - population: int   |
| - area: double      |       | - mayor: String     |       | - leader: String    |
|                   |       |                     |       |                     |
| + City(name, pop,   |       | + Town(name, pop,   |       | + Colony(name, pop, |
|   area)             |       |   mayor)            |       |   leader)          |
| + getName(): String |       | + getName(): String |       | + getName(): String |
| + getPopulation():  |       | + getPopulation():  |       | + getPopulation():  |
|   int               |       |   int               |       |   int               |
| + getArea(): double |       | + getMayor(): String|       | + getLeader():      |
| + setName(String):  |       | + setMayor(String): |       |   String            |
|   void              |       |   void              |       | + setName(String):  |
| + setPopulation(int):|       |                     |       |   void              |
|   void              |       | + addColony(Colony):|       | + setPopulation(int):|
| + setArea(double):  |       | + getColonies():     |       |   void              |
|   void              |       |   ArrayList<Colony> |       | + setLeader(String): |
+---------------------+       +---------------------+       +---------------------+
+
public class Main {
    public static void main(String[] args) {
        City myCity = new City("Metropolis", 1000000, 150.5);
        Town myTown = new Town("Central", 50000, "John Doe");
        Colony myColony = new Colony("Green Heights", 1000, "Jane Smith");

        myCity.addTown(myTown);
        myTown.addColony(myColony);
        
        // Accessing information
        System.out.println("City: " + myCity.getName());
        System.out.println("Population: " + myCity.getPopulation());
        System.out.println("Area: " + myCity.getArea());

        System.out.println("Towns in City: " + myCity.getTowns().size());
        System.out.println("Town in City: " + myCity.getTowns().get(0).getName());

        System.out.println("Colonies in Town: " + myTown.getColonies().size());
        System.out.println("Colony in Town: " + myTown.getColonies().get(0).getName());
    }
}
import java.util.ArrayList;

class City {
    private String name;
    private int population;
    private double area;
    private ArrayList<Town> towns;

    public City(String name, int population, double area) {
        this.name = name;
        this.population = population;
        this.area = area;
        this.towns = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    public double getArea() {
        return area;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void addTown(Town town) {
        towns.add(town);
    }

    public ArrayList<Town> getTowns() {
        return towns;
    }
}

class Town {
    private String name;
    private int population;
    private String mayor;
    private ArrayList<Colony> colonies;

    public Town(String name, int population, String mayor) {
        this.name = name;
        this.population = population;
        this.mayor = mayor;
        this.colonies = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    public String getMayor() {
        return mayor;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public void setMayor(String mayor) {
        this.mayor = mayor;
    }

    public void addColony(Colony colony) {
        colonies.add(colony);
    }

    public ArrayList<Colony> getColonies() {
        return colonies;
    }
}

class Colony {
    private String name;
    private int population;
    private String leader;

    public Colony(String name, int population, String leader) {
        this.name = name;
        this.population = population;
        this.leader = leader;
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    public String getLeader() {
        return leader;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public void setLeader(String leader) {
        this.leader = leader;
    }
}

