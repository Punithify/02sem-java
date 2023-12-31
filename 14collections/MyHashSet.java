
// duplication is not allowed
// HashSet doesnot preserve order of insertion
// HashSet uses hashtable datastructure
// null values are allowed
// The capacity can be incresed if the load factor reaches a value greater than 75%

import java.util.HashSet;

class MyHashSet {
    public static void main(String args[]) {
        HashSet h1 = new HashSet(20, 2);
        HashSet h2 = new HashSet(20, 2);

        h1.add("hello");
        h1.add("world");
        // h2 = h1.clone();
        System.out.println(h1);
        System.out.println(h1.size());

    }
}
