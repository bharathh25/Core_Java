package in.papers.mock;
//Static Variable

class College{
	String name;
	int year;
	static String clgName="VTU";
	
	College(String name,int year){
		this.year=year;
		this.name=name;
	}
	
	void display() {
		System.out.println(name+" "+year+" "+clgName);
	}
}
public class SticVar {
	public static void main(String[] args) {
		College c = new College("Virat",1999);
		c.display();
		
		College.clgName="Pentagon";
		College c1 = new College("Virat",1999);
		c1.display();
	}

}
