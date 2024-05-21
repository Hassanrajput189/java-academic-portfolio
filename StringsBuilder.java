import java.util.Scanner;
public class StringsBuilder{
	public static void input(StringBuilder arr[]){
		Scanner sc = new Scanner(System.in);
		for(int i =0;i<arr.length;i++){
			System.out.println("Enter Text "+i+1);
			arr[i]= new StringBuilder(sc.nextLine());
		}
	}
	public static void replace(StringBuilder input){
	String result = new String();
	for(int i = 0;i<input.length();i++){
		char ch=input.charAt(i);
		if(ch=='e'){
			result+= 'i';
		}
		else{
			result+=ch;
		}
		}System.out.println(result);
	}
	public static void checkLength(StringBuilder arr[]){
		int len=0,total = 0;
		for(int i = 0 ;i<arr.length;i++){ 
		len= arr[i].length();
		total += len;
		System.out.println(len);
		}
		System.out.println("Combined length : "+total);
	}
	public static void display(StringBuilder arr[]){
		System.out.println("The names are:");
		for(StringBuilder sb:arr){ 
		System.out.println(sb);
		}
	}
	public static void createUserName(StringBuilder email){
		StringBuilder userName=new StringBuilder();
		for(int i = 0;i<email.length();i++){
			char ch = email.charAt(i);
			if(ch=='@'){
				break;
			}
			else{
				userName.append(ch);
			}
		}
		System.out.println("Your user name is "+userName);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// System.out.println("Enter size of the array");
		// int size = sc.nextInt();
		// StringBuilder arr[] = new StringBuilder[size];
		// input(arr);
		// checkLength(arr);
		// display(arr);
		System.out.println("Enter your email");
		StringBuilder email = new StringBuilder(sc.nextLine());
		// createUserName(email);
		replace(email);
	}
}