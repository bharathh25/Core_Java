package in.paper1;
//Java Code Example: Using hasNext(), next(), remove()

import java.util.*;


public class Q03 {
	public static void main(String[] args) {
		List<String> s = new ArrayList<>();
		
		s.add("Virat");
		s.add("Rohit");
		s.add("Rahul");
		s.add("Pandya");
		s.add("Gill");
		System.out.println("Before : " + s);
		Iterator<String> i = s.iterator();
		
		while(i.hasNext()) {
			String name = i.next();
			if(name.equals("Rohit")) {
				i.remove();
			}
		}
		
		System.out.println("After : " + s);
		
	}

}
