package in.test2;
//Comparable
import java.util.*;
class Fruit implements Comparable<Fruit>{

	String name;
	int price;
	
	Fruit(String name,int price){
		this.name=name;
		this.price=price;
	}
	
	@Override
	public int compareTo(Fruit f) {
		return this.price-f.price;
	}
	
	public String toString() {
		return name+" "+price;
	}
	
}

public class Q02 {
	public static void main(String[] args) {
		
		List<Fruit> l = new ArrayList<>();
		l.add(new Fruit("Banana",26));
		l.add(new Fruit("Mango",120));
		l.add(new Fruit("Apple",90));
		
		Collections.sort(l);
		System.out.println(l);
		
		
	}

}
