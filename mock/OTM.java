package in.papers.mock;
//One to many
import java.util.*;

class Book{
	String name;
	
	
	Book(String name){
		this.name=name;
		
	}
	
	void show() {
		System.out.println("Book Name : "+name);
	}
}

class Library{
	String lName;
	List<Book> books;
	
	Library(String lName){
		this.lName=lName;
		books = new ArrayList<>();
	}
	
	void addBook(Book book) {
		books.add(book);
	}
	
	void display() {
		System.out.println("Lib Name - "+lName);
		for(Book b : books) {
			b.show();
		}
	}
	
	
}
public class OTM {
	
	public static void main(String[] args) {
		
		Book b1 = new Book("Harry Potter");
		Book b2 = new Book("GOT");
		Book b3 = new Book("LOR");
		
		Library l = new Library("Fiction");
		
		l.addBook(b1);
		l.addBook(b2);
		l.addBook(b3);
		l.display();
	}

}
