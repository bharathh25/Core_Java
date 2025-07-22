package in.paper3;
//List, Set, Map

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Q06 {
	public static void main(String[] args) {
		List<String> a = new ArrayList<>();
		a.add("Virat");
		a.add("Rohit");
		a.add("KL Rahul");
		a.add("KL Rahul");
		
		for(String s : a) {
			System.out.println(s);
		}
		
		System.out.println("------------------");
		
		Set<String> s = new HashSet<>();
		s.add("Virat");
		s.add("Rohit");
		s.add("KL Rahul");
		s.add("KL Rahul");
		
		for(String n : s) {
			System.out.println(n);
		}
		
		System.out.println("------------------");
		
		Map<Integer,String> m = new HashMap<>();
		m.put(1, "Sachin");
		m.put(2, "Rohit");
		m.put(3, "Rahul");
		m.put(1, "Virat");
		
		for(Map.Entry<Integer, String> e : m.entrySet()) {
			System.out.println("Rank : "+e.getKey()+", Name : "+e.getValue());
		}
	}

}
