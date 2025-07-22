package in.test2;
//iterator,hasnext,next
import java.util.*;
public class Q07 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Virat");
		list.add("Rohit");
		list.add("Rahul");
		list.add("Pandya");
		
		Iterator<String> l = list.iterator();
		
		while(l.hasNext()) {
			String name = l.next();
			if(name=="Rohit") {
				l.remove();
			}
		}
		
		System.out.println(list);
		
	}

}
