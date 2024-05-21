import java.util.ArrayList;
public class Continent{
	private String Cname;
	private long population;
	private Country ctry = new Country(Cname, population);
	private ArrayList <Country> country = new ArrayList<>();
	Continent(){
		Cname = "Nil";
		population = 0;
	}
	Continent(String Cname,long population){
		this.Cname = Cname;
		this.population = population;
		addCountry(ctry);
	}
	String getCname(){
		return Cname;
	}
	long getPopulation(){
		return population;
	}
	Country getCountry(){
		return ctry;
	}
	void addCountry(Country c){ 
		country.add(c);
	}
	long calPopulation(){
		long totalPopulation = 0;
		for(int i = 0;i<country.size();i++){
			totalPopulation+=country.get(i).getPopulation();
		}
		return totalPopulation;
	}
	
	public static void main(String[] args) {
		System.out.println("Works");
		Country c = new Country("Pakistan", 23456);
		Continent cont1 = new Continent("Asia", 22000000);
		Continent cont2 = new Continent("Europe", 230000000);
	}
}
class Country{
	private String countName;
	private long population;
	private ArrayList<City> cty = new ArrayList<>();
	
	Country(){
		countName = "Nil";
		population = 0;
	}
	Country(String countName,long population){
		this.countName=countName;
		this.population = population;
	}
	String getcountName(){
		return countName;
	}
	long getPopulation(){
		return population;
	}
}
class City{ 
	private String cityName;
	private long population;
	City(){
		cityName = "Nil";
		population = 0;
	}
	City(String cityName,long population){
		this.cityName  = cityName;
		this.population = population;
	}
	String getCityName(){
		return cityName;
	}
	long population(){
		return population;
	}
}
