package in.papers.mock;
import java.util.*;
////Enumeration
//legacy; works only with Vector, Stack, etc.
//Only supports forward traversal
//
//Can't remove or modify elements
//
//Used with legacy classes
public class Enmrtion {
	
	public static void main(String[] args) {
		Vector<String> fruits = new Vector<>();
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Apple");

        Enumeration<String> en = fruits.elements();
        System.out.println("Using Enumeration:");
        while (en.hasMoreElements()) {
            System.out.println(en.nextElement());
        }
	}

}
/*
 * ✅ Java Collections Cheat Sheet
Category	Implementation	Ordered?	Duplicates Allowed?	Nulls Allowed	Key Features
List	ArrayList	✅ Insertion order	✅ Yes	✅ Multiple nulls	Fast random access; slow for insert/delete in middle
LinkedList	✅ Insertion order	✅ Yes	✅ Multiple nulls	Fast insert/delete; slow random access
Vector	✅ Insertion order	✅ Yes	✅ Multiple nulls	Synchronized (thread-safe); legacy
Stack	✅ Insertion order	✅ Yes	✅ Multiple nulls	LIFO (last-in-first-out); extends Vector
Set	HashSet	❌ Unordered	❌ No	✅ One null	Fast, no duplicates, unordered
LinkedHashSet	✅ Insertion order	❌ No	✅ One null	Maintains insertion order, no duplicates
TreeSet	✅ Sorted order	❌ No	❌ Nulls not allowed	Sorted set (natural/custom order)
Map	HashMap	❌ Unordered	❌ Keys unique	✅ One null key, multiple null values	Fast, key-value pairs, no order
LinkedHashMap	✅ Insertion order	❌ Keys unique	✅ Same as HashMap	Maintains order of insertion
TreeMap	✅ Sorted by keys	❌ Keys unique	❌ Null key not allowed	Sorted map (natural/custom order)
Hashtable	❌ Unordered	❌ Keys unique	❌ Null not allowed	Thread-safe (legacy), slower
ConcurrentHashMap	❌ Unordered	❌ Keys unique	❌ Null not allowed	Thread-safe, high performance, concurrent access

📌 Quick Usage Guide:
Use ArrayList → for general purpose, fast read.

Use LinkedList → for frequent insert/delete.

Use HashSet → when uniqueness matters, no order needed.

Use LinkedHashSet → when you want uniqueness and order.

Use TreeSet → when you want sorted unique values.

Use HashMap → most common map for fast key-value access.

Use LinkedHashMap → when you need order preserved.

Use TreeMap → when keys need to be sorted.

Use ConcurrentHashMap → in multi-threaded programs.


 * 
 * 
 * 
 */
