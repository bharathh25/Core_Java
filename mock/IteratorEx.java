package in.papers.mock;
import java.util.*;

//// Iterator
//Can go forward only
//
//Can remove elements
//
//Works with most collections
		
		
public class IteratorEx {
	
	public static void main(String[] args) {

		Set<String> set = new HashSet<>();
		set.add("Virat");
		set.add("Rohit");
		set.add("Pandya");
		set.add("Bumrah");
		set.add("Jadeja");
		
		System.out.println(set);
		Iterator<String> i = set.iterator();
		while(i.hasNext()) {
			String name = i.next();
			
			if(name=="Rohit")
				i.remove();
		}
		System.out.println(set);
	}

}
