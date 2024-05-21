import java.util.ArrayList;
import java.util.List;

class Book {
	 String title;
	 String author;

	public Book(String title,String author){
		this.title = title;
		this.author = author;

	}
}
	 public class Liberuary_2{
		 ArrayList<Book> books;
		public Liberuary_2(){
			this.books = new ArrayList<>();
		}
		public void addBook(Book book){
			books.add(book);
		}
		void printBooks(){
			for(Book bt:books){
				System.out.println(bt.title+" "+bt.author);
			}
		}
		public static void main(String args[]){
			Liberuary_2 library = new Liberuary_2();
			Book book1 = new Book("king of Snooker","Dayan mughal");
			Book book2 = new Book("Unititled","Hassan rajput");
			library.addBook(book1);
			library.addBook(book2);
			library.printBooks();
	}
}

