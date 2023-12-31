//inseration order is preserved
// it uses hashtable datastructure
//It is implemented using doubly linked list internally

import java.util.ArrayList;
import java.util.LinkedHashSet;

class MyLinkedHashSet {

    public static void main(String[] args) {
        LinkedHashSet h1 = new LinkedHashSet();
        ArrayList<String> l1 = new ArrayList<String>(4);
        l1.add("something");
        l1.add("hello");
        h1.add("hello");
        h1.add("world");
        h1.add("coffee");
        h1.add("bob");
        System.out.println(h1);
        System.out.println(h1.contains("hello"));
        System.out.println(h1.hashCode());
        h1.addAll(l1);
        System.out.println(h1);

    }

}
