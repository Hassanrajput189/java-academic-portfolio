
import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
public class Date_of_birth{
	private int day;
	private int month;
	private int year;
	private ArrayList<Date_of_birth> date = new ArrayList<>();
	Date_of_birth(){
		day = 0;
		month = 0;
		year = 0;
	}
	Date_of_birth(int day,int month,int year){
		this.day = day;
		this.month = month;
		this.year = year;
	}
	int getDay(){
		return day;
	}
	int getMonth(){
		return month;
	}
	int getYear(){
		return year;
	}
	void addDate(Date_of_birth d){
		date.add(d);
	}
	  Date_of_birth calculateDate(Date_of_birth dob) {
        // Get the current date
        LocalDate currentDate = LocalDate.now();
        
        // Convert the input attributes to a LocalDate object
        LocalDate dateOfBirth = LocalDate.of(dob.year, dob.month, dob.day);
        
        // Calculate the difference between current date and date of birth
        Period period = Period.between(dateOfBirth, currentDate);
        
        // Get the years from the period
        int day = period.getDays();
        int month = period.getMonths();
        int year = period.getYears();
        Date_of_birth age = new Date_of_birth(day,month,year);
        return age;
    }

	public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in); 
		System.out.println("Enter your day of birth");
		int d = sc.nextInt();
		System.out.println("Enter the month");
		int m = sc.nextInt();
		System.out.println("Enter the year");
		int y = sc.nextInt();
		Date_of_birth do1 = new Date_of_birth(d,m,y);
		Date_of_birth currentAge = do1.calculateDate(do1);
		System.out.println("days"+currentAge.getDay());
		System.out.println("months"+currentAge.getMonth());
		System.out.println("years"+currentAge.getYear());
	}
}