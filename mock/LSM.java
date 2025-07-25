package in.papers.mock;
//List,Set,Map
import java.util.*;
public class LSM {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		System.out.println(list);
		
		System.out.println("------------------------------");
		
		Set<String> set = new HashSet<>();
		set.add("Virat");
		set.add("Rohit");
		set.add("Pandya");
		set.add("Bumrah");
		set.add("Jadeja");
		
		System.out.println(set);
		
		System.out.println("------------------------------");
		
		Map<Integer,String> map = new HashMap<>();
		map.put(1,"Virat" );
		map.put(2,"rohit" );
		map.put(3,"Pandya" );
		map.put(4,"Bumrah" );
		map.put(5,"Jadeja" );
		
		for(Map.Entry<Integer, String> m : map.entrySet()) {
			System.out.println(m.getValue()+" "+m.getKey());
		}
		
		System.out.println("------------------------------");
	}
}
