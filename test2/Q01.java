package in.test2;
//one to many

import java.util.*;

class Book{
	String name;
	
	Book(String name){
		this.name=name;
	}
	
	void display() {
		System.out.println("Book : "+name);
	}
}

class Library{
	//Book book;
	String libName;
	List<Book> books;
	
	Library(String libName){
		this.libName=libName;
		books = new ArrayList<>();
	}
	
	void addBook(Book book) {
		books.add(book);
	}
	
	void show() {
		System.out.println("Library Name : "+libName);
		for(Book b : books) {
			b.display();
		}
	}
}
public class Q01 {
	
	public static void main(String[] args) {
		Book b1 = new Book("Harry Potter");
		Book b2 = new Book("IronMan");
		
		Library l = new Library("Central Library");
		l.addBook(b1);
		l.addBook(b2);
		l.show();
	}

}
