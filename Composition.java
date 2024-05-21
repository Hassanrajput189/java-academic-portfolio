import java.util.ArrayList;
public class Composition {
    public static void main(String[] args) {
        Author a = new Author("Willium shp","book1","book2","book3","book4");
        a.displayBooks();
    }
}
class Book{
    String name;
Book(){
    name = "Nil";
}
Book(String name){
    this.name = name;
}
String getName(){
    return name;
}
}
class Author{
    String name;
    ArrayList <Book> bookList = new ArrayList<>();
    Author(String name,String ...bookName){
        this.name = name;
        for(int i = 0;i<bookName.length;i++){
            Book b = new Book(bookName[i]);
            addBooks(b);
        }
    }
    void addBooks(Book b){
        bookList.add(b);
    }
    void displayBooks(){
        System.out.println("Books of "+name);
        for (int i = 0 ;i<bookList.size();i++){
            System.out.println(bookList.get(i).getName());
        }
    }
}
