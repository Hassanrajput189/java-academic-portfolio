//import java.util.ArrayList;
//import java.util.Scanner;
//class Book{
//	String name;
//	String author;
//	Book(String name,String author){
//		this.name = name;
//		this.author = author;
//	}
//}
//class Library{
//	ArrayList <Book> bookLib = new ArrayList<>();
//	void addBook(String n ,String a){
//		Book newBook = new Book(n,a);
//		bookLib.add(newBook);
//	}
//	void viewBooks(){
//		for(Book bt:bookLib){
//			System.out.println("The name of the book is :"+bt.name);
//			System.out.println("The author of the book is :"+bt.author);
//		}
//	}
//	public static void main(String[] args){
//		char input;
//		Library l = new Library();
//		Scanner sc = new Scanner(System.in);
//		do{
//		System.out.println("Enter the name of the book");
//		String bookName = sc.nextLine();
//		System.out.println("Enter the author of the book");
//		String bookAutor = sc.nextLine();
//		System.out.println("your book has been stored");
//		System.out.println("Press 'y' to add another book");
//		input =sc.next().charAt(0);
//		sc.nextLine();
//		l.addBook(bookName,bookAutor);
//		}while(input == 'y');
//		l.viewBooks();
//	}
//}