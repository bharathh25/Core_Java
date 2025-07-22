package in.paper3;
//Encapsulation


class Pokemon{
	private String name;
	private int age;
	
	public void setName(String name) {
		this.name= name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		if(age>0) {
			this.age= age;
		}
		else {
			System.out.println("Enter a valid age!!!");
		}
	}
	
	public int getAge(){
		return age;
	}
	
}
public class Q05 {
	public static void main(String[] args) {
		Pokemon p = new Pokemon();
		p.setName("Pikachu");
		p.setAge(10);
		
		System.out.println("Name : "+p.getName()+", Age : "+p.getAge());
		
	}

}
