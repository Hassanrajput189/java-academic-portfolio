import java.util.Scanner;

class City {
    private String name;
    private int population;
    private String country;
    private double areaInKm;
    private int yearFounded;
    private String mayor;
    public City(String name, int population, String country, double areaInKm,int yearFounded,String mayor) {
        this.name = name;
        this.population = population;
        this.country = country;
        this.areaInKm = areaInKm;
        this.yearFounded = yearFounded;
        this.mayor = mayor;
    }

    public void displayInfo() {
        System.out.println("City: " + name);
        System.out.println("Population: " + population);
        System.out.println("Country: " + country);
        System.out.println("Area in Square Kilometers: " + areaInKm);
        System.out.println("Year Founded: "+yearFounded);
        System.out.println("Mayor: "+mayor);
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

    public double getAreaInKm() {
        return areaInKm;
    }
    public int getYearFounded(){
        return yearFounded;
    }
    public String getMayor(){
        return mayor;
    }
}

class TechnologyHubCity {
    private City city;
    private String techIndustry;
    private int techCompanies;
    private String university;

    public TechnologyHubCity(City city, String techIndustry, int techCompanies,String university) {
        this.city = city;
        this.techIndustry = techIndustry;
        this.techCompanies = techCompanies;
        this.university = university;
    }
    public String getTechIndustry(){
        return techIndustry;
    }
    public int getTechCompanies(){
        return techCompanies;
    }
    public String getUniversity(){
        return university;
    }

    public void displayTechHubInfo() {
        city.displayInfo();
        System.out.println("Tech Industry: " + techIndustry);
        System.out.println("Number of Tech Companies: " + techCompanies);
    }
}

class SeasideResortCity {
    private City city;
    private int touristAttractions;
    private String mainBeach;
    private String hotels;
    private double averageTemp;
    public SeasideResortCity(City city, int touristAttractions, String mainBeach,String hotels,double averageTemp) {
        this.city = city;
        this.touristAttractions = touristAttractions;
        this.mainBeach = mainBeach;
        this.hotels = hotels;   
        this.averageTemp =averageTemp;
    }
    public int getTouristAttraction(){
        return touristAttractions;
    }
    public String getMainBeach(){
        return mainBeach;
    }
    public String getHotels(){
        return hotels;
    }
    public double getAverageTemp(){
        return averageTemp;
    }

    public void displayResortCityInfo() {
        city.displayInfo();
        System.out.println("Tourist Attractions: " + touristAttractions);
        System.out.println("Main Beach: " + mainBeach);
    }
}

class CityThread extends Thread {
    private String input;
    private TechnologyHubCity thc;
    private SeasideResortCity src;

    public CityThread(String input, TechnologyHubCity thc) {
        this.input = input;
        this.thc = thc;
    }

    public CityThread(String input, SeasideResortCity src) {
        this.input = input;
        this.src = src;
    }

    @Override
    public void run() {
        if (input.equals("thc")) {
            if (thc != null) {
                thc.displayTechHubInfo();
            }
        } else if (input.equals("src")) {
            if (src != null) {
                src.displayResortCityInfo();
            }
        }
    }
}

public class MainCity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your choice: (thc for Technology Hub City, src for Seaside Resort City)");
        String choice = scanner.next();

        City city;
        TechnologyHubCity techHubCity;
        SeasideResortCity resortCity;
        CityThread cityThread;

        switch (choice) {
            case "thc":
                System.out.println("Enter the name of the city:");
                String cityName = scanner.next();
                System.out.println("Enter the population of the city:");
                int cityPopulation = scanner.nextInt();
                System.out.println("Enter the country of the city:");
                String cityCountry = scanner.next();
                System.out.println("Enter the area in Square Kilometers of the city:");
                double cityAreaInKm = scanner.nextDouble();
                System.out.println("Enter the year in which the city was founded");
                int year = scanner.nextInt();
                System.out.println("Enter the name of the Mayor of the city");
                String cmayor = scanner.next();
                System.out.println("Enter the tech industry in the city:");
                String cityTechIndustry = scanner.next();
                System.out.println("Enter the number of tech companies in the city:");
                int cityTechCompanies = scanner.nextInt();
                System.out.println("Enter the main university present in the city");
                String university = scanner.next();

                city = new City(cityName, cityPopulation, cityCountry, cityAreaInKm,year,cmayor);
                techHubCity = new TechnologyHubCity(city, cityTechIndustry, cityTechCompanies,university);
                cityThread = new CityThread(choice, techHubCity);
                cityThread.start();
                break;
            case "src":
                System.out.println("Enter the name of the city:");
                String resortCityName = scanner.next();
                System.out.println("Enter the population of the city:");
                int resortCityPopulation = scanner.nextInt();
                System.out.println("Enter the country of the city:");
                String resortCityCountry = scanner.next();
                System.out.println("Enter the area in Square Kilometers of the city:");
                double resortCityAreaInKm = scanner.nextDouble();
                System.out.println("Enter the year in which the city was founded");
                int cyear = scanner.nextInt();
                System.out.println("Enter the name of the Mayor of the city");
                String ctmayor = scanner.next();
                System.out.println("Enter the number of tourist attractions in the city:");
                int resortCityTouristAttractions = scanner.nextInt();
                System.out.println("Enter the main beach in the city:");
                String resortCityMainBeach = scanner.next();
                System.out.println("Enter the name of famous hotel in the city");
                String hotel = scanner.next();
                System.out.println("Enter the no of average Temperature in the city");
                double avgtemp = scanner.nextDouble();
                city = new City(resortCityName, resortCityPopulation, resortCityCountry, resortCityAreaInKm,cyear,ctmayor);
                resortCity = new SeasideResortCity(city, resortCityTouristAttractions, resortCityMainBeach,hotel,avgtemp);
                cityThread = new CityThread(choice, resortCity);
                cityThread.start();
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }
}
