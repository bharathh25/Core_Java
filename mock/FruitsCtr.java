package in.papers.mock;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FruitsCtr {
	String name;
	int weight;
	
	FruitsCtr(String name,int weight){
		this.name=name;
		this.weight=weight;
	}
	
	public String toString() {
		return name+" "+weight;
	}

	
	public static void main(String[] args) {
		List<FruitsCtr> list = new ArrayList<>();
		list.add(new FruitsCtr("Mango",100));
		list.add(new FruitsCtr("Banana",24));
		list.add(new FruitsCtr("Grapes",30));
		list.add(new FruitsCtr("Watermelon",55));
		
		 // Sort by weight (ascending)
		Collections.sort(list, new Comparator<FruitsCtr>() {
            public int compare(FruitsCtr c1, FruitsCtr c2) {
                return c1.weight-c2.weight;
            }
        });
		
		
//        Collections.sort(list, new Comparator<FruitsCtr>() {
//            public int compare(FruitsCtr c1, FruitsCtr c2) {
//                return c1.name.compareTo(c2.name); //Alp order
//            }
//        });
        
        System.out.println(list);
	}
}
