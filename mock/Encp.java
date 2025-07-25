package in.papers.mock;
//Encapsulation

class Movie{
	private String name;
	private int year;
	
	void setYear(int year) {
		this.year = year;
	}
	
	void setName(String name) {
		this.name=name;
	}
	
	String getName() {
		return name;
	}
	
	int getYear() {
		return year;
	}
	
}
public class Encp {
	public static void main(String[] args) {
		Movie m = new Movie();
		m.setName("KGF");
		m.setYear(2019);
		
		System.out.println(m.getName()+" "+m.getYear());
	}
}
