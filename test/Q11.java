package in.test;
//Static variable

class Park{
	String name;
	int rank;
	static String location="Bengaluru";
	
	Park(String name,int rank){
		this.name=name;
		this.rank=rank;
	}
	
	void show() {
		System.out.println(name+", "+rank+", "+location);
	}
}
public class Q11 {
	
	public static void main(String[] args) {
		Park p = new Park("Lalbagh",1);
		Park p1 = new Park("JP Park",3);
		
		p.show();
		p1.show();
		
		Park.location="Vijayanagar";
		
		p.show();
		p1.show();
	}

}
