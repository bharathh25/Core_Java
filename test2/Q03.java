package in.test2;
//Comparator

import java.util.*;

class Fruit1{
	String name;
	int price;
	
	Fruit1(String name,int price){
		this.name=name;
		this.price=price;
	}
	
	public String toString() {
		return name+" "+price;
	}
}


public class Q03 {
	public static void main(String[] args) {
		List<Fruit1> list = new ArrayList<>();
		list.add(new Fruit1("Banana",26));
		list.add(new Fruit1("Mango",120));
		list.add(new Fruit1("Apple",90));
		
		Collections.sort(list, new Comparator<Fruit1>() {

		public int compare(Fruit1 a, Fruit1 b) {
			return a.name.compareTo(b.name);
		}
			
		});
		
		System.out.println(list);
	}
}
