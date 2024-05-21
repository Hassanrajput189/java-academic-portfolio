
import java.util.ArrayList;
import java.util.Scanner;
class City{
	private String name;
	private long population;
	City(){
		name = "Nil";
		population = 0;
	}
	City(String name,long population){
		this.name = name;
		this.population = population;
	}
	String getName(){
		return(name);
	}
	long getPopulation(){
		return(population);
	}
}
class Country{
	private String name;
	private long population;
	private String literacy_rate;
	private String capital;
	private ArrayList<Country> arrCountry = new ArrayList<>();
	private ArrayList<City> arrCity = new ArrayList<>();
	byte citycounter = 0;
	Country(){
		name = "Nil";
		population = 0;
		literacy_rate = "Nil";
		capital = "Nil";
	}
	Country(String name,long population,String literacy_rate,String cap){
		this.name = name;
		this.population = population;
		this.literacy_rate = literacy_rate;
		this.capital = cap;
		}
		String getName(){
			return (name);
		}
		long getPopulation(){
			return population;
		}
		String getLiteracy_rate(){
			return literacy_rate;
		} 
		String getCapital(){
			return capital;
		}
		void addCountry(String name,long population,String literacy_rate,String capital){
			Country countryOjb = new Country(name,population,literacy_rate,capital);
			arrCountry.add(countryOjb);
		}
		void addCity(String name , long population){
			City city = new City(name,population);
			arrCity.add(city);
			citycounter++;
		}
		void displayCity(){
			for(City ct:arrCity){
				System.out.println("City no "+ citycounter + " is : " + ct.getName());
				System.out.println("Population : "+ct.getPopulation());
			}
		}
		void displayCountry(){
			for(Country cntry:arrCountry){
				System.out.println("The name of the Countery is :"+cntry.getName());
				System.out.println("The Population of teh Country "+cntry.getPopulation());
				System.out.println("The Literacy rate is : "+cntry.getLiteracy_rate());
				System.out.println("The Capital of the Countery is : "+cntry.getCapital());
			}
		}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		char input;
		do{
		System.out.println("Enter the name of your country");
		String cName = sc.next();
		System.out.println("Enter the population of your Country");
		long population = sc.nextLong();
		System.out.println("Enter the literacy rate of your Country");
		String litRate = sc.next();
		System.out.println("Enter the capital city of your Country");
		String capital = sc.next();
		Country country = new Country(cName,population,litRate,capital);
		country.addCountry(cName,population,litRate,capital);
		System.out.println("press y to enter more city or press n to skip");
		input = sc.next().charAt(0);
		if(input == 'y'){ 
		do{
		System.out.println("Enter the name of the City");
		String cityName = sc.next();
		System.out.println("Enter the population of your City");
	long cityPop = sc.nextLong();
		country.addCity(cityName,cityPop);
		System.out.println("press y for another input or press any key to exit");
		input = sc.next().charAt(0);
		}while(input =='y');
	}		
		System.out.println("press y to view your data");
		input = sc.next().charAt(0);
		if(input =='y'){ 
			country.displayCountry();
			country.displayCity();
			System.out.println("The number of cities you entered are for your Country are : "+ country.citycounter);
		}
			else{ 
			System.out.println("press 1 for another Country");
			input = sc.next().charAt(0);
			}
		}while(input =='1');
	}	
}