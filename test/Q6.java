package in.test;
//List Set Map

import java.util.*;
public class Q6 {
	
	public static void main(String[] args) {
		
		List<String> l = new ArrayList<>();
		l.add("Virat");
		l.add("Rohit");
		l.add("KL Rahul");
		l.add("Pandya");
		
		System.out.println(l);
		
		System.out.println("----------------------------");
		System.out.println("Set");
		
		Set<String> s = new HashSet<>();
		s.add("Modi");
		s.add("Rahul");
		s.add("Siddu");
		s.add("DKS");
		System.out.println(s);
		
		System.out.println("----------------------------");
		System.out.println("Map");
		
		Map<Integer,String> m = new HashMap<>();
		m.put(1, "Virat Kohli");
		m.put(2, "Rohit Sharma");
		m.put(3, "Hardik Pandya");
		m.put(4, "Jasprit bumrah");
		
		for(Map.Entry<Integer, String> res :m.entrySet()) {
			System.out.println(res.getValue()+" "+res.getKey());
			
		}
		
	}

}
