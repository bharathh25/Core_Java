package in.papers.mock;
import java.util.*;

// //ListIterator
//for List only (e.g., ArrayList, LinkedList)
//Can go forward and backward
//
//Can add, remove, or update elements
//
//Must use only with classes that implement List

public class ListIteratorEx {
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		System.out.println(list);
		
		ListIterator<Integer> li = list.listIterator();
		
		while(li.hasNext()) {
			int a = li.next();
			
			if(a==2) {
				li.set(20);
			}
			
			if(a==5) {
				li.add(6);
			}
		}
		
		System.out.println(list);
	
		ListIterator<Integer> li1 = list.listIterator(); //To transverse reate new iterator
		while(li1.hasNext()) {
			System.out.println(li1.next());
		}
		
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
	}

}

/*
 *  while (lit.hasNext()) {
            String fruit = lit.next();

            // Update "Banana" to "Orange"
            if (fruit.equals("Banana")) {
                lit.set("Orange"); // update current element
            }

            // After "Apple", add "Grapes"
            if (fruit.equals("Apple")) {
                lit.add("Grapes"); // adds after Apple
            }
        }
         For Stringss
        
        */
