package in.paper1;
import java.util.*;

public class Set1 {
    public static void main(String[] args) {
        // HashSet - no order
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Banana");
        hashSet.add("Apple");
        hashSet.add("Mango");
        hashSet.add("Apple");  // duplicate

        // TreeSet - sorted order
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Banana");
        treeSet.add("Apple");
        treeSet.add("Mango");

        // LinkedHashSet - insertion order
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Banana");
        linkedHashSet.add("Apple");
        linkedHashSet.add("Mango");

        System.out.println("HashSet (no order): " + hashSet);
        System.out.println("TreeSet (sorted): " + treeSet);
        System.out.println("LinkedHashSet (insertion order): " + linkedHashSet);
    }
}

/*
 * ✅ Key Differences:
Type	Maintains Order?	Allows Duplicates?	Sorted?
HashSet	❌ (No order)	❌	❌
LinkedHashSet	✅ (Insertion order)	❌	❌
TreeSet	✅ (Sorted order)	❌	✅
 */


