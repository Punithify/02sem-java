import java.util.ArrayList;
import java.util.Iterator;

//ArrayList
class Collections {
    public static void main(String[] args) {
        ArrayList<String> l1 = new ArrayList<String>(4);
        l1.add("something");
        l1.add("hello");
        // System.out.println(l1.get(0));
        Iterator it = l1.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}