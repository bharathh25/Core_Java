package in.papers.mock;
import java.util.*;

public class FruitsCle implements Comparable<FruitsCle>{
	
	String name;
	int price;
	
	FruitsCle(String name,int price){
		this.name=name;
		this.price=price;
	}
	
//	public int compareTo(FruitsCle f) {
//		return f.price - this.price; //Desc by price
//	}
	
	public int compareTo(FruitsCle f) {
		return this.name.compareTo(f.name); //Alphabetical order
	}
	
	public String toString() {
		return name+" "+price;
	}
	
	public static void main(String[] args) {
		
		List<FruitsCle> list = new ArrayList<>();
		list.add(new FruitsCle("Mango",100));
		list.add(new FruitsCle("Banana",24));
		list.add(new FruitsCle("Grapes",30));
		list.add(new FruitsCle("Watermelon",55));
		
		Collections.sort(list);
		
		System.out.println(list);
		
		
	}

}
