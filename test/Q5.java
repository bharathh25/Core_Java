package in.test;
//Encapsulation
class Book{
	private String bookName;
	private int pages;
	
	public void setName(String bookName) {
		this.bookName=bookName;
	}
	
	public void setPages(int pages) {
		this.pages=pages;
	}
	
	public String getName() {
		return bookName;
	}
	
	public int getPages() {
		return pages;
	}
	
	void show() {
		System.out.println("Name : "+bookName+", Pages : "+pages);
	}
}
public class Q5 {
	
	public static void main(String[] args) {
		Book b = new Book();
		b.setName("Harry Potter");
		b.setPages(890);
		b.show();
		
	}

}
