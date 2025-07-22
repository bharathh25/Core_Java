package in.paper1;

import java.util.ArrayList;
import java.util.List;

//One to many relationships

class Book{
	String title;
	
	Book(String title){
		this.title=title;
	}
	
	void show() {
		System.out.println("Book name : "+title);
	}
}

class Library{
	String name;
	List<Book> books;
	
	Library(String name){
		this.name=name;
		books = new ArrayList<>();
	}
	
	void AddBooks(Book book) {
		books.add(book);
	}
	
	void showBooks() {
		System.out.println("Library : "+name);
		for(Book b :books) {
			b.show();
		}
	}
}
public class Q04 {
	public static void main(String[] args) {
		Book b1 = new Book("Harry");
		Book b2 = new Book("Potter");
		
		Library l = new Library("Public");
		
		l.AddBooks(b1);
		l.AddBooks(b2);
		
		l.showBooks();
	}
}
